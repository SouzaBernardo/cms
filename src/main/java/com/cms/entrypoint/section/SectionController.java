package com.cms.entrypoint.section;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(SectionController.SECTIONS_ENDPOINT)
public class SectionController {
    public static final String SECTIONS_ENDPOINT = "/v1/sections";
}
