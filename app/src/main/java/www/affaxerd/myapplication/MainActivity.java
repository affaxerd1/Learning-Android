package www.affaxerd.myapplication;

import static www.affaxerd.myapplication.R.id.button;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;
    ImageView imageView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        editText=findViewById(R.id.editTextText);
        imageView=findViewById(R.id.imageView);

        button.setOnClickListener((v)-> {
            TheButtonIsClicked();
        });



        Log.v("editText", "The text inside editText is:" +editText.getText().toString());


    }






    private void TheButtonIsClicked() {
        Log.v("message", " the input is" +editText.getText().toString());
        imageView.setImageResource(R.drawable.pic2);
    }
}