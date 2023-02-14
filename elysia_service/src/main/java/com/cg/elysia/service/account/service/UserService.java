package com.cg.elysia.service.account.service;

import com.cg.elysia.common.dto.UserDTO;

import java.util.List;

public interface UserService {

    boolean insert(UserDTO userDTO);

    boolean insertList(List<UserDTO> userDTOs);

    UserDTO getById(Long id);

    List<UserDTO> getByIds(List<Long> ids);

    boolean deleteById(Long id);

    boolean deleteByIds(List<Long> ids);

}
