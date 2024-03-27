package com.cms.dataprovider.page.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Entity
@Table(name = "page")
public class PageEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "page")
    private List<SectionEntity> structure;
}

