package com.bookmall.pojo;

public class Order {
	
	private int oid;
	private int cid;
	private int iid;
	private int count;
	private double subtoal;
	private String  state;
	
	public Order() {
		super();
	}
	public Order(int oid, int cid, int iid, int count, double subtoal, String state) {
		super();
		this.oid = oid;
		this.cid = cid;
		this.iid = iid;
		this.count = count;
		this.subtoal = subtoal;
		this.state = state;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getSubtoal() {
		return subtoal;
	}
	public void setSubtoal(double subtoal) {
		this.subtoal = subtoal;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
