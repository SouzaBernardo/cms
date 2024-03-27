package com.cms.core.usecase;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BaseCrudUseCase <E, I> {

    E findById(I id);
    void deleteById(I id);
    E save(E entity);
    Page<E> findAll(Pageable pageable);

}
