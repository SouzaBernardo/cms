package com.cms.dataprovider.page.domain;

import com.cms.dataprovider.TypeSectionEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;

import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Entity
@Table(name = "section")
public class SectionEntity {
        @Id
        @GeneratedValue(strategy = IDENTITY)
        private Integer id;
        private String name;
        @Enumerated(EnumType.STRING)
        private TypeSectionEnum type;
        @ManyToOne
        @JoinColumn(name = "page_id")
        private PageEntity pageEntity;
}
