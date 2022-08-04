/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto_WebPatrones.service;

import com.proyecto_WebPatrones.dao.InternacionalesDao;
import com.proyecto_WebPatrones.domain.Internacionales;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lamec
 */
@Service
public class InternacionalesServicelmpl implements InternacionalesService {
    
    @Autowired
    private InternacionalesDao internacionalesDao;
    


    @Override
    @Transactional(readOnly = true)
    public List<Internacionales> getInternacionales() {
        return (List<Internacionales>) internacionalesDao.findAll();
    }

    @Override
    @Transactional
    public void save(Internacionales internacionales) {
        internacionalesDao.save(internacionales);
    }

    @Override
    @Transactional
    public void delete(Internacionales internacionales) {
        internacionalesDao.delete(internacionales);
    }

    @Override
    @Transactional(readOnly = true)
    public Internacionales getInternacionales(Internacionales internacionales) {
        return internacionalesDao.findById(internacionales.getIdNotiinternacional()).orElse(null);
    }
    
}
