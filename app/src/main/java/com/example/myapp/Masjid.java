package com.example.myapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Masjid extends ListActivity {
    protected void onCreate (Bundle icircle){
        super.onCreate(icircle);
        String[] listMasjid = new String[] {"Masjid Agung An Nur","Masjid Ar Rahman", "Masjid Raudhatul Jannah","Masjid Abu Darda"};
        this.setListAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1,listMasjid));
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
            if (pilihan.equals("Masjid Agung An Nur")){
                a = new Intent(this,RSArifinAchmad.class);

            } else if (pilihan.equals("Masjid Ar Rahman"))
            {

            }

            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}
