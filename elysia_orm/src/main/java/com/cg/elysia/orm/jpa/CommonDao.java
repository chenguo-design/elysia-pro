package com.cg.elysia.orm.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;

public class CommonDao {

    @Autowired
    private EntityManager em;


    public <T,ID> T save(T entity,ID id){
        Class<CommonDao> commonDaoClass = CommonDao.class;
        SimpleJpaRepository<T,ID> sjr = new SimpleJpaRepository(entity.getClass(),em);
        return sjr.save(entity);
    }

}
