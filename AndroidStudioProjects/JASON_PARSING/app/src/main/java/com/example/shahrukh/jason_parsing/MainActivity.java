package com.example.shahrukh.jason_parsing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    String JASON="{\"employee\":{\"nanme\":\"Example\":{\"contact\":\"1223345\",\"salary\":\"12234\"}}}";
    String name,salary,contact;
    TextView empName,empSalary,empContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        empName=(TextView)findViewById(R.id.textView);
        empContact=(TextView)findViewById(R.id.textView3);
        empSalary=(TextView)findViewById(R.id.textView2);

        try{

            JSONObject obj=new JSONObject(JASON);
            JSONObject employee=obj.getJSONObject("employee");
            name=employee.getString("name");
            contact=employee.getString("Contact");
            salary=employee.getString("salary");
            empName.setText("Name:"+name);
            empContact.setText("Contact"+contact);
            empSalary.setText("Salary:"+salary);


        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
