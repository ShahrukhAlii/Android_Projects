package com.example.shahrukh.activityshared;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class FirstActivity extends AppCompatActivity {

    TextView empName,empSalary;
    TextView name;
    TextView salary;
    String Jason_String="{\"employee\":{\"name\":\"Shahrukh\":,\"Salary\":1000}}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        name=(TextView)findViewById(R.id.textView);
        salary=(TextView)findViewById(R.id.textView2);


        try{

            JSONObject object=new JSONObject(Jason_String);

            JSONObject emplloyee=object.getJSONObject("Employee");
            name=emplloyee.getString("Name");
            salary=emplloyee.getString("Salary");
            name.setText("Name"+name);
            salary.setText("Salary"+salary);


        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
