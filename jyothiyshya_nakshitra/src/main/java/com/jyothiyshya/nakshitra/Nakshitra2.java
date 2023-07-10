package com.jyothiyshya.nakshitra;

import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public class Nakshitra2 {
public static void main(String []args) throws JSONException {
	
	JSONObject dinadipathulu = new JSONObject();
	
	List<JSONArray> nakshathragroups = new ArrayList<JSONArray>();
	nakshathragroups.add(new JSONArray().put("Sunday"));

	List<JSONObject> Sunday = new ArrayList<JSONObject>();
	Sunday.add(new JSONObject().put("6:00AM to 7:30AM", "Udyogam"));
	Sunday.add(new JSONObject().put("7:30AM to 9:00AM", "Labham"));
	Sunday.add(new JSONObject().put("9:00AM to 10:30AM", "Visham"));
	Sunday.add(new JSONObject().put("10:30AM to 12:00PM", "Amrutham"));
	Sunday.add(new JSONObject().put("12:00PM to 1:30PM", "Sukham"));
	Sunday.add(new JSONObject().put("13:30 to 15:00", "Dhanam"));
	Sunday.add(new JSONObject().put("15:00 to 16:30", "Amrutham"));
	Sunday.add(new JSONObject().put("16:30 to 18:00", "Visham"));
	Sunday.add(new JSONObject().put("6:00PM to 7:30PM", "Udyogam"));
	Sunday.add(new JSONObject().put("7:30PM to 9:00PM", "Labham"));
	Sunday.add(new JSONObject().put("9:00PM to 10:30PM", "Visham"));
	Sunday.add(new JSONObject().put("10:30PM to 12:00AM", "Amrutham"));
	Sunday.add(new JSONObject().put("12:00AM to 1:30AM", "Sukham"));
	Sunday.add(new JSONObject().put("1:30AM to 3:00AM", "Dhanam"));
	Sunday.add(new JSONObject().put("3:00AM to 4:30AM", "Amrutham"));
	Sunday.add(new JSONObject().put("4:30AM to 6:00AM", "Visham"));
	
	
	List<JSONObject> Monday = new ArrayList<JSONObject>();
	Monday.add(new JSONObject().put("6:00AM to 7:30AM", "Amrutham"));
	Monday.add(new JSONObject().put("7:30AM to 9:00AM", "Visham"));
	Monday.add(new JSONObject().put("9:00AM to 10:30AM", "Udyogam"));
	Monday.add(new JSONObject().put("10:30AM to 12:00PM", "Labham"));
	Monday.add(new JSONObject().put("12:00PM to 1:30PM", "Jwaram"));
	Monday.add(new JSONObject().put("13:30 to 15:00", "Amrutham"));
	Monday.add(new JSONObject().put("15:00 to 16:30", "Labham"));
	Monday.add(new JSONObject().put("16:30 to 18:00", "Dhanam"));
	Monday.add(new JSONObject().put("6:00PM to 7:30PM", "Rogham"));
	Monday.add(new JSONObject().put("7:30PM to 9:00PM", "Labham"));
	Monday.add(new JSONObject().put("9:00PM to 10:30PM", "Udyogam"));
	Monday.add(new JSONObject().put("10:30PM to 12:00AM", "Dhanam"));
	Monday.add(new JSONObject().put("12:00AM to 1:30AM", "Rogham"));
	Monday.add(new JSONObject().put("1:30AM to 3:00AM", "Amrutham"));
	Monday.add(new JSONObject().put("3:00AM to 4:30AM", "Visham"));
	Monday.add(new JSONObject().put("4:30AM to 6:00AM", "Jwaram"));

	List<JSONObject> Tuesday = new ArrayList<JSONObject>();
	Tuesday.add(new JSONObject().put("6:00AM to 7:30AM", "Rogam"));
	Tuesday.add(new JSONObject().put("7:30AM to 9:00AM", "Udyogam"));
	Tuesday.add(new JSONObject().put("9:00AM to 10:30AM", "Jwaram"));
	Tuesday.add(new JSONObject().put("10:30AM to 12:00PM", "Labham"));
	Tuesday.add(new JSONObject().put("12:00PM to 1:30PM", "Amrutham"));
	Tuesday.add(new JSONObject().put("13:30 to 15:00", "Udyogam"));
	Tuesday.add(new JSONObject().put("15:00 to 16:30", "Visham"));
	Tuesday.add(new JSONObject().put("16:30 to 18:00", "Labham"));
	Tuesday.add(new JSONObject().put("6:00PM to 7:30PM", "Jwaram"));
	Tuesday.add(new JSONObject().put("7:30PM to 9:00PM", "Udyogam"));
	Tuesday.add(new JSONObject().put("9:00PM to 10:30PM", "Kalaha"));
	Tuesday.add(new JSONObject().put("10:30PM to 12:00AM", "Labham"));
	Tuesday.add(new JSONObject().put("12:00AM to 1:30AM", "Rogham"));
	Tuesday.add(new JSONObject().put("1:30AM to 3:00AM", "Labham"));
	Tuesday.add(new JSONObject().put("3:00AM to 4:30AM", "Udyogam"));
	Tuesday.add(new JSONObject().put("4:30AM to 6:00AM", "Dhanam"));
	
	List<JSONObject> Wednesday = new ArrayList<JSONObject>();
	Wednesday.add(new JSONObject().put("6:00AM to 7:30AM", "Visham"));
	Wednesday.add(new JSONObject().put("7:30AM to 9:00AM", "Amrutham"));
	Wednesday.add(new JSONObject().put("9:00AM to 10:30AM", "Subham"));
	Wednesday.add(new JSONObject().put("10:30AM to 12:00PM", "Udyogam"));
	Wednesday.add(new JSONObject().put("12:00PM to 1:30PM", "Rogham"));
	Wednesday.add(new JSONObject().put("13:30 to 15:00", "Sukham"));
	Wednesday.add(new JSONObject().put("15:00 to 16:30", "Dhanam"));
	Wednesday.add(new JSONObject().put("16:30 to 18:00", "Amrutham"));
	Wednesday.add(new JSONObject().put("6:00PM to 7:30PM", "Labham"));
	Wednesday.add(new JSONObject().put("7:30PM to 9:00PM", "Rogham"));
	Wednesday.add(new JSONObject().put("9:00PM to 10:30PM", "Visham"));
	Wednesday.add(new JSONObject().put("10:30PM to 12:00AM", "Udyogam"));
	Wednesday.add(new JSONObject().put("12:00AM to 1:30AM", "Subham"));
	Wednesday.add(new JSONObject().put("1:30AM to 3:00AM", "Labham"));
	Wednesday.add(new JSONObject().put("3:00AM to 4:30AM", "Dhanam"));
	Wednesday.add(new JSONObject().put("4:30AM to 6:00AM", "Labham"));
	

	List<JSONObject> Thursday = new ArrayList<JSONObject>();
	Thursday.add(new JSONObject().put("6:00AM to 7:30AM", "Udyogam"));
	Thursday.add(new JSONObject().put("7:30AM to 9:00AM", "Visham"));
	Thursday.add(new JSONObject().put("9:00AM to 10:30AM", "Jwaram"));
	Thursday.add(new JSONObject().put("10:30AM to 12:00PM", "Labham"));
	Thursday.add(new JSONObject().put("12:00PM to 1:30PM", "Amrutham"));
	Thursday.add(new JSONObject().put("13:30 to 15:00", "Visham"));
	Thursday.add(new JSONObject().put("15:00 to 16:30", "Kalaham"));
	Thursday.add(new JSONObject().put("16:30 to 18:00", "Jwaram"));
	Thursday.add(new JSONObject().put("6:00PM to 7:30PM", "Subham"));
	Thursday.add(new JSONObject().put("7:30PM to 9:00PM", "Rogham"));
	Thursday.add(new JSONObject().put("9:00PM to 10:30PM", "Kalaha"));
	Thursday.add(new JSONObject().put("10:30PM to 12:00AM", "Labham"));
	Thursday.add(new JSONObject().put("12:00AM to 1:30AM", "Udyogam"));
	Thursday.add(new JSONObject().put("1:30AM to 3:00AM", "Jwaram"));
	Thursday.add(new JSONObject().put("3:00AM to 4:30AM", "Labham"));
	Thursday.add(new JSONObject().put("4:30AM to 6:00AM", "Udyogam"));


	List<JSONObject> Friday = new ArrayList<JSONObject>();
	Friday.add(new JSONObject().put("6:00AM to 7:30AM", "Rogham"));
	Friday.add(new JSONObject().put("7:30AM to 9:00AM", "Jwaram"));
	Friday.add(new JSONObject().put("9:00AM to 10:30AM", "Amrutham"));
	Friday.add(new JSONObject().put("10:30AM to 12:00PM", "Kalaha"));
	Friday.add(new JSONObject().put("12:00PM to 1:30PM", "Labham"));
	Friday.add(new JSONObject().put("13:30 to 15:00", "Subham"));
	Friday.add(new JSONObject().put("15:00 to 16:30", "Sukham"));
	Friday.add(new JSONObject().put("16:30 to 18:00", "Amrutham"));
	Friday.add(new JSONObject().put("6:00PM to 7:30PM", "Amrutham"));
	Friday.add(new JSONObject().put("7:30PM to 9:00PM", "Jwaram"));
	Friday.add(new JSONObject().put("9:00PM to 10:30PM", "Kalaha"));
	Friday.add(new JSONObject().put("10:30PM to 12:00AM", "Labham"));
	Friday.add(new JSONObject().put("12:00AM to 1:30AM", "Subham"));
	Friday.add(new JSONObject().put("1:30AM to 3:00AM", "Dhanam"));
	Friday.add(new JSONObject().put("3:00AM to 4:30AM", "Amrutham"));
	Friday.add(new JSONObject().put("4:30AM to 6:00AM", "Visham"));
	

	List<JSONObject> Saturday = new ArrayList<JSONObject>();
	Saturday.add(new JSONObject().put("6:00AM to 7:30AM", "Visham"));
	Saturday.add(new JSONObject().put("7:30AM to 9:00AM", "Amrutham"));
	Saturday.add(new JSONObject().put("9:00AM to 10:30AM", "Jwaram"));
	Saturday.add(new JSONObject().put("10:30AM to 12:00PM", "Udyogam"));
	Saturday.add(new JSONObject().put("12:00PM to 1:30PM", "Subham"));
	Saturday.add(new JSONObject().put("13:30 to 15:00", "Labham"));
	Saturday.add(new JSONObject().put("15:00 to 16:30", "Dhanam"));
	Saturday.add(new JSONObject().put("16:30 to 18:00", "Labham"));
	Saturday.add(new JSONObject().put("6:00PM to 7:30PM", "Visham"));
	Saturday.add(new JSONObject().put("7:30PM to 9:00PM", "Udyogam"));
	Saturday.add(new JSONObject().put("9:00PM to 10:30PM", "Subham"));
	Saturday.add(new JSONObject().put("10:30PM to 12:00AM", "Amrutham"));
	Saturday.add(new JSONObject().put("12:00AM to 1:30AM", "Kalaha"));
	Saturday.add(new JSONObject().put("1:30AM to 3:00AM", "Rogam"));
	Saturday.add(new JSONObject().put("3:00AM to 4:30AM", "Amrutham"));
	Saturday.add(new JSONObject().put("4:30AM to 6:00AM", "Labham"));
	

	dinadipathulu.put("Sunday", Sunday);
	dinadipathulu.put("Monday", Monday);
	dinadipathulu.put("Tuesday", Tuesday);
	dinadipathulu.put("Wednesday", Wednesday);
	dinadipathulu.put("Thursday", Thursday);
	dinadipathulu.put("Friday", Friday);
	dinadipathulu.put("Saturday", Saturday);
	
	//System.out.println(dinadipathulu.toString(2));
	
	HashSet<String> GoodResult=new HashSet<String>();
	GoodResult.add("Udyogam");
	GoodResult.add("Labham");
	GoodResult.add("Amrutham");
	GoodResult.add("Sukham");
	GoodResult.add("Dhanam");
	GoodResult.add("Subham");
	System.out.println(GoodResult);
	
	HashSet<String> BadResult=new HashSet<String>();
	BadResult.add("Visham");
	BadResult.add("Jwaram");
	BadResult.add("Rogam");
	BadResult.add("Kalaham");
	BadResult.add("Kalaha");
	
	Map<String,List<JSONObject>> Days = new HashMap<String,List<JSONObject>>();
	Days.put("Sunday",Sunday);
	Days.put("Monday",Monday);
	Days.put("Tuesday",Tuesday);
	Days.put("Wednesday",Wednesday);
	Days.put("Thursday",Thursday);
	Days.put("Friday",Friday);
	Days.put("Saturday",Saturday);
	
	Iterator itr=Days.keySet().iterator();
	while(itr.hasNext()) {
		String key=itr.next().toString();
		List<JSONObject> value=Days.get(key);
		System.out.println(key+" ");
		
	}
	System.out.println();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Day");
	String Day=sc.nextLine();
    List<JSONObject>value=Days.get(Day);
	System.out.println(value);
    System.out.println();
	

    

/*	Set<Entry<String, List<JSONObject>>> set1 = Days.entrySet();
	System.out.println("Set Details:"+set1);
	
	if(((Map<String, List<JSONObject>>) value).values().equals(GoodResult)) {
		System.out.println("Auspecious"+((Map<String, List<JSONObject>>) value).values());
		
	}
	else {
		System.out.println("not auspecious");
	}
	*/
}
}