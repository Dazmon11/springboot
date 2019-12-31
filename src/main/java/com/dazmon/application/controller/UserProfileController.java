package com.dazmon.application.controller;

import com.dazmon.application.entity.UserProfile;
import com.dazmon.application.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/userProfile")
public class UserProfileController {

    @Autowired
    private UserProfileService userProfileService;

    @RequestMapping(value="/getDazmon",method= RequestMethod.POST)
    public UserProfile getDazmon(String name) {
        return userProfileService.getDazmon(name);
    }

    @RequestMapping(value="/testGet",method=RequestMethod.GET)
    public UserProfile testGet(Integer id) {
        return userProfileService.testGet(id);
    }

    @RequestMapping(value = "/getUserProfileById",method = RequestMethod.POST)
    public List<UserProfile> getUserProfileById(String id) throws Exception {
        return userProfileService.getUserProfileById(id);
    }

}
