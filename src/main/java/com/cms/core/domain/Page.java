package com.cms.core.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Entity
public class Page {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "page")
    private List<Section> structure;
}

