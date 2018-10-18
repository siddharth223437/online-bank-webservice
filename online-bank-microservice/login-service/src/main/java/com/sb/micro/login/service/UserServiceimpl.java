package com.sb.micro.login.service;

import com.sb.micro.login.dao.UserDao;
import com.sb.micro.login.vo.AddressVO;
import com.sb.micro.login.vo.UsersVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void saveUser(UsersVO usersVO) {
        userDao.registerUser(usersVO);

    }
}
