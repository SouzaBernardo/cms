package com.cms.dataprovider.page;

import com.cms.dataprovider.page.domain.PageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PageRepository extends JpaRepository<PageEntity, Integer> {
}
