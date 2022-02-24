package com.example.conteneur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class listcontainer extends AppCompatActivity {
    ListView listect;
    String [] compagnie= {"Maersk","MSC","Evergreen Maritime Corporation","CMA CGM","Titan Conteners"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listcontainer);

        listect=findViewById(R.id.listec);

        ListAdapter listAdapter=new ArrayAdapter<String>( this, android.R.layout.select_dialog_item,compagnie);
        listect.setAdapter(listAdapter);

        listect.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(listcontainer.this,detail.class);
                intent.putExtra("compagnie",compagnie[position]);
                intent.putExtra("positions",position);
                startActivity(intent);
            }
        });


    }
}