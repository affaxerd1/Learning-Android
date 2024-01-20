package www.affaxerd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "i like"+adapter.getItem(i), Toast.LENGTH_SHORT).show();
            }
        });
    }

}