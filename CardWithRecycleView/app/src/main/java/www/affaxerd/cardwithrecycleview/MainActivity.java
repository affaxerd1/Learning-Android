package www.affaxerd.cardwithrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
//STEP1 : DECLARE RECYCLEVIEW
    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<String> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items=new ArrayList<>();
        items.add("First Card view Item");
        items.add("Second Card view Item");
        items.add("Third Card view Item");
        items.add("Fourth Card view Item");
        items.add("Fifth Card view Item");
        items.add("Sixth Card view Item");

//STEP2: INITIATE THE RECYCLEVIEW
        recyclerView=findViewById(R.id.recycleView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new Adapter(this, items);
        recyclerView.setAdapter(adapter);


 //STEP3: CREATE THE XML LAYOUR OF THE CARD AND RECYCLEVIEW


    }
}