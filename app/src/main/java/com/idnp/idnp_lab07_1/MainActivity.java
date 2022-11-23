package com.idnp.idnp_lab07_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView barra;
    FragmentHome inicioFragment = new FragmentHome();
    FragmentEvent calendarioFragment = new FragmentEvent();
    FragmentEmail correoFragment = new FragmentEmail();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        barra = findViewById(R.id.navegacion);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, inicioFragment).commit();

        barra.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,inicioFragment).commit();
                        return true;
                    case R.id.eventos:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,calendarioFragment).commit();
                        return true;
                    case R.id.email:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,correoFragment).commit();
                        return true;
                }
                return false;
            }
        });
    }
}