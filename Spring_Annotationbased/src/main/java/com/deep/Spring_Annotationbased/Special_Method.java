package com.deep.Spring_Annotationbased;

public class Special_Method {

	private String observe;

	public String getObserve() {
		return observe;
	}

	public void setObserve(String observe) {
		this.observe = observe;
	}

	public Special_Method(String observe) {
		super();
		this.observe = observe;
	}

	@Override
	public String toString() {
		return "Special_Method [observe=" + observe + "]";
	}
}
