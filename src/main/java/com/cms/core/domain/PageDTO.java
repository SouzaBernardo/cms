package com.cms.core.domain;

import com.cms.dataprovider.page.domain.PageEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public record PageDTO(
        String name,
        List<SectionDTO> structure
) {
    @JsonIgnore
    public static PageDTO toResponse(PageEntity pageEntity) {
        return new PageDTO(pageEntity.getName(), SectionDTO.toResponses(pageEntity.getStructure()));
    }

    @JsonIgnore
    public static PageEntity toEntity() {
        return null;
    }
}
