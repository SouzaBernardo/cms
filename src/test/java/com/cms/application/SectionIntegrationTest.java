package com.cms.application;

import com.cms.BaseIntegrationTest;
import com.cms.dataprovider.page.SectionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class SectionIntegrationTest extends BaseIntegrationTest {


    @Autowired
    private SectionRepository sectionRepository;

    @Test
    void test() {
        var sections = sectionRepository.findAll();
        assert sections.size() == 3;
    }
}
