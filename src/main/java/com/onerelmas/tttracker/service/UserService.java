/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onerelmas.tttracker.service;

import com.onerelmas.tttracker.domain.User;
import com.onerelmas.tttracker.vo.Result;
import java.util.List;

/**
 *
 * @author onere
 */
public interface UserService {
        public Result<User> store(
        String username,
        String firstName,
        String lastName,
        String email,
        String password,
        Character adminRole,
        String actionUsername);

    public Result<User> remove(String username, String actionUsername);
    public Result<User> find(String username, String 
      actionUsername);
    public Result<List<User>> findAll(String actionUsername);
    public Result<User> findByUsernamePassword(String username, String password);
    
}
