/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onerelmas.tttracker.service;

import com.onerelmas.tttracker.domain.Task;
import com.onerelmas.tttracker.vo.Result;
import java.util.List;

/**
 *
 * @author onere
 */
public interface TaskService {
    public Result<Task> store(
        Integer idTask,
        Integer idProject,
        String taskName,
        String actionUsername);

    public Result<Task> remove(Integer idTask, String actionUsername);
    public Result<Task> find(Integer idTask, String actionUsername);
    public Result<List<Task>> findAll(String actionUsername);
    
}
