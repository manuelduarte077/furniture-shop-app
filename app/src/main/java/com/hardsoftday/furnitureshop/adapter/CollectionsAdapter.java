package com.hardsoftday.furnitureshop.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hardsoftday.furnitureshop.R;
import com.hardsoftday.furnitureshop.models.Collections;

import java.util.List;

public class CollectionsAdapter extends RecyclerView.Adapter<CollectionsAdapter.CollectionsViewHolder> {

    Context context;
    List<Collections> collectionsList;

    public CollectionsAdapter(Context context, List<Collections> collectionsList) {
        this.context = context;
        this.collectionsList = collectionsList;
    }

    @NonNull
    @Override
    public CollectionsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_row_collections, parent, false);
        return new CollectionsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CollectionsViewHolder holder, int position) {

        holder.collectionsName.setText(collectionsList.get(position).getCollectionsName());
        holder.collectionsDes.setText(collectionsList.get(position).getCollectionsDesc());
        holder.collectionsPrice.setText(collectionsList.get(position).getCollectionsPrice());
        holder.collectionsImg.setImageResource(collectionsList.get(position).getCollectionsImg());

    }

    @Override
    public int getItemCount() {
        return collectionsList.size();
    }

    public static final class CollectionsViewHolder extends RecyclerView.ViewHolder {

        TextView collectionsName, collectionsDes, collectionsPrice;
        ImageView collectionsImg;

        public CollectionsViewHolder(@NonNull View itemView) {
            super(itemView);

            collectionsName = itemView.findViewById(R.id.collections_name);
            collectionsDes = itemView.findViewById(R.id.collections_desc);
            collectionsPrice = itemView.findViewById(R.id.collections_price);
            collectionsImg = itemView.findViewById(R.id.collections_img);

        }
    }

}
