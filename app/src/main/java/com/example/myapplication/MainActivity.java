package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private MyAdapter adapter;
    private String[] dataNama, dataHarga, dataSpec;
    private TypedArray dataImage;

    private RecyclerView rvLaptop;
    ArrayList<Laptop> laptops = new ArrayList<Laptop>();

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvLaptop = findViewById(R.id.Asus);
        rvLaptop.setHasFixedSize(true);

        laptops.addAll(DataLaptop.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView() {
        rvLaptop.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter myAdapter = new MyAdapter(laptops);
        rvLaptop.setAdapter(myAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_utama, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.profile:
                Toast.makeText(this, "Profile Berhasil", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }
}
