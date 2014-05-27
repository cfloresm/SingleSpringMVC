/*
 * Copyright (c) 2014 Anzen Soluciones S.A. de C.V. Mexico D.F. All rights reserved. THIS
 * SOFTWARE IS CONFIDENTIAL INFORMATION PROPIETARY OF ANZEN SOLUCIONES. THIS INFORMATION SHOULD
 * NOT BE DISCLOSED AND MAY ONLY BE USED IN ACCORDANCE THE TERMS DETERMINED BY THE COMPANY
 * ITSELF.
 */
package com.test.rest.test;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Class test for mapping basic attributes an list attributes inside beans
 * @author Javier Alexander Bravo Rosales(jbravor@anzen.com.mx)
 * @version 1.0
 * @since MFM 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("classpath:mvc-dispatcher-servlet.xml")
public class DozzerTest {

	// Class injected for spring. This class make of match between objects
	private static DozerBeanMapper dozzerMapper;

	@Autowired
	private WebApplicationContext wac;

	protected MockMvc mockMvc;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	/**
	 * Method for inject method with state static
	 */
	@Autowired
	public void setDatabaseConfig(DozerBeanMapper dozzerMapper) {
		DozzerTest.dozzerMapper = dozzerMapper;
	}

	// Method for look a simple mapping between objects, pass data from object A to object B
	@Test
	public void dozzer() {

		UserDummy userDummy = new UserDummy();
		UserDummyReplica userReplica;
		List<String> listaNombres = new ArrayList<String>();

		userDummy.setAge(17);
		userDummy.setFirstName("King");
		userDummy.setName("Sthephen");
		listaNombres.add("Pablo Neruda");
		listaNombres.add("Antonio Gamoneda");
		listaNombres.add("Sergio Pitol");

		userDummy.setListaString(listaNombres);
		userReplica = dozzerMapper.map(userDummy, UserDummyReplica.class);
		System.out.println("Result mapping: " + userReplica);
		// invoke
		DozzerTest.getDozzerMapping();
	}

	/**
	 * Test static, is the same logic with dozzer but inside method static.
	 */
	public static void getDozzerMapping() {

		System.out.println("Static test init ");
		UserDummy userDummy = new UserDummy();
		UserDummyReplica userReplica;
		List<String> listaNombres = new ArrayList<String>();

		userDummy.setAge(21);
		userDummy.setFirstName("King");
		userDummy.setName("Lion");

		listaNombres.add("Pedro Neruda");
		listaNombres.add("Andrea Cardenas");
		listaNombres.add("Rosario Carbajal");

		userDummy.setListaString(listaNombres);

		userReplica = dozzerMapper.map(userDummy, UserDummyReplica.class);
		System.out.println("Static test end " + userReplica);

	}

}
