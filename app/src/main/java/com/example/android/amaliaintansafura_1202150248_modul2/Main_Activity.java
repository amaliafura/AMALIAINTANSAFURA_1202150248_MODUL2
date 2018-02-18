package com.example.android.amaliaintansafura_1202150248_modul2;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

    public class Main_Activity extends AppCompatActivity {
        Intent intent = getIntent();


        private RecyclerView recyclerView;
        private RecyclerView.Adapter adapter;
        private RecyclerView.LayoutManager layoutManager;
        private ArrayList<String> JudulMenu;
        private ArrayList<Integer> GambarMenu;
        //Daftar Judul
        private String[] Judul = {"Bibimbap", "Bulgogi", "Basic Ramyeon"};
        //Daftar Gambar
        private int[] Gambar = {R.drawable.bibimbap, R.drawable.bulgogi, R.drawable.basicramyeon};

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            JudulMenu = new ArrayList<>();
            GambarMenu = new ArrayList<>();
            recyclerView = findViewById(R.id.recycler);
            DaftarItem();
            //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
            layoutManager = new LinearLayoutManager(this);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setHasFixedSize(true);
            adapter = new RecyclerViewAdapter(JudulMenu, GambarMenu);
            //Memasang Adapter pada RecyclerView
            recyclerView.setAdapter(adapter);
        }

        //Mengambil data dari Varibale Gambar dan Judul, lalu memasangnya pada list yang terhubung dengan Class Adapter
        private void DaftarItem(){
            for (int w=0; w<Judul.length; w++){
                GambarMenu.add(Gambar[w]);
                JudulMenu.add(Judul[w]);
            }
        }
    }