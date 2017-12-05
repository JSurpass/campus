package com.campus.dao;


import com.campus.model.entity.Reply;

/**
 * @author JYC
 */
public interface ReplyMapper {

    int deleteByPrimaryKey(Integer id);

    int insertReply(Reply record);

    int insertSelective(Reply record);

    Reply selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Reply record);

    int updateByPrimaryKeyWithBLOBs(Reply record);

    int updateByPrimaryKey(Reply record);
}