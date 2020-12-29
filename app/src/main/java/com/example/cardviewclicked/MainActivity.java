package com.example.cardviewclicked;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Book> lstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstBook = new ArrayList<>();
        lstBook.add(new Book("The Vegitarian", "Category Book","Description Book",R.drawable.c));
        lstBook.add(new Book("The Vegitarian", "Category Book","Description Book",R.drawable.android));
        lstBook.add(new Book("The Vegitarian", "Category Book","Description Book",R.drawable.c));
        lstBook.add(new Book("The Vegitarian", "Category Book","Description Book",R.drawable.c));
        lstBook.add(new Book("The Vegitarian", "Category Book","Description Book",R.drawable.c));

        RecyclerView myrv = findViewById(R.id.recyclerview_ID);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myAdapter);
    }
}