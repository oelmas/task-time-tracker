/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onerelmas.tttracker.dao;

import com.onerelmas.tttracker.domain.Company;
import java.util.List;

/**
 *
 * @author onere
 */
public interface CompanyDao extends GenericDao<Company, Integer>{
    
    public List<Company> findAll();
   
}
