package www.affaxerd.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    TextView name, email;

    public static  final String myprefrences="mypref";
    public static final String Name="nameKey";
    public static final String Email="emailKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.editTextText2);
        email=findViewById(R.id.editTextText);

        sharedPreferences=getSharedPreferences(myprefrences, Context.MODE_PRIVATE);
        if(sharedPreferences.contains(Name))
            name.setText(sharedPreferences.getString(Name, ""));

        if(sharedPreferences.contains(Email))
            email.setText(sharedPreferences.getString(Email, ""));

    }

    //saving data
    public void save(View view){

        String n=name.getText().toString();
        String e=email.getText().toString();
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString(Name, n);
        editor.putString(Email, e);
        editor.commit();


    }

    //clearing data
    public void Clear(View view){
        name=findViewById(R.id.editTextText2);
        email=findViewById(R.id.editTextText2);
        email.setText("");
        name.setText("");


    }

    //Getting the values from shared preferences

    public void Get(View view){
        name= findViewById(R.id.editTextText);
        email=findViewById(R.id.editTextText2);

        sharedPreferences=getSharedPreferences(myprefrences, Context.MODE_PRIVATE);
        if(sharedPreferences.contains(Name)){
            name.setText(sharedPreferences.getString(Name, ""));
        }

        if (sharedPreferences.contains(Email)){
            email.setText(sharedPreferences.getString(Email, ""));
        }
    }

}