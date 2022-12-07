package com.example.seniorengproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SettingsFragment extends Fragment {

    ListView list_view;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        list_view = (ListView) findViewById(R.id.list_view);
        list_view.setOnClickListener(new View.OnClickListener);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Profile");
        arrayList.add("Edit Profile");
        arrayList.add("Change Password");
        arrayList.add("Add a Payment Method");
        arrayList.add("Notifications");
        arrayList.add("Dark Mode");
        arrayList.add("About us");
        arrayList.add("Privacy Policy");
        arrayList.add("Terms and Conditions");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

        list_view.setAdapter(arrayAdapter);

        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView <?> adapterView, View view, int i, long l) {
                Toast.makeText(SettingsFragment.this, "clicked item:" + i + " " + arrayList.get(i).toString(), Toast.LENGTH_SHORT).show();
            }

        });

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_settings, container, false);
    }
}