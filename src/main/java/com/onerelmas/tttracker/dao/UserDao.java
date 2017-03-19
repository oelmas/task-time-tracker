/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onerelmas.tttracker.dao;

import com.onerelmas.tttracker.domain.User;
import java.util.List;

/**
 *
 * @author onere
 */
public interface UserDao extends GenericDao<User, String>{
    
    public List<User> findAll();
    
    public User findByUserNamePassword(String username, String password);
    public User findByUserName(String username);
    public User findByEmail(String email);

    public User findByUsername(String username);
    
}
