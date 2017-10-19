package br.learn.example.test;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.learn.example.RandomNumberService;

public class RandomNumberServiceTest {

	private RandomNumberService service;
	ApplicationContext context;

	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext(new String[] { "services.xml" });
		service = context.getBean(RandomNumberService.class);
	}

	@After
	public void tearDown() throws Exception {
		context = null;
	}

	@Test
	public void testGetNextRandomNumber() {
		assertNotNull("Service.random : ", service.getRandom());
		assertNotNull("Service could not return random number", service.getNextRandomNumber());
	}

}
