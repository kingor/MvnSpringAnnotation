/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvnspringannotation.controller;

import com.mycompany.mvnspringannotation.domain.Actor;
import com.mycompany.mvnspringannotation.service.ActorService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author asup
 */
@Controller
@RequestMapping("/main")
public class MainController {

    @Resource(name = "actorService")
    private ActorService actorservice;
    
    @RequestMapping(value = "/actor", method = RequestMethod.GET)
    public String getActors(Model model){
        List<Actor> actors = actorservice.getAll();
        
        model.addAttribute("actors", actors);
        
        return "actorspage";
    }
}
