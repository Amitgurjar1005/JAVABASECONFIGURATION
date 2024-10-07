package com;

public class Emp {
      private int ecode;
      @Override
	public String toString() {
		return "Emp [ecode=" + ecode + ", name=" + name + ", address=" + address + "]";
	}
      void start() {
      System.out.println("WELCOME!");
      }
	public int getEcode() {
		return ecode;
	}
	public void setEcode(int ecode) {
		this.ecode = ecode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	private String name;
      private Address address;
}
