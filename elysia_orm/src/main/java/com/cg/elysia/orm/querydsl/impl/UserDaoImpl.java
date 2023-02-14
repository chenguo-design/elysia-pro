package com.cg.elysia.orm.querydsl.impl;

import com.cg.elysia.common.model.QUserModel;
import com.cg.elysia.common.model.UserModel;
import com.cg.elysia.orm.querydsl.UserDao;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class UserDaoImpl implements UserDao {

    private JPAQueryFactory queryFactory;
    @PostConstruct  //指定初始化queryFactory
    public void init() {
        queryFactory = new JPAQueryFactory(entityManager);
    }
    @PersistenceContext
    private EntityManager entityManager;

    private QUserModel q = QUserModel.userModel;
    @Override
    public boolean insert(UserModel UserModel) {
        return true;
    }

    @Override
    public boolean insertList(List<UserModel> UserModels) {
        return false;
    }

    @Override
    public UserModel getById(Long id) {
        return  queryFactory.select(q).from(q).where(q.id.eq(id)).fetchFirst();
    }

    @Override
    public List<UserModel> getByIds(List<Long> ids) {
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public boolean deleteByIds(List<Long> ids) {
        return false;
    }
}
