package com.jyothiyshya.nakshitra;

import java.util.HashSet;

import org.codehaus.jettison.json.JSONObject;

public class SampleHashSet {
	public static void main(String[] args) {
		
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("Udyogam");
		hs1.add("Labham");
		hs1.add("Amrutham");
		hs1.add("Sukham");
		hs1.add("Dhanam");
		hs1.add("Subham");
		System.out.println(hs1);
		
		HashSet<String> hs2=new HashSet<String>();
		hs2.add("Udyogam");
		hs2.add("Visham");
		hs2.add("Jwaram");
		hs2.add("Labham");
		hs2.add("Amrutham");
		hs2.add("Visham");
		hs2.add("Kalaham");
		hs2.add("Jwaram");
		hs2.add("Subham");
		hs2.add("Rogham");
		hs2.add("Kalaha");
		hs2.add("Labham");
		hs2.add("Udyogam");
		hs2.add("Jwaram");
		hs2.add("Labham");
		hs2.add("Udyogam");
		
		if(hs2.equals(hs1))
		{
			System.out.println("Auspecious");
		}
		else {
			System.out.println("not auspecious");
		}
		
		boolean result;
		result=hs2.contains(hs1);
		System.out.println(result);
	}	
		
	}

