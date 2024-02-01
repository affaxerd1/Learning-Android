package www.affaxerd.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.ViewParent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//STEP1: INSTATIATE THE VIEWPAGER
        ViewPager viewPager=findViewById(R.id.viewPagery);
//STEP 2: SETTING THE ADAPTER
        viewPager.setAdapter(new CustomPagerAdapter(this));

    }
}