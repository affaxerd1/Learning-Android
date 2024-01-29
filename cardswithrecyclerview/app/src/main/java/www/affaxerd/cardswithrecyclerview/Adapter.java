package www.affaxerd.cardswithrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    final Context ctx;
    List<String> abcd;
    List<Integer> abcdImg;
    LayoutInflater inflater;

    public Adapter(Context ctx, List<String> abcd, List<Integer> abcdImg ){
        this.abcd=abcd;
        this.abcdImg=abcdImg;
        this.inflater=LayoutInflater.from(ctx);
        this.ctx=ctx;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.activity_main2, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.abcd.setText(abcd.get(position));
        holder.abcdImg.setImageResource(abcdImg.get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context;
                Toast.makeText(ctx, abcd.get(position)+" is a wonderful car", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return abcd.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView abcd;
        ImageView abcdImg;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            abcd=itemView.findViewById(R.id.textView2);
            abcdImg=itemView.findViewById(R.id.imageView3);


        }
    }
}
