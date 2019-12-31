package com.dazmon.application.dao.impl;

import com.dazmon.application.base.baseImpl.BaseDaoImpl;
import com.dazmon.application.dao.UserProfileDao;
import com.dazmon.application.entity.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserProfileDaoImpl extends BaseDaoImpl<UserProfile> implements UserProfileDao {

    public String getMybatisMapperNamesapce() {
        return "profile.UserProfile.";
    }

    @Override
    public List<UserProfile> getUserProfileById(String id) throws Exception {
        return super.selectList(getMybatisMapperNamesapce().concat("getUserProfileById"),id);
    }

    @Override
    public UserProfile getUserProfileRedis(String id) throws Exception {
        return super.selectOne(getMybatisMapperNamesapce().concat("getUserProfileRedis"),id);
    }

}
