package www.affaxerd.recyclerviewapplication;

import static android.os.Build.VERSION_CODES.UPSIDE_DOWN_CAKE;

import android.content.ClipData;
import android.content.Context;
import android.media.RouteListingPreference;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter <MyViewHolder>{

    Context context;
    List<RouteListingPreference.Item> items;

    public MyAdapter(Context context, List<RouteListingPreference.Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflating the views
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //sending items to view
        if (Build.VERSION.SDK_INT >= UPSIDE_DOWN_CAKE) {
            holder.nameView.setText(items.get(position).getCustomSubtextMessage());
            holder.emailView.setText(items.get(position).getCustomSubtextMessage());

            holder.imageView.setImageResource(items.get(position).getCustomSubtextMessage().length());

        }

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
