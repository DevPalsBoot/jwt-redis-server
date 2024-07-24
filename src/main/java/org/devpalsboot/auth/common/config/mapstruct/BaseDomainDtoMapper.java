package org.devpalsboot.auth.common.config.mapstruct;

import java.util.List;

public interface BaseDomainDtoMapper<M, D> {

    M toDomain(final D dto);

    D toDto(final M domain);

    List<D> toDto(List<M> list);

}
