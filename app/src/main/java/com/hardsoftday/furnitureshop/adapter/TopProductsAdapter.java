package com.hardsoftday.furnitureshop.adapter;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hardsoftday.furnitureshop.DetaillsProductActivity;
import com.hardsoftday.furnitureshop.R;
import com.hardsoftday.furnitureshop.models.TopProducts;

import java.util.List;

public class TopProductsAdapter extends RecyclerView.Adapter<TopProductsAdapter.ProductsViewHolder> {

    Context context;
    List<TopProducts> topProductsList;

    public TopProductsAdapter(Context context, List<TopProducts> topProductsList) {
        this.context = context;
        this.topProductsList = topProductsList;
    }

    @NonNull
    @Override
    public ProductsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.item_row_products, parent, false);
        return new ProductsViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductsViewHolder holder, int position) {

        holder.productName.setText(topProductsList.get(position).getProductsName());
        holder.productPrice.setText(topProductsList.get(position).getProductsPrice());
        holder.productImage.setImageResource(topProductsList.get(position).getImageUrl());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DetaillsProductActivity.class);

                Pair[] pairs = new Pair[1];
                pairs[0] = new Pair<View, String>(holder.productImage, "image");
                ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                context.startActivity(i, activityOptions.toBundle());
            }
        });

    }

    @Override
    public int getItemCount() {
        return topProductsList.size();
    }


    public static final class ProductsViewHolder extends RecyclerView.ViewHolder {

        TextView productName, productPrice;
        ImageView productImage;


        public ProductsViewHolder(@NonNull View itemView) {
            super(itemView);

            productName = itemView.findViewById(R.id.product_name);
            productPrice = itemView.findViewById(R.id.product_price);
            productImage = itemView.findViewById(R.id.image_url);
        }
    }


}
