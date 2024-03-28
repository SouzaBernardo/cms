package com.cms;

import com.redis.testcontainers.RedisContainer;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.PortForwardingContainer;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.lifecycle.Startables;


@SpringBootTest
@SpringBootConfiguration
@EnableAutoConfiguration
@Profile({"test"})
public class BaseIntegrationTest {

    @ServiceConnection
    static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:latest")
            .withInitScript("./schema-test.sql");

    @ServiceConnection
    static RedisContainer redis = new RedisContainer("redis:latest");

    @DynamicPropertySource
    public static void setUp(DynamicPropertyRegistry registry) {
        Startables.deepStart(postgres).join();
        registry.add("spring.datasource.url", postgres::getJdbcUrl);
        registry.add("spring.datasource.username", postgres::getUsername);
        registry.add("spring.datasource.password", postgres::getPassword);
        registry.add("spring.data.redis.host", redis::getRedisHost);
        registry.add("spring.data.redis.port", redis::getRedisPort);

        postgres.start();
        redis.start();
    }

}
