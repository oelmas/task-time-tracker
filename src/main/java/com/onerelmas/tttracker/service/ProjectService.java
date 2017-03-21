/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onerelmas.tttracker.service;

import com.onerelmas.tttracker.domain.Project;
import com.onerelmas.tttracker.vo.Result;
import java.util.List;

/**
 *
 * @author onere
 */
public interface ProjectService {
    
    public Result<Project> store(
        Integer idProject,
        Integer idCompany,
        String projectName,
        String actionUsername);

    public Result<Project> remove(Integer idProject, String actionUsername);
    public Result<Project> find(Integer idProject, String actionUsername);
    public Result<List<Project>> findAll(String actionUsername);
    
}
