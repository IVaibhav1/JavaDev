package com.collections.hashmap.assignment;
import java.util.*;   

class Psngr
{    
String passanger_type;
String name;
static int ad=0,cr=0,ch=0;

public Psngr(String passanger_type, String name){
	super();
	this.passanger_type = passanger_type;
	this.name = name;
}

public Integer knowFare() {
	Ticket t=new Ticket();
   
   	if(passanger_type.equals("children")) {
   		t.setFare(300);
   	     this.ch++;}
   	    
   	else if(passanger_type.equals("crew")) { 
   		t.setFare(0);
   	    this.cr++;}
   	else if(passanger_type.equals("adult")) {
   		t.setFare(500);this.ad++;}
   	
   	
  return t.getFare();
   	   
}

public int getAd() {
	return ad;
}
public void setAd(int ad) {
	this.ad = ad;
}
public int getCr() {
	return cr;
}
public void setCr(int cr) {
	this.cr = cr;
}
public int getCh() {
	return ch;
}
public void setCh(int ch) {
	this.ch = ch;
}
@Override
public String toString() {
	return "Name:  "+name+"\t -"+passanger_type;
}   
}    