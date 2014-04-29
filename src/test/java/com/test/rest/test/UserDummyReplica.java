/*
 * Copyright (c) 2014 Anzen Soluciones S.A. de C.V. Mexico D.F. All rights reserved. THIS
 * SOFTWARE IS CONFIDENTIAL INFORMATION PROPIETARY OF ANZEN SOLUCIONES. THIS INFORMATION SHOULD
 * NOT BE DISCLOSED AND MAY ONLY BE USED IN ACCORDANCE THE TERMS DETERMINED BY THE COMPANY
 * ITSELF.
 */
package com.test.rest.test;

import java.util.List;

/**
 * Object bean for test a simple mapping replica whit dozzer
 * @author Javier Alexander Bravo Rosales(jbravor@anzen.com.mx)
 * @version 1.0
 * @since MFM 1.0
 */
public class UserDummyReplica {

	private String nameReplica;

	private String firstNameReplica;

	private List<String> listaStringReplica;

	private int ageReplica;

	/**
	 * @return the ageReplica
	 */
	public int getAgeReplica() {
		return ageReplica;
	}

	/**
	 * @param ageReplica the ageReplica to set
	 */
	public void setAgeReplica(int ageReplica) {
		this.ageReplica = ageReplica;
	}

	/**
	 * @return the nameReplica
	 */
	public String getNameReplica() {
		return nameReplica;
	}

	/**
	 * @param nameReplica the nameReplica to set
	 */
	public void setNameReplica(String nameReplica) {
		this.nameReplica = nameReplica;
	}

	/**
	 * @return the firstNameReplica
	 */
	public String getFirstNameReplica() {
		return firstNameReplica;
	}

	/**
	 * @param firstNameReplica the firstNameReplica to set
	 */
	public void setFirstNameReplica(String firstNameReplica) {
		this.firstNameReplica = firstNameReplica;
	}

	/**
	 * @return the listaStringReplica
	 */
	public List<String> getListaStringReplica() {
		return listaStringReplica;
	}

	/**
	 * @param listaStringReplica the listaStringReplica to set
	 */
	public void setListaStringReplica(List<String> listaStringReplica) {
		this.listaStringReplica = listaStringReplica;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserDummyReplica [nameReplica=");
		builder.append(nameReplica);
		builder.append(", firstNameReplica=");
		builder.append(firstNameReplica);
		builder.append(", listaStringReplica=");
		builder.append(listaStringReplica);
		builder.append(", ageReplica=");
		builder.append(ageReplica);
		builder.append("]");
		return builder.toString();
	}

}
