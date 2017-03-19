/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onerelmas.tttracker.dao;

import com.onerelmas.tttracker.domain.Task;
import com.onerelmas.tttracker.domain.TaskLog;
import com.onerelmas.tttracker.domain.User;
import java.util.Date;
import java.util.List;

/**
 *
 * @author onere
 */
public interface TaskLogDao extends GenericDao<TaskLog, Integer>{
    
    public List<TaskLog> findByUser(User user, Date startDate, Date endDate);
    
    public long findTaskLogCountByTask(Task task);
    
    public long findTaskLogCountByUser(User user);
}
