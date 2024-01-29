package www.affaxerd.cardswithrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<String> abcd;
    List<Integer> abcdImg;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview);
        abcd =new ArrayList<>();
        abcdImg=new ArrayList<>();

        abcd.add("Mercedes");
        abcd.add("Audi");
        abcd.add("Chevrolet");
        abcd.add("Toyota");
        abcd.add("Maseratti");
        abcd.add("BMW");

        abcdImg.add(R.drawable.mercedes);
        abcdImg.add(R.drawable.audi);
        abcdImg.add(R.drawable.dodge);
        abcdImg.add(R.drawable.toyota);
        abcdImg.add(R.drawable.maseratti);
        abcdImg.add(R.drawable.bmw);

        adapter=new Adapter(this, abcd, abcdImg);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);





    }
}