package in.dineshsunny.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import in.dineshsunny.awesomequotes.R;
import in.dineshsunny.model.Quote;

/**
 * Created by Macbook on 15/07/16.
 */

public class CustomAdapter
        extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder>{

    ArrayList<Quote> quotesList;

    public CustomAdapter(
            ArrayList<Quote> quotesList){
        this.quotesList = quotesList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

       View v =  LayoutInflater.
                from(parent.getContext()).
                inflate(
                        R.layout.item_card,parent,false
        );

        CustomViewHolder cv = new CustomViewHolder(v);

        return cv;
    }

    @Override
    public void onBindViewHolder(
            CustomViewHolder holder,
            int position) {

        holder.quoteText.setText(
                quotesList.get(position)
                        .getTitleText());

        holder.authorName.setText(
                quotesList.get(position).
                        getAuthorName());

    }

    @Override
    public int getItemCount() {
        return 5;
    }


    public class CustomViewHolder
            extends RecyclerView.ViewHolder{

        TextView quoteText;
        TextView authorName;

        public CustomViewHolder(View itemView) {
            super(itemView);

            quoteText = (TextView)
                    itemView.findViewById(
                            R.id.quoteText);

            authorName = (TextView)
                    itemView.findViewById(
                            R.id.authorName);
        }
    }

}
