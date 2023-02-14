package com.cg.elysia.orm.hybernate.dao.impl;

import com.cg.elysia.common.model.UserModel;
import com.cg.elysia.orm.hybernate.dao.UserDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.stereotype.Component;


import java.util.List;

//@Component
public class UserDaoImpl implements UserDao {
    @Override
    public boolean insert(UserModel userModel) {
        SessionFactory sf = null;
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try{
            sf = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();            // 创建消息实例
            session.save(userModel);  									  // 保存用户到数据库
            tx.commit();  		                                  // 提交事务
            session.close();  		                              // 关闭Session
            sf.close();
            return true;
        }catch (Exception e) {
            StandardServiceRegistryBuilder.destroy( registry );
        }
        return false;
    }

    @Override
    public boolean insertList(List<UserModel> UserModels) {
        return false;
    }

    @Override
    public UserModel getById(Long id) {
        return null;
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
