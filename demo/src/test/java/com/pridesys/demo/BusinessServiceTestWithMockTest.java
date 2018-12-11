/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pridesys.demo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when; 
import org.mockito.junit.MockitoJUnitRunner;

/**
 *
 * @author LENOVO
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class BusinessServiceTestWithMockTest {
    
    @Mock 
    DataService dataServiceMock;
    
    @InjectMocks
    BusinessService businessService;
    
    @Test
    public void test(){
         when(dataServiceMock.RetreiveAllData()).thenReturn(new int[]{23,34});
         assertEquals(34, businessService.findGreatestFromAllData());
    }
    @Test
    public void test2(){
         when(dataServiceMock.RetreiveAllData()).thenReturn(new int[]{23,77,11,150,978});
         assertEquals(978, businessService.findGreatestFromAllData());
    }
    
}
