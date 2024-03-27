package com.cms.core.domain;

import com.cms.dataprovider.page.domain.PageEntity;
import com.cms.dataprovider.page.domain.SectionEntity;
import com.cms.dataprovider.TypeSectionEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public record SectionDTO(

        String name,
        TypeSectionEnum type) {

    @JsonIgnore
    public static List<SectionDTO> toResponses(List<SectionEntity> sections) {
        return sections.stream()
                .map(section1 -> new SectionDTO(section1.getName(), section1.getType()))
                .toList();
    }

    @JsonIgnore
    public static PageEntity toEntity() {
        return null;
    }
}
