package com.cms.dto;

import com.cms.core.domain.Page;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public record PageDTO(
        String name,
        List<SectionDTO> structure
) {
    @JsonIgnore
    public static PageDTO toResponse(Page page) {
        return new PageDTO(page.getName(), SectionDTO.toResponses(page.getStructure()));
    }

    @JsonIgnore
    public static Page toEntity() {
        return null;
    }
}
