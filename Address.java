package com;

public class Address {
    private String houseno;
    private String roadno;
    private String  Street;
	public String getHouseno() {
		return houseno;
	}
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	public String getRoadno() {
		return roadno;
	}
	public void setRoadno(String roadno) {
		this.roadno = roadno;
	}
	@Override
	public String toString() {
		return "Address [houseno=" + houseno + ", roadno=" + roadno + ", Street=" + Street + "]";
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
}
