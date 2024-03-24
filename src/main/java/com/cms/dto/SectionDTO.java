package com.cms.dto;

import com.cms.core.domain.Page;
import com.cms.core.domain.Sections;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public record SectionDTO(

        String name,
        String type) {

    @JsonIgnore
    public static List<SectionDTO> toResponses(List<Sections> sections) {
        return sections.stream()
                .map(sections1 -> new SectionDTO(sections1.name(), sections1.type()))
                .toList();
    }

    @JsonIgnore
    public static Page toEntity() {
        return null;
    }
}
