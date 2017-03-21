/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onerelmas.tttracker.service;

import com.onerelmas.tttracker.domain.TaskLog;
import com.onerelmas.tttracker.vo.Result;
import java.util.Date;
import java.util.List;

/**
 *
 * @author onere
 */
public interface TaskLogService {
    public Result<TaskLog> store(
        Integer idTaskLog,
        Integer idTask,
        String username,
        String taskDescription,
        Date taskLogDate,
        int taskMinutes,
        String actionUsername);

    public Result<TaskLog> remove(Integer idTaskLog, String actionUsername);
    public Result<TaskLog> find(Integer idTaskLog, String actionUsername);
    public Result<List<TaskLog>> findByUser(String username, Date startDate, Date endDate, String actionUsername);
    
}
