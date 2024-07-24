package org.devpalsboot.auth.common.config.mapstruct;

import java.util.List;

public interface BaseDomainMapper<D, E> {

    E toDomain(final D dto);

    D toDto(final E domain);

    List<D> toDto(List<E> list);

}
