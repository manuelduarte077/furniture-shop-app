package com.hardsoftday.furnitureshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.hardsoftday.furnitureshop.adapter.CategoryAdapter;
import com.hardsoftday.furnitureshop.adapter.TopProductsAdapter;
import com.hardsoftday.furnitureshop.models.Category;
import com.hardsoftday.furnitureshop.models.TopProducts;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    CategoryAdapter categoryAdapter;
    RecyclerView categoryRecycler, productsItemRecycler;
    TopProductsAdapter topProductsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         *  Recycler Categorias
         */
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "Sofas"));
        categoryList.add(new Category(2, "Lamps"));
        categoryList.add(new Category(3, "Speakers"));
        categoryList.add(new Category(4, "Tables"));
        categoryList.add(new Category(5, "Phone"));
        setCategoryRecycler(categoryList);

        /**
         * Recycler productos
         */

        List<TopProducts> topProductsList = new ArrayList<>();
        topProductsList.add(new TopProducts("1", "PERGEL TRIPOD \nFLPOOR LAMP", "$ 224", R.drawable.products_1));
        topProductsList.add(new TopProducts("2", "RETRO INDUSTRIAL \nFLOOR LAMP", "$ 125", R.drawable.products_1));
        topProductsList.add(new TopProducts("1", "PERGEL TRIPOD \nFLPOOR LAMP", "$ 224", R.drawable.products_1));
        topProductsList.add(new TopProducts("2", "RETRO INDUSTRIAL \nFLOOR LAMP", "$ 125", R.drawable.products_1));
        setProductsRecycler(topProductsList);

    }

    private void setCategoryRecycler(List<Category> categoryList) {
        categoryRecycler = findViewById(R.id.recycler_category);
        RecyclerView.LayoutManager layoutManager =  new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        categoryRecycler.setLayoutManager(layoutManager);
        categoryAdapter = new CategoryAdapter(this, categoryList);
        categoryRecycler.setAdapter(categoryAdapter);
    }

    private void setProductsRecycler (List<TopProducts> topProductsList) {

        productsItemRecycler = findViewById(R.id.recycler_products);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        productsItemRecycler.setLayoutManager(layoutManager);
        topProductsAdapter = new TopProductsAdapter(this, topProductsList);
        productsItemRecycler.setAdapter(topProductsAdapter);

    }

}