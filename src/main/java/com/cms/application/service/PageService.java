package com.cms.application.service;

import com.cms.core.repository.PageRepository;
import com.cms.dto.PageDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PageService {

    private final PageRepository pageRepository;

    public PageService(PageRepository pageRepository) {
        this.pageRepository = pageRepository;
    }

    public Page<PageDTO> getAllPages(Pageable pageable) {
        return pageRepository.findAll(pageable).map(PageDTO::toResponse);
    }
}
