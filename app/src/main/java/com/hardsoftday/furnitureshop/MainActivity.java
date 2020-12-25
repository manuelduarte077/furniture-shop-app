package com.hardsoftday.furnitureshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.hardsoftday.furnitureshop.adapter.CategoryAdapter;
import com.hardsoftday.furnitureshop.models.Category;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    CategoryAdapter categoryAdapter;
    RecyclerView categoryRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "Sofas"));
        categoryList.add(new Category(2, "Lamps"));
        categoryList.add(new Category(3, "Speakers"));
        categoryList.add(new Category(4, "Tables"));
        categoryList.add(new Category(5, "Phone"));
        setCategoryRecycler(categoryList);
    }


    private void setCategoryRecycler(List<Category> categoryList) {
        categoryRecycler = findViewById(R.id.recycler_category);
        RecyclerView.LayoutManager layoutManager =  new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        categoryRecycler.setLayoutManager(layoutManager);
        categoryAdapter = new CategoryAdapter(this, categoryList);
        categoryRecycler.setAdapter(categoryAdapter);
    }

}