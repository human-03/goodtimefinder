package com.jyothiyshya.nakshitra;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public class NakshitraFull {
	
	public static void naskshitrafull(String dayNakshatra ,int hour,int min,String dayNakshatra1,String personNakshatra,String day,String work) throws JSONException {
	JSONObject dinadipathulu = new JSONObject();
	
	List<JSONArray> nakshathragroups = new ArrayList<JSONArray>();
	nakshathragroups.add(new JSONArray().put("ashwini").put("makha").put("moola"));
	nakshathragroups.add(new JSONArray().put("bharani").put("pubba").put("poorvashada"));
	nakshathragroups.add(new JSONArray().put("kruthika").put("uttara").put("uttarashada"));
	nakshathragroups.add(new JSONArray().put("rohini").put("hasta").put("sravana"));
	nakshathragroups.add(new JSONArray().put("mrugasira").put("chitta").put("dhanista"));
	nakshathragroups.add(new JSONArray().put("arudra").put("swati").put("satatara"));
	nakshathragroups.add(new JSONArray().put("punarvasu").put("visakha").put("purvabadra"));
	nakshathragroups.add(new JSONArray().put("pushyami").put("anuradha").put("uttarabadra"));
	nakshathragroups.add(new JSONArray().put("asresha").put("jyeshta").put("revathi"));
	
	List<JSONObject> grahas = new ArrayList<JSONObject>();
	grahas.add(new JSONObject().put("graha", "ravi").put("value", 1));
	grahas.add(new JSONObject().put("graha", "buda").put("value", 2));
	grahas.add(new JSONObject().put("graha", "rahu").put("value", 3));
	grahas.add(new JSONObject().put("graha", "guru").put("value", 4));
	grahas.add(new JSONObject().put("graha", "ketu").put("value", 5));
	grahas.add(new JSONObject().put("graha", "chandra").put("value", 6));
	grahas.add(new JSONObject().put("graha", "sani").put("value", 7));
	grahas.add(new JSONObject().put("graha", "sukra").put("value", 8));
	grahas.add(new JSONObject().put("graha", "kuja").put("value", 9));
	
	
	for (JSONArray nakshathragroup : nakshathragroups) {
		for ( int j = 0; j <nakshathragroup.length(); j++) {
			String nakshatra = nakshathragroup.getString(j);
			JSONObject nakshatraRow = createNakshatraRow(grahas, nakshathragroups);
			dinadipathulu.put(nakshatra, nakshatraRow);	
		}
		JSONObject lastGraha = grahas.remove(8);
		grahas.add(0, lastGraha);
	}
	
	
//	System.out.println(dinadipathulu.toString(2));
	
	
	/*
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Nakshatra for a date(ending): ");
	System.out.println("Enter Nakshatra ending time (hour)");
	int hour=sc.nextInt();
	System.out.println("Enter Nakshatra ending time (min)");
	int min=sc.nextInt();
	System.out.println("Enter Nakshatra for a date(starting): ");
	String dayNakshatra1 = sc.next();
	System.out.println("Enter Nakshatra for a person: ");
	String personNakshatra = sc.next();
	System.out.println("Enter the day you want to see good time for: ");
	String day=sc.next();
	System.out.println("Enter the work you prefer to see good time for(type all for all): ");
	String work=sc.next();
	sc.close();*/
	JSONObject personNakshatraDinadipatulu = dinadipathulu.getJSONObject(personNakshatra);
	
	JSONObject dayNakshatraDinadipatulu = personNakshatraDinadipatulu.getJSONObject(dayNakshatra);
	JSONObject dayNakshatraDinadipatulu1 = personNakshatraDinadipatulu.getJSONObject(dayNakshatra1);
	if(dayNakshatraDinadipatulu == null || dayNakshatraDinadipatulu1 == null) {
		throw new RuntimeException("No dinadipathulu found for given day nakshatra");
	}
	
	int dayValue = dayNakshatraDinadipatulu.getInt("value");
	int dayValue1 = dayNakshatraDinadipatulu1.getInt("value");
	if( dayValue % 2 == 0 || dayValue == 9 || dayValue == 1) {
		System.out.println(" The day for the given person is auspecious "+dayNakshatra+ "nakshitra from 12:00 till "+hour+" : "+min+dayNakshatraDinadipatulu.toString(2));
		GoodTimeWithDay time = new GoodTimeWithDay();
		time.goodtimeChecker(day, work, hour, min,1);
	}else {
		System.out.println(" The day for the given person is not auspecious from 00:00 till"+hour+": " +min +dayNakshatraDinadipatulu.toString(2));
	}
	if( dayValue1 % 2 == 0 || dayValue1 == 9 || dayValue1 == 1) {
		System.out.println(" The day for the given person is auspecious for "+dayNakshatra1+" nakshitra from  "+hour+" : "+min +" till 24:00"+ dayNakshatraDinadipatulu1.toString(2));
		GoodTimeWithDay time = new GoodTimeWithDay();
		time.goodtimeChecker(day, work, hour, min,0);
	}else {
		System.out.println(" The day for the given person is not  auspecious from "+hour+" : "+min+" till 24:00" + dayNakshatraDinadipatulu1.toString(2));
	}
	
	}
	private static JSONObject createNakshatraRow(List<JSONObject> grahas, List<JSONArray> nakshathragroups) throws JSONException {
		JSONObject nakshatraRow =  new JSONObject();
		
		for ( int i=0; i<grahas.size(); i++) {
			JSONObject graha = grahas.get(i);
			JSONArray nakshathragroup = nakshathragroups.get(i);
			for ( int j = 0; j <nakshathragroup.length(); j++) {
				String nakshatra = nakshathragroup.getString(j);
				nakshatraRow.put(nakshatra, graha);
			}
		}
		return nakshatraRow;
	}	
}