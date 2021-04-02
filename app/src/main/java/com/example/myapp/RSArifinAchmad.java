package com.example.myapp;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RSArifinAchmad extends ListActivity {
    protected void onCreate (Bundle icircle){
        super.onCreate(icircle);
        String[] listAct = new String[] {"Call Center","SMS Center", "Driving Direction","Website","Info di Google","Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listAct));
    }

    protected void onListItemClick (ListView j, View v, int position, long id){
        super.onListItemClick(j, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Call Center")){
                String nomortel = "tel:(0761) 21618";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomortel));

            }
            else if (pilihan.equals("SMS Center"))
            {
                String sms= "Assalammualaikum";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:082346052906"));
                a.putExtra("sms_body", sms);


            } else if (pilihan.equals("Driving Direction"))
            {
                String lokasirs ="google.navigation:q=0.52338667648833, 101.45181823908572";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(lokasirs));
            } else if (pilihan.equals("Website"))
            {
                String website = "http://rsudarifinachmad.riau.go.id";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(website));
            } else if (pilihan.equals("Info di Google"))
            {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"Rumah Sakit Arifin Achmad");
            }
            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
