package com.campus.dao;


import com.campus.model.entity.Comment;

/**
 * @author JYC
 */
public interface CommentMapper {

    /**
     * 根据id删除评论
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入一条评论
     * @param record
     * @return
     */
    int insertComment(Comment record);

    /**
     *
     * @param record
     * @return
     */
    int insertSelective(Comment record);

    /**
     * 根据id查询一条评论
     * @param id
     * @return
     */
    Comment selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKeyWithBLOBs(Comment record);

    /**
     * 根据id更新一条评论
     * @param record
     * @return
     */
    int updateByPrimaryKey(Comment record);
}