/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pridesys.demo;

import org.springframework.stereotype.Service;

/**
 *
 * @author LENOVO
 */
@Service
public class BusinessService {
    
    private DataService dataService;

    public BusinessService(DataService dataService) {
        super();
        this.dataService = dataService;
    }
    
    
    public int findGreatestFromAllData(){
        
    int [] data = dataService.RetreiveAllData(); 
    int greatest = Integer.MIN_VALUE; 
    for(int value : data){    
        if (value>greatest){
           greatest = value;
        }
    } 
    return greatest;
    }
    
    
}
