package com.cms.core.gateway;

import java.util.Optional;

public interface BaseGateway<E, I> {
    Optional<E> findById(I id);
    void deleteById(I id);
    E save(E entity);
}
