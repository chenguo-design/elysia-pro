package com.cg.elysia.service.account.service.impl;

import com.cg.elysia.common.converter.UserConverter;
import com.cg.elysia.common.dto.UserDTO;
import com.cg.elysia.common.model.UserModel;
import com.cg.elysia.orm.querydsl.UserDao;
import com.cg.elysia.service.account.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Override
    public boolean insert(UserDTO userDTO) {
        UserModel user = UserConverter.converter.toTarget(userDTO);
//        return userDao.insert(user);
//        try {
//            List<UserModel> users = userDao.findByIdInOrderByIdDesc(Arrays.asList(1L, 2L, 3L));
//            System.out.println(users);
//            List<UserModel> all = userDao.findAll(Sort.by("id").descending());
//            System.out.println(all);
//            UserModel save = userDao.save(user);
//            System.out.println(save);
//            return true;
//        }catch(Exception e){
//            e.printStackTrace();
//        }
        return false;
    }

    @Override
    public boolean insertList(List<UserDTO> userDTOs) {
        return false;
    }

    @Override
    public UserDTO getById(Long id) {
        UserModel model = userDao.getById(id);
        return UserConverter.converter.toSource(model);
    }

    @Override
    public List<UserDTO> getByIds(List<Long> ids) {
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
