/*
 * Copyright (c) 2014 Anzen Soluciones S.A. de C.V. Mexico D.F. All rights reserved. THIS
 * SOFTWARE IS CONFIDENTIAL INFORMATION PROPIETARY OF ANZEN SOLUCIONES. THIS INFORMATION SHOULD
 * NOT BE DISCLOSED AND MAY ONLY BE USED IN ACCORDANCE THE TERMS DETERMINED BY THE COMPANY
 * ITSELF.
 */
package com.test.rest.test;

import java.util.List;

/**
 * Object bean for test a simple mapping with dozzer
 * @author Javier Alexander Bravo Rosales(jbravor@anzen.com.mx)
 * @version 1.0
 * @since MFM 1.0
 */
public class UserDummy {

	private String name;

	private String firstName;

	private List<String> listaString;

	private int age;

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the listaString
	 */
	public List<String> getListaString() {
		return listaString;
	}

	/**
	 * @param listaString the listaString to set
	 */
	public void setListaString(List<String> listaString) {
		this.listaString = listaString;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserDummy [name=");
		builder.append(name);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", listaString=");
		builder.append(listaString);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}

}
