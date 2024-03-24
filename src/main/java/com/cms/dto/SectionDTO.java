package com.cms.dto;

import com.cms.core.domain.Page;
import com.cms.core.domain.Section;
import com.cms.core.domain.TypeSectionEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public record SectionDTO(

        String name,
        TypeSectionEnum type) {

    @JsonIgnore
    public static List<SectionDTO> toResponses(List<Section> sections) {
        return sections.stream()
                .map(section1 -> new SectionDTO(section1.getName(), section1.getType()))
                .toList();
    }

    @JsonIgnore
    public static Page toEntity() {
        return null;
    }
}
