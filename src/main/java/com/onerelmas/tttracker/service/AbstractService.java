/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onerelmas.tttracker.service;

import com.onerelmas.tttracker.dao.UserDao;
import com.onerelmas.tttracker.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author onere
 */
public class AbstractService {
     final protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected UserDao userDao;

    protected  final String USER_INVALID = "Not a valid user";
    protected  final String USER_NOT_ADMIN = "Not an admin user";

    protected boolean isValidUser(String username){

        User user = userDao.findByUsername(username);
        return user != null;
    }
    
   
}
