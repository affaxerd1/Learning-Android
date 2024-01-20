package www.affaxerd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
     ListView listView;

     String[] Toyotas={
       "Toyota Prius", "Toyota Lexus", "Toyota fielder", "Toyota Prad0",
       "Toyota Hillux", "Toyota Axio"
     };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listviewy);

        //Array Adapter

        ArrayAdapter adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Toyotas);
        listView.setAdapter(adapter);
    }
}