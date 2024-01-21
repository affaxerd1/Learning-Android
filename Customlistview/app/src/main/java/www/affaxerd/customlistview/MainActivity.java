package www.affaxerd.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] title={
            "Toyota Prius",
            "Toyote Hillux",
            "Toyota Vanguard",
            "Toyota Prado",
            "Toyota Fielder"
    };

    String[] description={
            "its an hybrid with low fuel consumption",
            "Its a for wheel drive truck, diesel",
            "Two wheel SUV suitable for family-fancy SUV van",
            "Luxurious SUV equipped with a four wheel drive",
            "Available in both Hybrid and non hybrid"
    };

    Integer[] imgs={
            R.drawable.challenger,
            R.drawable.chevrolet,
            R.drawable.dodge,
            R.drawable.mercedes,
            R.drawable.porshe
    };


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListAdapter adapter;
        adapter = new MyListAdapter(this, title, description, imgs);

        listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}