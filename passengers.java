package com.collections.hashmap.assignment;
import java.util.*;   

class Passengers
{    
String passanger_type;
String name;
public Passengers(String passanger_type, String name) {
	super();
	this.passanger_type = passanger_type;
	this.name = name;
	

}

@Override
public String toString() {
	return "Name:  "+name+"\t -"+passanger_type;
}
   
}    