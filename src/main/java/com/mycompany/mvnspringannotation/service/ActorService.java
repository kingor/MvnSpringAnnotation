/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvnspringannotation.service;

import com.mycompany.mvnspringannotation.domain.Actor;
import java.util.List;
import java.util.jar.Attributes;

import javax.annotation.Resource;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author asup
 */
@Service("actorService")
@Transactional
public class ActorService {
    
 //   protected static Logger logger = Logger.getLogger("service");
    
    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;
    
    public List<Actor> getAll(){
   //     logger.debug("get all Actor");
        
        Session session = sessionFactory.getCurrentSession();
        
        Query query = session.createQuery("FROM Actor");
        
        return query.list();
    }
}
