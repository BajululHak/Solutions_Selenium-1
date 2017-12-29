package com.htc.corejava.exam;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Person implements Serializable {

private String personName;
private int personAge;
private String personAddress;
private String insuranceType;
private double premium;




public Person(String name, int age,String address,String insType,double premium)
{
this.setPersonName(name);
this.setPersonAge(age);
this.setPersonAddress(address);
this.setInsuranceType(insType);
this.setPremium(premium);

}



public int getPersonAge() {
	return personAge;
}



public String getPersonAddress() {
	return personAddress;
}



public void setPersonAddress(String personAddress) {
	this.personAddress = personAddress;
}



public String getInsuranceType() {
	return insuranceType;
}



public void setInsuranceType(String insuranceType) {
	this.insuranceType = insuranceType;
}



public double getPremium() {
	return premium;
}



public void setPremium(double premium) {
	this.premium = premium;
}



public void setPersonAge(int personAge) {
	this.personAge = personAge;
}



public String getPersonName() {
	return personName;
}



public void setPersonName(String personName) {
	this.personName = personName;
}


	
}