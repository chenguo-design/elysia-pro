package com.cg.elysia.orm.jpa;

import com.cg.elysia.common.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface UserDao extends JpaRepository<UserModel,Long> {

    List<UserModel> findByIdInOrderByIdDesc(List<Long> ids);

}