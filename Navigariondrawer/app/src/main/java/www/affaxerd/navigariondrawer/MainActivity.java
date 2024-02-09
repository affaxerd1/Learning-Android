package www.affaxerd.navigariondrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ImageButton buttonDrawerToggle;
    NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout=findViewById(R.id.drawerlayout);
        buttonDrawerToggle=findViewById(R.id.buttonDrawerToggle);
        navigationView=findViewById(R.id.navigationView);

        buttonDrawerToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.open();
            }
        });

        View headerView= navigationView.getHeaderView(0);
        ImageView useImage=headerView.findViewById(R.id.userImage);
        TextView textUsername= headerView.findViewById(R.id.textUsername);

        useImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, textUsername.getText(),Toast.LENGTH_SHORT).show();
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int itemId=item.getItemId();
                if (itemId==R.id.navMenu){
                    Toast.makeText(MainActivity.this, "Menu clicked",Toast.LENGTH_SHORT).show();
                }
                if (itemId==R.id.navCart){
                    Toast.makeText(MainActivity.this, "Cart clicked",Toast.LENGTH_SHORT).show();
                }
                if (itemId==R.id.navFavourite){
                    Toast.makeText(MainActivity.this, "Favourite clicked",Toast.LENGTH_SHORT).show();
                }
                if (itemId==R.id.navOrders){
                    Toast.makeText(MainActivity.this, "Orders clicked",Toast.LENGTH_SHORT).show();
                }
                if (itemId==R.id.navHistory){
                    Toast.makeText(MainActivity.this, "History clicked",Toast.LENGTH_SHORT).show();
                }
                if (itemId==R.id.navFeedback){
                    Toast.makeText(MainActivity.this, "Feedback clicked",Toast.LENGTH_SHORT).show();
                }
                if (itemId==R.id.navTerms){
                    Toast.makeText(MainActivity.this, "Terms and conditions clicked",Toast.LENGTH_SHORT).show();
                }
                if (itemId==R.id.navContact){
                    Toast.makeText(MainActivity.this, "Contacts clicked",Toast.LENGTH_SHORT).show();
                }
                if (itemId==R.id.navShare){
                    Toast.makeText(MainActivity.this, "Share clicked",Toast.LENGTH_SHORT).show();
                }


                drawerLayout.close();
                return false;
            }
        });
    }
}