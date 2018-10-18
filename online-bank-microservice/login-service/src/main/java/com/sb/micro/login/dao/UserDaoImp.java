package com.sb.micro.login.dao;

import com.sb.micro.login.vo.AddressVO;
import com.sb.micro.login.vo.UsersVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@Transactional
public class UserDaoImp implements UserDao {

    @Autowired
    private EntityManager em;

    @Override
    public void registerUser(UsersVO usersVO) {
        if(usersVO != null){
            for(AddressVO a : usersVO.getAddressVO()){
                a.setUserVO(usersVO);
                em.persist(a);
            }

        }

    }
}
