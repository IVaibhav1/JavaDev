package com.collections.hashmap.assignment;
import java.util.*;



public class Main2 {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		Map<Psngr,Integer> map=new HashMap<Psngr,Integer>(); 
		
		 Psngr p1=new Psngr("children","vaibhav");
		 Psngr p2=new Psngr("crew","Agrahari");
		Psngr p3=new Psngr("adult","Rohit");
		Psngr p4=new Psngr("adult","Dhawan");
		Psngr p5=new Psngr("children","Kohli");
		Psngr p6=new Psngr("crew","Rishabh");
		 Psngr p7=new Psngr("children","Shreyas");
		Psngr p8=new Psngr("adult","Ishant");
		
		map.put(p1,p1.knowFare());
		map.put(p2,p2.knowFare());
		map.put(p3,p3.knowFare());
		map.put(p4,p4.knowFare());
		map.put(p5,p5.knowFare());
		map.put(p6,p6.knowFare());
		map.put(p7,p7.knowFare());
		map.put(p8,p8.knowFare());
		 
	    
	    for(Map.Entry<Psngr,Integer> entry:map.entrySet()){    
	        Psngr key=entry.getKey();  
	        int  b=entry.getValue();   
	        System.out.println(key+"\t-Fare:"+b);   
	    }
	    System.out.println("Total children:"+p5.getCh());
	    System.out.println("Total crew:"+p3.getCr());
	    System.out.println("Total adults:"+p2.getAd());	
		
	
	}
	
}