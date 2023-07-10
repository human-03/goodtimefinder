package com.jyothiyshya.nakshitra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public class Nakshitra {
public static void main(String []args) throws JSONException {
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
	
	
	System.out.println(dinadipathulu.toString(2));
	
	
	System.out.println("Enter Nakshatra for a date: \n");
	Scanner scanner = new Scanner(System.in);
	String dayNakshatra = scanner.nextLine();
	
	System.out.println("Enter Nakshatra for a person: \n");
	String personNakshatra = scanner.nextLine();
	JSONObject personNakshatraDinadipatulu = dinadipathulu.getJSONObject(personNakshatra);
	if(personNakshatraDinadipatulu == null ) {
		throw new RuntimeException("No dinadipathulu found for given person nakshatra");
	}
	JSONObject dayNakshatraDinadipatulu = personNakshatraDinadipatulu.getJSONObject(dayNakshatra);
	if(dayNakshatraDinadipatulu == null ) {
		throw new RuntimeException("No dinadipathulu found for given day nakshatra");
	}
	
	int dayValue = dayNakshatraDinadipatulu.getInt("value");
	
	if( dayValue % 2 == 0 || dayValue == 9 ) {
		System.out.println(" The day for the given person is auspecious " + dayNakshatraDinadipatulu.toString(2));
	}else {
		System.out.println(" The day for the given person is not  auspecious " + dayNakshatraDinadipatulu.toString(2));
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