package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.UnknownHostException;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @InjectMocks
    private DemoApplication demoApplication;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testTest() throws UnknownHostException {

        String result = demoApplication.test();

        assertNotNull(result);
    }

}
