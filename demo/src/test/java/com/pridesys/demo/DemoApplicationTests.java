package com.pridesys.demo;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
            Assert.assertEquals(44,44);
         
	}
        @Test
	public void test() {
            Assert.assertEquals(11,11);
         
	}

}
