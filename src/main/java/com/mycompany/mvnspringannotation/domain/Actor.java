/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvnspringannotation.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author asup
 */
@Entity
@Table(name = "ACTOR")
public class Actor implements Serializable{
    
    private static final long serialVersionUID = -5527566248002296042L;
    
    @Id
    @Column(name = "ACTOR_ID")
    @GeneratedValue
    private Long actorId;
    
    @Column(name = "FIRST_NAME")
    private String firstName;
    
    @Column(name = "LAST_NAME")
    private String lastName;
    
    public void setActorId(Long actorId){
        this.actorId = actorId;
    }
    
    public Long getActorId(){
        return actorId;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getLastName(){
        return lastName;
    }
}
