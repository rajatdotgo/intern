package com.hey.Hello_world;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Autowired
	public HelloWorld helloworld;
	@Test
	public void test() {
		String str=helloworld.home();
		assertEquals(str,"Hello World");
	}

}
