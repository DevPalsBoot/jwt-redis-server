package org.devpalsboot.auth.common.config.mapstruct;

import java.util.List;

public interface BaseDomainEntityMapper<D, E> {
    E toEntity(final D domain);

    D toDomain(final E entity);

    List<D> toDomain(List<E> list);
}
