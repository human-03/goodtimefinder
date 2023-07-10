package com.jyothiyshya.nakshitra;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
public class test {
    public static void main(String[] args) throws JSONException {
        // Assuming your matrix data is represented as a 2D array
        String[][] matrixData = {
                {"John", "25", "phil"},
                {"30", "alice", "28"}
        };

        JSONObject json = new JSONObject();

        JSONArray rows = new JSONArray();

        // Iterate over the rows
        for (int i = 0; i < matrixData.length; i++) {
            JSONArray row = new JSONArray();

            // Iterate over the columns
            for (int j = 0; j < matrixData[i].length; j++) {
                JSONObject cell = new JSONObject();
                cell.put("name", matrixData[i][j]);
                row.put(cell);
            }
            rows.put(row);
        }

        json.put("data", rows);

        // Writing the JSON to a file or performing further operations
        
        System.out.println(json.toString());
    }
}
