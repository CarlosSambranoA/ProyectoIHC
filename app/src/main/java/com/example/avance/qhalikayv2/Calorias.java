package com.example.avance.qhalikayv2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.firebase.ui.storage.images.FirebaseImageLoader;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

public class Calorias extends AppCompatActivity implements View.OnClickListener {
    private ImageView[] imagenVegetal =new ImageView[5];
    private TextView vegetales;
    private StorageReference storage;
    private DatabaseReference data ;
    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_calorias);

        //mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        storage = FirebaseStorage.getInstance().getReference();
        //data = FirebaseDatabase.getInstance().getReference();

        imagenVegetal[0] = (ImageView)(ImageView)findViewById(R.id.brocoli);
        imagenVegetal[0].setOnClickListener(this);
        imagenVegetal[1] = (ImageView)(ImageView)findViewById(R.id.berenjena);
        imagenVegetal[1].setOnClickListener(this);
        imagenVegetal[2] = (ImageView)(ImageView)findViewById(R.id.zanahoria);
        imagenVegetal[2].setOnClickListener(this);
        imagenVegetal[3] = (ImageView)(ImageView)findViewById(R.id.espinaca);
        imagenVegetal[3].setOnClickListener(this);
        imagenVegetal[4] = (ImageView)(ImageView)findViewById(R.id.pimiento);
        imagenVegetal[4].setOnClickListener(this);


        vegetales = (TextView)findViewById(R.id.vegetalesMas);
        vegetales.setOnClickListener(this);

        mostrarFoto();

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.vegetalesMas : Intent intent = new Intent(this, Vegetales.class);
                                     startActivity(intent);
                                     break;
            case R.id.brocoli :   Intent intent2 = new Intent(this, Vegetales.class);
                                  startActivity(intent2);
                                  break;
        }
    }

    public void mostrarFoto(){
        StorageReference vegetal1 = storage.child("Vegetales/brocoli.jpg");
        StorageReference vegetal2 = storage.child("Vegetales/berenjena.jpg");
        StorageReference vegetal3 = storage.child("Vegetales/zanahoria.jpg");
        StorageReference vegetal4 = storage.child("Vegetales/espinaca.jpg");
        StorageReference vegetal5 = storage.child("Vegetales/pimiento.jpg");

        Glide.with(Calorias.this)
                .using(new FirebaseImageLoader())
                .load(vegetal1)
                .into(imagenVegetal[0]);

        Glide.with(Calorias.this)
                .using(new FirebaseImageLoader())
                .load(vegetal2)
                .into(imagenVegetal[1]);

        Glide.with(Calorias.this)
                .using(new FirebaseImageLoader())
                .load(vegetal3)
                .into(imagenVegetal[2]);

        Glide.with(Calorias.this)
                .using(new FirebaseImageLoader())
                .load(vegetal4)
                .into(imagenVegetal[3]);

        Glide.with(Calorias.this)
                .using(new FirebaseImageLoader())
                .load(vegetal5)
                .into(imagenVegetal[4]);
    }
}
