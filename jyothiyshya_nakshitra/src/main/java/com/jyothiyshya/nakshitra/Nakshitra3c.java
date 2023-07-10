package com.jyothiyshya.nakshitra;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public class Nakshitra3c {
public static void main(String []args) throws JSONException {
	
	JSONObject dinadipathulu = new JSONObject();
	
	List<JSONArray> nakshathragroups = new ArrayList<JSONArray>();
	nakshathragroups.add(new JSONArray().put("sunday"));

	List<JSONObject> sunday = new ArrayList<JSONObject>();
	List<JSONObject> monday = new ArrayList<JSONObject>();
	List<JSONObject> tuesday = new ArrayList<JSONObject>();
	List<JSONObject> wednesday = new ArrayList<JSONObject>();
	List<JSONObject> thursday = new ArrayList<JSONObject>();
	List<JSONObject> friday = new ArrayList<JSONObject>();
	List<JSONObject> saturday = new ArrayList<JSONObject>();
	
	List<String>sundayphala=new ArrayList<String>();
	sundayphala.add("udyogam");
	sundayphala.add("labham");
	sundayphala.add("visham");
	sundayphala.add("amrutham");
	sundayphala.add("sukham");
	sundayphala.add("dhanam");
	sundayphala.add("amrutham");
	sundayphala.add("visham");
	sundayphala.add("subam");
	sundayphala.add("amrutham");
	sundayphala.add("jwaram");
	sundayphala.add("rogam");
	sundayphala.add("kalaha");
	sundayphala.add("labham");
	sundayphala.add("udyogam");
	sundayphala.add("rogam");

	List<String>mondayphala=new ArrayList<String>();
	mondayphala.add("amrutham");
	mondayphala.add("visham");
	mondayphala.add("udyogam");
	mondayphala.add("labham");
	mondayphala.add("jwaram");
	mondayphala.add("amrutham");
	mondayphala.add("labham");
	mondayphala.add("dhanam");
	mondayphala.add("rogam");
	mondayphala.add("labham");
	mondayphala.add("udyogam");
	mondayphala.add("dhanam");
	mondayphala.add("rogam");
	mondayphala.add("amrutham");
	mondayphala.add("visham");
	mondayphala.add("jwaram");

	
	List<String>tuesdayphala=new ArrayList<String>();
	tuesdayphala.add("rogam");
	tuesdayphala.add("udyogam");
	tuesdayphala.add("jwaram");
	tuesdayphala.add("labham");
	tuesdayphala.add("amrutham");
	tuesdayphala.add("udyogam");
	tuesdayphala.add("visham");
	tuesdayphala.add("labham");
	tuesdayphala.add("jwaram");
	tuesdayphala.add("udyogam");
	tuesdayphala.add("kalaha");
	tuesdayphala.add("labham");
	tuesdayphala.add("rogam");
	tuesdayphala.add("labham");
	tuesdayphala.add("udyogam");
	tuesdayphala.add("dhanam");

	List<String>wednesdayphala=new ArrayList<String>();
	wednesdayphala.add("visham");
	wednesdayphala.add("amrutham");
	wednesdayphala.add("subham");
	wednesdayphala.add("udyogam");
	wednesdayphala.add("rogam");
	wednesdayphala.add("sukham");
	wednesdayphala.add("dhanam");
	wednesdayphala.add("amrutham");
	wednesdayphala.add("labham");
	wednesdayphala.add("rogam");
	wednesdayphala.add("visham");
	wednesdayphala.add("udyogam");
	wednesdayphala.add("subham");
	wednesdayphala.add("labham");
	wednesdayphala.add("dhanam");
	wednesdayphala.add("labham");
	
	List<String>thursdayphala=new ArrayList<String>();
	thursdayphala.add("udyogam");
	thursdayphala.add("visham");
	thursdayphala.add("jwaram");
	thursdayphala.add("labham");
	thursdayphala.add("amrutham");
	thursdayphala.add("visham");
	thursdayphala.add("kalaham");
	thursdayphala.add("jwaram");
	thursdayphala.add("subham");
	thursdayphala.add("rogam");
	thursdayphala.add("kalaha");
	thursdayphala.add("labham");
	thursdayphala.add("udyogam");
	thursdayphala.add("jwaram");
	thursdayphala.add("labham");
	thursdayphala.add("udyogam");
	
	List<String>fridayphala=new ArrayList<String>();
	fridayphala.add("rogam");
	fridayphala.add("jwaram");
	fridayphala.add("amrutham");
	fridayphala.add("kalaha");
	fridayphala.add("labham");
	fridayphala.add("subham");
	fridayphala.add("sukham");
	fridayphala.add("amrutham");
	fridayphala.add("amrutham");
	fridayphala.add("jwaram");
	fridayphala.add("kalaha");
	fridayphala.add("labham");
	fridayphala.add("subham");
	fridayphala.add("dhanam");
	fridayphala.add("amrutham");
	fridayphala.add("visham");
	
	List<String>saturdayphala=new ArrayList<String>();
	saturdayphala.add("visham");
	saturdayphala.add("amrutham");
	saturdayphala.add("jwaram");
	saturdayphala.add("udyogam");
	saturdayphala.add("subham");
	saturdayphala.add("labham");
	saturdayphala.add("dhanam");
	saturdayphala.add("labham");
	saturdayphala.add("visham");
	saturdayphala.add("udyogam");
	saturdayphala.add("subham");
	saturdayphala.add("amrutham");
	saturdayphala.add("kalaha");
	saturdayphala.add("rogam");
	saturdayphala.add("amrutham");
	saturdayphala.add("labham");
	
	int start_hr=6,end_hr=7,start_min=30,end_min=00;
	for(int i=0;i<16;i++) {
		start_min=start_min+end_min;
		end_min=start_min-end_min;
		start_min=start_min-end_min;
		if(i>0) {
			start_hr=end_hr;
		if(start_min==0) {
			end_hr=start_hr+1;
		}else {
			end_hr=end_hr+2;
		}
		}
		if(end_hr==24) {
			end_hr=0;
		}		
		
		sunday.add(new JSONObject().put("starttime", new JSONObject().put("hr",start_hr).put("min",start_min)).put("endtime", new JSONObject().put("hr",end_hr).put("min",end_min)).put("phala", sundayphala.get(i)));	
		monday.add(new JSONObject().put("starttime", new JSONObject().put("hr",start_hr).put("min",start_min)).put("endtime", new JSONObject().put("hr",end_hr).put("min",end_min)).put("phala", mondayphala.get(i)));
		tuesday.add(new JSONObject().put("starttime", new JSONObject().put("hr",start_hr).put("min",start_min)).put("endtime", new JSONObject().put("hr",end_hr).put("min",end_min)).put("phala", tuesdayphala.get(i)));
		wednesday.add(new JSONObject().put("starttime", new JSONObject().put("hr",start_hr).put("min",start_min)).put("endtime", new JSONObject().put("hr",end_hr).put("min",end_min)).put("phala", wednesdayphala.get(i)));
		thursday.add(new JSONObject().put("starttime", new JSONObject().put("hr",start_hr).put("min",start_min)).put("endtime", new JSONObject().put("hr",end_hr).put("min",end_min)).put("phala", thursdayphala.get(i)));
		friday.add(new JSONObject().put("starttime", new JSONObject().put("hr",start_hr).put("min",start_min)).put("endtime", new JSONObject().put("hr",end_hr).put("min",end_min)).put("phala", fridayphala.get(i)));
		saturday.add(new JSONObject().put("starttime", new JSONObject().put("hr",start_hr).put("min",start_min)).put("endtime", new JSONObject().put("hr",end_hr).put("min",end_min)).put("phala", saturdayphala.get(i)));

	}
	
	dinadipathulu.put("sunday", sunday);
	dinadipathulu.put("monday", monday);
	dinadipathulu.put("tuesday", tuesday);
	dinadipathulu.put("wednesday", wednesday);
	dinadipathulu.put("thursday", thursday);
	dinadipathulu.put("friday", friday);
	dinadipathulu.put("saturday", saturday);
	
//	System.out.println(dinadipathulu.toString(2));
	
	HashSet<String> goodResult=new HashSet<String>();
	goodResult.add("udyogam");
	goodResult.add("labham");
	goodResult.add("amrutham");
	goodResult.add("sukham");
	goodResult.add("dhanam");
	goodResult.add("subham");
	
	HashSet<String> badResult=new HashSet<String>();
	badResult.add("visham");
	badResult.add("jwaram");
	badResult.add("rogam");
	badResult.add("kalaham");
	badResult.add("kalaha");
	
	boolean flag=true;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the day you want to see good time for: ");
	String day=sc.nextLine();
	System.out.println("Enter the work you prefer to see good time for: ");
	String work=sc.nextLine();
	sc.close();
	JSONArray goodphalaforday = new JSONArray();
	JSONArray timeforgivenwork = new JSONArray();
	JSONArray badphalaforday = new JSONArray();
	JSONArray phalasforday  = dinadipathulu.getJSONArray(day);
	
	for(int i=0;i<phalasforday.length();i++) {
		JSONObject phalaforday = phalasforday.getJSONObject(i);
		String phala = phalaforday.getString("phala");
		if (goodResult.contains(phala)) {
			if (phala.contains(work)) {
				timeforgivenwork.put(phalaforday);
				flag=false;
			}
			goodphalaforday.put(phalaforday);
		}else {
			badphalaforday.put(phalaforday);
		}

//		if (phalaforday1.equals(work)) {
//			goodphalaforday.put(phalaforday1);	
//		}
//		if (phalaforwork.equals(work)) {
//			goodphalaforday.put(phalaforday1);
//			
//		}else {
//			badphalaforday.put(phalaforday1);
//		}
	}
//	for(int i=0;i<goodphalaforday.length();i++) {
//	JSONObject phalafordaytime = goodphalaforday.getJSONObject(i);
//	String strttime=phalafordaytime.getString("starttime");
//	String endtime=phalafordaytime.getString("endtime");
//	String phala=phalafordaytime.getString("phala");
//	if(phala.contains(work)) {
//	System.out.println("start time:"+strttime.indent(2));
//	System.out.println("start time:"+endtime.indent(2));
//	System.out.println("Phala:"+phala.indent(2));
//	flag=false;
//	}
//	
//	}
	if(flag){
		System.out.println("we couldnt find the phala for the gievn work. but here are the good phalas for day");
		System.out.println(goodphalaforday.toString(2));
	}else {
	System.out.println("############# Good time for given work #############");
		System.out.println(timeforgivenwork.toString(2));
	}
//	System.out.println("############# Good time for given day #############");
//	System.out.println(goodphalaforday.toString(2));
//	
//	System.out.println("############# Bad phalas for given day #############");
//	System.out.println(badphalaforday.toString(2));
//	

}
}