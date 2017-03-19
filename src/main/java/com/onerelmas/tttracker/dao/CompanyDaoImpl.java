/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onerelmas.tttracker.dao;

import com.onerelmas.tttracker.domain.Company;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author onere
 */
@Repository("companyDao")
@Transactional
public class CompanyDaoImpl extends GenericDaoImpl<Company, Integer> implements CompanyDao{

    public CompanyDaoImpl() {
        super(Company.class);
    }

    @Override
    @Transactional(readOnly = true,  propagation = Propagation.SUPPORTS)
    public List<Company> findAll() {

        return em.createNamedQuery("Company.findAll").getResultList();
    }
    
}
