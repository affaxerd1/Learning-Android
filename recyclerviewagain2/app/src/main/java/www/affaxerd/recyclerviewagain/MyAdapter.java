package www.affaxerd.recyclerviewagain;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.security.PublicKey;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
//STEP 8: CREATE A LIST OF OUR MOVIES
    private List<Movie> movieList;
//STEP 9: CREATE A CONSTRUCTOR
    public MyAdapter(List<Movie> movieList) {
        this.movieList = movieList;
    }
//STEP 13: IMPLEMENT METHODS


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflate the view with the row design from movie_row.xml
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_row, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Movie movie=movieList.get(position);
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.date.setText(movie.getDate());

    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    //STEP 10 CLASS THAT ATTACHES TO THE ADAPTER CLASS: holds all our widgets
    public class MyViewHolder extends RecyclerView.ViewHolder{

//STEP 11: CREATE WIDGETS
    public TextView title, genre, date;

//STEP 12: INITIALIZE THE VIEWS IN A METHOD(WIDGETS)
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        title=itemView.findViewById(R.id.title_txt);
        genre=itemView.findViewById(R.id.genre_txt);
        date=itemView.findViewById(R.id.date_txt);


    }
}

}
