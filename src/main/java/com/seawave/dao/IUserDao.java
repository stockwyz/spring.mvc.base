package com.seawave.dao;

import com.seawave.entity.UserT;
import java.util.List;

public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserT record);

    UserT selectByPrimaryKey(Integer id);

    List<UserT> selectAll();

    int updateByPrimaryKey(UserT record);
}