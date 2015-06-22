package com.kdyzm.domain;


import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

public class Person implements HttpSessionActivationListener,Serializable{
	private String name;
	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	@Override
	public void sessionDidActivate(HttpSessionEvent se) {
		System.out.println(se.getSource()+" 从文件恢复到内存！");
	}

	@Override
	public void sessionWillPassivate(HttpSessionEvent se) {
		System.out.println(se.getSource()+" 从内存保存到文件！");
	}
}
