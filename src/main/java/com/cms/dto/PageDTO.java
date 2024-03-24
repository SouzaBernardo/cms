package com.cms.dto;

import com.cms.core.domain.Page;
import com.fasterxml.jackson.annotation.JsonIgnore;

public record PageDTO(
        String name
) {
    @JsonIgnore
    public static PageDTO toResponse(Page page) {
        return new PageDTO(page.getName());
    }

    @JsonIgnore
    public static Page toEntity() {
        return null;
    }
}
