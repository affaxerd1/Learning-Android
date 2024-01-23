package www.affaxerd.recyclerviewapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;


import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
//step 4: create an arraylist that will store all the data of all the models that is created
ArrayList<Item> items = new ArrayList<>();
    Integer[] carImages={
            R.drawable.chevrolet,
            R.drawable.porshe,
            R.drawable.mercedes,
            R.drawable.dodge,
            R.drawable.converse
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=findViewById(R.id.recycleview);

        //STEP 6: call the setUpItemsModels
        setUpItemsModels();

        Adapter adapter=new Adapter(this, items);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

//STEP 5: create a method where we will create all the model classes for each of our items
    private void setUpItemsModels(){
        String[] carNames=getResources().getStringArray(R.array.car_names);
        String[] carEmails=getResources().getStringArray(R.array.support_email);

        //loop through the array and create a model based on each iteration and populate the arraylist
        //basically, we are creating  a new class for each item and we store them on the array list above(created in step 4)

        for(int i=0; i<carNames.length;i++){
            items.add(new Item(carNames[i], carEmails[i], carImages[i]));
        }




    }


}