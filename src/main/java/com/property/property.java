package com.property;

public class property {
	private int ProId;
	private String proName;
	public int getId() {
		return ProId;
	}


	public void setId(int id) {
		this.ProId = id;
	}


	public String getProName() {
		return proName;
	}


	public void setProName(String proName) {
		this.proName = proName;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getDes() {
		return Des;
	}


	public void setDes(String des) {
		Des = des;
	}


	private String location;
	private int price;
	private String Des;
	
	
	public property(int propertyID, String propertyName, String location, int price, String description) {
		super();
		ProId = propertyID;
		proName = propertyName;
		this.location = location;
		this.price = price;
		Des = description;
	}

}
