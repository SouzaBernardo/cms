package com.cms.core.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;

import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Entity
public class Section {
        @Id
        @GeneratedValue(strategy = IDENTITY)
        private Integer id;
        private String name;
        @Enumerated(EnumType.STRING)
        private TypeSectionEnum type;
        @ManyToOne
        @JoinColumn(name = "page_id")
        private Page page;
}
