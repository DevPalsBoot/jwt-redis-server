package org.devpalsboot.auth.common.config.mapstruct;

import java.util.List;

public interface BaseEntityMapper<D, E> {

    E toEntity(final D dto);

    D toDto(final E entity);

    List<D> toDto(List<E> list);

}
