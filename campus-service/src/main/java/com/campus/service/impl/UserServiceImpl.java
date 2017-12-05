package com.campus.service.impl;

import com.campus.service.UserService;
import com.campus.model.entity.User;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;

/**
 * @author JYC
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUserByPhone(String phone) {
        return null;
    }

    @Override
    public void updateUserInfo(User user) {

    }

    @Override
    public int updateGoodsNum(Integer id, Integer goodsNum) {
        return 0;
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<User> getPageUser(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public int getUserNum() {
        return 0;
    }

    @Override
    public InputStream getInputStream() throws Exception {
        return null;
    }
}
