package com.jsp.vehicle.chasis;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Vehicle {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

  private int id;
  private String name;
  private String brand;
  private String color;
  private int price;
  
  @OneToOne
  private Chasis chasis1;
  
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Chasis getChasis1() {
	return chasis1;
}
public void setChasis1(Chasis chasis1) {
	this.chasis1=chasis1;
}
  

}
