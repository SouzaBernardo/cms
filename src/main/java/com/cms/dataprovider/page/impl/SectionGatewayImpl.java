package com.cms.dataprovider.page.impl;

import com.cms.core.gateway.section.SectionGateway;
import com.cms.dataprovider.page.SectionRepository;
import com.cms.dataprovider.page.domain.SectionEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class SectionGatewayImpl implements SectionGateway {

    private final SectionRepository sectionRepository;

    public SectionGatewayImpl(SectionRepository sectionRepository) {
        this.sectionRepository = sectionRepository;
    }

    public Optional<SectionEntity> findById(Integer id) {
        // todo: add redis
        return sectionRepository.findById(id);
    }

    @Transactional
    public void deleteById(Integer id) {
        // todo add redis update
        sectionRepository.deleteById(id);
    }

    @Transactional
    public SectionEntity save(SectionEntity entity) {
        // todo add redis update
        return sectionRepository.save(entity);
    }
}
