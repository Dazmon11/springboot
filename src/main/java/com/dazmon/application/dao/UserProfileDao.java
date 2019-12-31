package com.dazmon.application.dao;

import com.dazmon.application.base.BaseDao;
import com.dazmon.application.entity.UserProfile;

import java.util.List;

public interface UserProfileDao extends BaseDao<UserProfile> {
    public List<UserProfile> getUserProfileById(String id) throws Exception;
}
