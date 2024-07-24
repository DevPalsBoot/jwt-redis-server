package org.devpalsboot.auth.common.config.mapstruct.impl;

import org.devpalsboot.auth.common.config.mapstruct.BaseDomainMapper;
import org.devpalsboot.auth.user.domain.User;
import org.devpalsboot.auth.user.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface UserDomainDomainMapper extends BaseDomainMapper<UserDto, User> {
}
