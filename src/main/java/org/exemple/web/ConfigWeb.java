package org.exemple.web;

import java.util.List;

import org.exemple.dao.ConfigRepository;
import org.exemple.entities.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigWeb {
    @Autowired
    private ConfigRepository configRepository;
    
    @RequestMapping(value="/getConfig",method=RequestMethod.GET) 
    public List<Config>getConfig(){
		return configRepository.findAll();
    	
    }
    
}
