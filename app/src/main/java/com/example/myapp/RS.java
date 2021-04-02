package com.example.myapp;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.ListView;

public class RS extends ListActivity {
    protected void onCreate (Bundle icircle){
        super.onCreate(icircle);
        String[] listRS = new String[] {"Rumah Sakit Arifin Achmad","Rumah Sakit Ibnu Sina", "Rumah Sakit Eka Hospital","Rumah Sakit Aulia Hospital"};
        this.setListAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1,listRS));
    }

    protected void onListItemClick (ListView l,  View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Rumah Sakit Arifin Achmad")){
                a = new Intent(this,RSArifinAchmad.class);

            } else if (pilihan.equals("Rumah Sakit Ibnu Sina"))
            {

            }

            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}
