package com.cms.core.usecase.section.impl;

import com.cms.core.gateway.section.SectionGateway;
import com.cms.core.usecase.section.SectionCrudUseCase;
import com.cms.dataprovider.page.domain.SectionEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SectionCrudUseCaseImpl implements SectionCrudUseCase {

    private final SectionGateway sectionGateway;

    public SectionCrudUseCaseImpl(SectionGateway sectionGateway) {
        this.sectionGateway = sectionGateway;
    }


    @Override
    public SectionEntity findById(Integer id) {
        return sectionGateway.findById(id).orElseThrow();
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public SectionEntity save(SectionEntity entity) {
        return null;
    }

    @Override
    public Page<SectionEntity> findAll(Pageable pageable) {
        return null;
    }
}
