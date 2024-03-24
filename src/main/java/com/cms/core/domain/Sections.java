package com.cms.core.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import static jakarta.persistence.GenerationType.IDENTITY;

//@Entity
public record Sections(
//        @Id
//        @GeneratedValue(strategy = IDENTITY)
        Integer id,
        String name,
        String type) {
}
