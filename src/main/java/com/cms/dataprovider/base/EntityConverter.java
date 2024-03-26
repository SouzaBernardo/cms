package com.cms.dataprovider.base;

public interface EntityConverter <T, E> {
    E convertToEntity(T type);
    T convertToDTO(E type);
}
