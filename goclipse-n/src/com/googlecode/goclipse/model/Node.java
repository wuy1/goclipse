package com.googlecode.goclipse.model;

import java.io.Serializable;

/**
 * 
 * @author steel
 *
 */
public class Node implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 480313969022613471L;
	
	private String name;
	private Type type;
	private int  line;

	/**
	 * 
	 * @return
	 */
	public int getLine() {
		return line;
	}

	/**
	 * 
	 * @param line
	 */
	public void setLine(int line) {
		this.line = line;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}

}