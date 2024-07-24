package org.devpalsboot.auth.common.config.mapstruct.impl;

import org.devpalsboot.auth.common.config.mapstruct.BaseDomainDtoMapper;
import org.devpalsboot.auth.user.domain.UserDomain;
import org.devpalsboot.auth.user.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface UserDomainDtoMapper extends BaseDomainDtoMapper<UserDomain, UserDto> {
}
