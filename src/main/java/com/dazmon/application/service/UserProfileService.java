package com.dazmon.application.service;

import com.dazmon.application.dao.UserProfileDao;
import com.dazmon.application.entity.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileService {
    @Autowired
    private UserProfileDao userProfileDao;

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

}