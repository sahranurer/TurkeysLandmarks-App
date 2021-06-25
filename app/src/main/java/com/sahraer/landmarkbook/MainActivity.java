package com.sahraer.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listview = findViewById(R.id.listview);

        //Data
        ArrayList<String> landmarkNames = new ArrayList<>();
        landmarkNames.add("İstanbul");
        landmarkNames.add("İzmir");
        landmarkNames.add("Edirne");
        landmarkNames.add("Bursa ");
        landmarkNames.add("Trabzon ");
        landmarkNames.add("Ankara ");
        landmarkNames.add("Denizli ");
        landmarkNames.add("Amasya ");
        landmarkNames.add("Mersin ");
        landmarkNames.add("Erzurum ");
        landmarkNames.add("Çanakkale ");



        ArrayList<String> locationName = new ArrayList<>();
        locationName.add("Kız Kulesi");
        locationName.add("Saat Kulesi");
        locationName.add("Selimiye Camii");
        locationName.add("Ulu Camii");
        locationName.add("Sümela Manastırı");
        locationName.add("Anıtkabir");
        locationName.add("Pamukkale Travertenleri");
        locationName.add("Kral Kaya Mezarları");
        locationName.add("Kızkalesi");
        locationName.add("Çifte Minareli Medrese");
        locationName.add("Şehitler Abidesi");


        Bitmap kizkulesi = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.kizkulesi);
        Bitmap saatkulesi = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.saatkulesi);
        Bitmap selimiyecamii = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.selimiyecamii);
        Bitmap ulucamii = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.ulucamii);
        Bitmap manastir = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.sumela);
        Bitmap anitkabir = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.anitkabir);
        Bitmap pamukkale = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.pamukkale);
        Bitmap kralkaya = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.kralkaya);
        Bitmap kizkalesi = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.kizkalesi);
        Bitmap medrese = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.medrese);
        Bitmap abide = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.abide);

        ArrayList<Bitmap> landmarksImage = new ArrayList<>();
        landmarksImage.add(kizkulesi);
        landmarksImage.add(saatkulesi);
        landmarksImage.add(selimiyecamii);
        landmarksImage.add(ulucamii);
        landmarksImage.add(manastir);
        landmarksImage.add(anitkabir);
        landmarksImage.add(pamukkale);
        landmarksImage.add(kralkaya);
        landmarksImage.add(kizkalesi);
        landmarksImage.add(medrese);
        landmarksImage.add(abide);




        
        
        
        
        
        
        
        
        
        //Listview
        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,landmarkNames);
        listview.setAdapter(arrayAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //System.out.println(landmarkNames.get(position));
               // System.out.println(locationName.get(position));
                Intent intent = new Intent(getApplicationContext(),DetailActivity.class);
                intent.putExtra("name",landmarkNames.get(position));
                intent.putExtra("location",locationName.get(position));
                Singleton singleton = Singleton.getInstance();
                singleton.setChosenImage(landmarksImage.get(position));
                startActivity(intent);
            }
        });

    }
}