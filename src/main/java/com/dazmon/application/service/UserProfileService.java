package com.dazmon.application.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dazmon.application.dao.UserProfileDao;
import com.dazmon.application.entity.UserProfile;
import com.dazmon.application.redis.RedisCacheKeys;
import com.dazmon.application.redis.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileService {
    @Autowired
    private UserProfileDao userProfileDao;
    @Autowired
    private RedisUtil redisUtil;

    public UserProfile getDazmon(String name){
        UserProfile userProfile = new UserProfile();
        userProfile.setAge(20);
        userProfile.setName(name);
        userProfile.setRealname("RealDazmon");
        return userProfile;
    }

    public UserProfile testGet(Integer id) {
        UserProfile userProfile = new UserProfile();
        userProfile.setId(id);
        return userProfile;
    }

    public List<UserProfile> getUserProfileById(String id) throws Exception {
        return userProfileDao.getUserProfileById(id);
    }

    public UserProfile getUserProfileRedis(String id) throws Exception {
        UserProfile userProfile = JSON.toJavaObject((JSON) redisUtil.get(RedisCacheKeys.TEST_REDIS_USERPROFILE.concat(id)), UserProfile.class);
        if(userProfile == null){
            System.out.println("没有调用缓存");
            userProfile = userProfileDao.getUserProfileRedis(id);
            redisUtil.set(RedisCacheKeys.TEST_REDIS_USERPROFILE.concat(id),userProfile,86400);
        }
        return userProfile;
    }
}