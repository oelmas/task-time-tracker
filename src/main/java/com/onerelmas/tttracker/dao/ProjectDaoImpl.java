/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onerelmas.tttracker.dao;

import com.onerelmas.tttracker.domain.Project;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author onere
 */
@Repository("projectDao")
@Transactional
public class ProjectDaoImpl extends GenericDaoImpl<Project, Integer> implements ProjectDao{

    public ProjectDaoImpl() {
        super(Project.class);
    }

    @Override
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public List<Project> findAll() {

        return em.createNamedQuery("Project.findAll").getResultList();

    }
    
}
