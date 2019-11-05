package com.lab.android_4a;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jakewharton.picasso.OkHttp3Downloader;
import com.lab.android_4a.model.Comic;
import com.squareup.picasso.Picasso;

public class ComicListAdapter extends RecyclerView.Adapter<ComicListAdapter.MyViewHolder> {
    private List<Comic> dataList;
    private Context context;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView txtHeader;
        public TextView txtFooter;
        public View layout;
        private ImageView coverImage;

        public MyViewHolder(View v) {
            super(v);
            layout = v;
            txtHeader = (TextView) v.findViewById(R.id.firstLine);
            txtFooter = (TextView) v.findViewById(R.id.secondLine);
            coverImage = (ImageView) v.findViewById(R.id.icon);
        }
    }

    //add item to position
    /*public void add(int position, String item) {
        dataList.add(position, RetroPhoto());
        notifyItemInserted(position);
    }*/

    public void remove(int position) {
        dataList.remove(position);
        notifyItemRemoved(position);
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public ComicListAdapter(Context context, List<Comic> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ComicListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.row_layout, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        // get element from your dataset at this position
        // replace the contents of the view with that element
        final String name = dataList.get(position).getTitle();

        Picasso.Builder builder = new Picasso.Builder(context);
        builder.downloader(new OkHttp3Downloader(context));
        builder.build().load(dataList.get(position).getImg())
                .placeholder(R.drawable.ic_launcher_background).error(R.drawable.ic_launcher_background).into(holder.coverImage);
        holder.txtHeader.setText(name);

        holder.txtHeader.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                remove(position);
            }
        });

        holder.txtFooter.setText("Footer: " + name);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return dataList.size();
    }

}