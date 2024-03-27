package com.cms.entrypoint.page;

import com.cms.core.domain.PageDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping(PagesController.PAGE_ENDPOINT)
public class PagesController {
    public static final String PAGE_ENDPOINT = "/v1/pages";

//    private final PageService pageService;

//    public PagesController(PageService pageService) {
//        this.pageService = pageService;
//    }

    @GetMapping
    @ResponseStatus(OK)
    public Page<PageDTO> getAllPages(Pageable pageable) {
        return null;
    }

}
