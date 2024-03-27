package com.cms.dataprovider.page;

import com.cms.dataprovider.page.domain.SectionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository extends JpaRepository<SectionEntity, Integer> {
}
