package org.devpalsboot.auth.common.config.mapstruct.impl;

import org.devpalsboot.auth.common.config.mapstruct.BaseDomainEntityMapper;
import org.devpalsboot.auth.user.domain.UserDomain;
import org.devpalsboot.auth.user.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface UserDomainEntityMapper extends BaseDomainEntityMapper<UserDomain, UserEntity> {
}
