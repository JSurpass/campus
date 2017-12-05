package com.campus.service;

import com.campus.model.entity.User;

import java.io.InputStream;
import java.util.List;

/**
 * @author JYC
 */
public interface UserService {
    /**
     * 根据手机号查找用户
     * @param phone
     * @return
     */
    public User getUserByPhone(String phone);

    /**
     * 更新用户信息
     * @param user
     */
    public void updateUserInfo(User user);

    /**
     * 更新用户的商品数量
     * @param id
     * @param goodsNum
     * @return
     */
    int updateGoodsNum(Integer id, Integer goodsNum);

    /**
     * 根据id查找用户信息
     * @param id
     * @return
     */
    User selectByPrimaryKey(Integer id);

    /**
     * 查询当前当前页面的用户
     * @param pageNum
     * @param pageSize
     * @return
     */
    public List<User> getPageUser(int pageNum, int pageSize);

    /**
     * 获取用户数量
     * @return
     */
    public int getUserNum();

    /**
     * 获取流
     * @return
     * @throws Exception
     */
    InputStream getInputStream() throws Exception;
}
