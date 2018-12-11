/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pridesys.demo;

import org.springframework.stereotype.Repository;

@Repository
public class DataService {
    public int [] RetreiveAllData(){
        return new int[]{1,2};
    }
    
}
