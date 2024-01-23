package www.affaxerd.recyclerviewapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    //STEP 11: create the constructor class

    Context context;
    ArrayList<Item> items;

    public Adapter(Context context, ArrayList<Item> items){
        this.context=context;
        this.items=items;
    }

 //STEP 7: create an adapter class and implement the methods


    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //here we inflate the layout. (Giving a look to the rows)

        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.activity_main, parent,false);
        return new Adapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, int position) {
        //Here we assign values to the views  we created in the recycler_view_row layout file based on the position
        //of the recycler view

        holder.name.setText(items.get(position).getName());
        holder.email.setText(items.get(position).getEmail());
        holder.imageView.setImageResource(items.get(position).getImage());



    }

    @Override
    public int getItemCount() {
        //the recycler view just wants to know the number of items that want to be displayed
        return items.size();
    }
    //STEP 8: create the myViewHolder class and implement the constructor
    public static  class MyViewHolder extends RecyclerView.ViewHolder{
        //Here we are grbbing the view from the recycler_view_row layout file
        //kinda like in the oncreate method

        //STEP 9: initiate the views
        ImageView imageView;
        TextView name, email;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            //STEP 10: link them with the view ids

            imageView=itemView.findViewById(R.id.imageview);
            name=itemView.findViewById(R.id.name);
            email=itemView.findViewById(R.id.email);



        }
    }
}
