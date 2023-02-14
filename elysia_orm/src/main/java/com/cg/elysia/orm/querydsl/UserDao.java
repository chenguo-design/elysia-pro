package com.cg.elysia.orm.querydsl;

import com.cg.elysia.common.model.UserModel;

import java.util.List;

public interface UserDao {


        boolean insert(UserModel UserModel);

        boolean insertList(List<UserModel> UserModels);

        UserModel getById(Long id);

        List<UserModel> getByIds(List<Long> ids);

        boolean deleteById(Long id);

        boolean deleteByIds(List<Long> ids);

}
