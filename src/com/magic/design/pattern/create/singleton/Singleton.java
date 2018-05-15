package com.magic.design.pattern.create.singleton;

public class Singleton {
	public static final Singleton instance = new Singleton();
	
	public static Singleton getInstance() {
		return instance;
	}
}
