package com.cms.entrypoint.controller;

import com.cms.application.service.PageService;
import com.cms.dto.PageDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/v1/pages")
public class PagesController {

    private final PageService pageService;

    public PagesController(PageService pageService) {
        this.pageService = pageService;
    }

    @GetMapping
    @ResponseStatus(OK)
    public Page<PageDTO> getAllPages(Pageable pageable) {
        return pageService.getAllPages(pageable);
    }

}
