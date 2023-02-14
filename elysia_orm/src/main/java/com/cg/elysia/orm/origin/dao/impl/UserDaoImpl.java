package com.cg.elysia.orm.origin.dao.impl;

import com.cg.elysia.common.model.UserModel;
import com.cg.elysia.orm.origin.dao.UserDao;
import com.cg.elysia.orm.origin.dao.conn.ConnectionConfig;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

//@Component
public class UserDaoImpl implements UserDao, InitializingBean {

    private Connection connection;

    @Resource
    private ConnectionConfig connectionConfig;

    @Override
    public boolean insert(UserModel user) {
        String save="insert into user(phone,name,password,type)"+"values(?,?,?,?)";
        PreparedStatement pStatement;
        try {
            pStatement= connection.prepareStatement(save);
            //ֵ
            pStatement.setString(1, user.getPhone());
            pStatement.setString(2, user.getName());
            pStatement.setString(3, user.getPassword());
            pStatement.setString(4, user.getType());
            pStatement.executeUpdate();
            pStatement.close();
            return true;
        }
        catch (Exception e) {
            System.out.println("保存用户时出错");
            e.printStackTrace();
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

    @Override
    public void afterPropertiesSet(){
        try{
            Class.forName(connectionConfig.getDriver());
            this.connection = DriverManager.getConnection(connectionConfig.getUrl(),connectionConfig.getUsername(),
                    connectionConfig.getPassword());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
