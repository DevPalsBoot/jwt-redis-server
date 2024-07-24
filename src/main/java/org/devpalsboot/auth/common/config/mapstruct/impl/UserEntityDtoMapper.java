package org.devpalsboot.auth.common.config.mapstruct.impl;

import org.devpalsboot.auth.common.config.mapstruct.BaseEntityDtoMapper;
import org.devpalsboot.auth.user.dto.UserDto;
import org.devpalsboot.auth.user.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface UserEntityDtoMapper extends BaseEntityDtoMapper<UserDto, UserEntity> {
}
