package com.collections.hashmap.assignment;
import java.util.*;



public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Map<Passengers,Integer> map=new HashMap<Passengers,Integer>(); 
		
		Passengers p[]=new Passengers[10];
		 p[0]=new Passengers("children","vaibhav");
		 p[1]=new Passengers("crew","Agrahari");
		 p[2]=new Passengers("adult","Rohit");
		 p[3]=new Passengers("adult","Dhawan");
		 p[4]=new Passengers("children","Kohli");
		 p[5]=new Passengers("crew","Rishabh");
		 p[6]=new Passengers("children","Shreyas");
		 p[7]=new Passengers("adult","Ishant");
		 int c=8;
		 Ticket t=new Ticket();
		 int f=0,ad=0,cr=0,ch=0;
	    for(int i=0;i<c;i++) {
	    	if(p[i].passanger_type.equals("children")) {
	    		t.setFare(300);
	    	    ch++;}
	    	else if(p[i].passanger_type.equals("crew")) {
	    		t.setFare(0);
	    	    cr++;}
	    	else if(p[i].passanger_type.equals("adult")) {
	    		t.setFare(500);
	    	    ad++;}
	    	
	    	   f=t.getFare();
	    	   map.put(p[i],f);
	    }
	    
	    for(Map.Entry<Passengers,Integer> entry:map.entrySet()){    
	        Passengers key=entry.getKey();  
	        int  b=entry.getValue();   
	        System.out.println(key+"\t-Fare:"+b);   
	    }
	    System.out.println("Total children:"+ch);
	    System.out.println("Total crew:"+cr);
	    System.out.println("Total adults:"+ad);	
		
	
	}
	
}
