package com.campus.dao;

import com.campus.model.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author JYC
 */
public interface UserMapper {
    /**
     * 根据id删除用户信息
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入一条用户信息
     * @param record
     * @return
     */
    int insertOneUser(User record);

    /**
     * 插入选中的用户信息
     * @param record
     * @return
     */
    int insertSelective(User record);

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    User selectByPrimaryKey(Integer id);

    /**
     * 根据选中id更新用户信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * 根据id更新用户信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(User record);

    /**
     * 通过手机号查询用户
     * @param phone
     * @return
     */
    User getUserByPhone(String phone);

    /**
     * 根据用户id更新该用户商品数量
     * @param id
     * @param goodsNum
     * @return
     */
    int updateGoodsNum(@Param("id") Integer id, @Param("goodsNum") Integer goodsNum);

    /**
     * 查询用户集合
     * @return
     */
    public List<User> getUserList();
}