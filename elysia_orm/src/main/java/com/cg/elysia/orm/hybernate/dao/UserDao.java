package com.cg.elysia.orm.hybernate.dao;


import com.cg.elysia.common.model.UserModel;

import java.util.List;

public interface UserDao {

    boolean insert(UserModel userModel);

    boolean insertList(List<UserModel> UserModels);

    UserModel getById(Long id);

    List<UserModel> getByIds(List<Long> ids);

    boolean deleteById(Long id);

    boolean deleteByIds(List<Long> ids);
}
