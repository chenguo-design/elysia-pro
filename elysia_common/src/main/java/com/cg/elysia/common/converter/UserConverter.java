package com.cg.elysia.common.converter;

import com.cg.elysia.common.dto.UserDTO;
import com.cg.elysia.common.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface UserConverter extends BasicConverter<UserDTO, UserModel> {
    UserConverter converter = Mappers.getMapper(UserConverter.class);
}
