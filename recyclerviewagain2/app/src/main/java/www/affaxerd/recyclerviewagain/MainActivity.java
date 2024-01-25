package www.affaxerd.recyclerviewagain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//STEP 1: DECLARE THE RECYCLER VIEW
    RecyclerView recyclerView;

//STEP 3: i) CREATE AN MODEL CLASS----> UI that displayed the data provided by adapter
//STEP 4: CREATE AN ADAPTER
//STEP 7: CREATE AN ARRAYLIST THAT WILL  STORE THE DATA TO BE DISPLAYED
    ArrayList<Movie> movieList =new ArrayList<>();
//STEP 14: DECLARE THE ADAPTER
    MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// STEP 2: INSTANTIATE THE RECYCLER VIEW
        recyclerView=findViewById(R.id.recyclerview);

//STEP 15: CREATE AN INSTANCE OF THE ADAPTER
        myAdapter= new MyAdapter(movieList);
//STEP 16: CREATE A LAYOUT MANAGER THAT DESIGNS THE LAYOUT FOR THE RECYCLER VIEW
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

//STEP 17: BIND RECYCLER VIEW TO THE ADAPTER
        recyclerView.setAdapter(myAdapter);
//STEP 18: INSERT DATA AND BIND IT TO RECYCLER VIEW
            InsertData();

    }

//STEP 19: CREATE A METHOD FOR INSERTDATA();
    private void InsertData() {
        Movie movie=new Movie("Fast & Furious", "Action", "2019");
        movieList.add(movie);
        movie=new Movie("The Punisher", "Crime", "2014");
        movieList.add(movie);
        movie=new Movie("Italian Job", "Crime", "2010");
        movieList.add(movie);
        movie=new Movie("The Transformers", "Scifi", "2007");
        movieList.add(movie);
        movie=new Movie("Friends", "Sitcom", "2011");
        movieList.add(movie);
        movie=new Movie("Yound Sheldon", "Comedy", "2013");
        movieList.add(movie);
        movie=new Movie("Italian Job", "Crime", "2010");
        movieList.add(movie);
        movie=new Movie("The Avengers", "Supperhero", "2007");
        movieList.add(movie);
        movie=new Movie("Dark Matter", "Sci fi", "2020");
        movieList.add(movie);
        movie=new Movie("Silicon Valley", "Tech", "2010");
        movieList.add(movie);
        movie=new Movie("The Transformers", "Scifi", "2007");
        movieList.add(movie);
        movie=new Movie("Friends", "Sitcom", "2011");
        movieList.add(movie);
        movie=new Movie("Yound Sheldon", "Comedy", "2013");
        movieList.add(movie);
        movie=new Movie("Italian Job", "Crime", "2010");
        movieList.add(movie);

        myAdapter.notifyDataSetChanged();
    }



}