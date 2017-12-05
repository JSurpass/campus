package com.campus.dao;


import com.campus.model.entity.Notice;

/**
 * @author JYC
 */
public interface NoticeMapper {
    /**
     * 根据id删除公告/通知消息
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增一条通知
     * @param record
     * @return
     */
    int insertNotice(Notice record);

    /**
     *
     * @param record
     * @return
     */
    int insertSelective(Notice record);

    /**
     * 根据id查询一条通知信息
     * @param id
     * @return
     */
    Notice selectByPrimaryKey(Integer id);

    /**
     * 更新通知信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKeyWithBLOBs(Notice record);

    /**
     * 根据id更新通知
     * @param record
     * @return
     */
    int updateByPrimaryKey(Notice record);
}