package com.example.shahrukh.parsing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {


    TextView employeeName,employeeSalary;
    String Jason_String="{\"employee\":{\"name\":\"Shahrukh\",\"salary\":\"00\"}}";

    //"{\"employee\":{\"name\":\"Abhishek Saini\",\"salary\":65000}}";

    String salary,name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        employeeName=(TextView)findViewById(R.id.textView);
        employeeSalary=(TextView)findViewById(R.id.textView2);

        try{
            JSONObject obj=new JSONObject(Jason_String);
            JSONObject employee=obj.getJSONObject("employee");
            name=employee.getString("name");
            salary=employee.getString("salary");
            employeeName.setText("name"+name);
            employeeSalary.setText("salary"+salary);


        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
