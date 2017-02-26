package kz.kaznitu.lessons;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Intent intent = getIntent() ;
        int index = intent.getIntExtra("index", 0) ;

        FragmentManager fragmentManager = getSupportFragmentManager() ;
        FragmentB fragmentB = (FragmentB)fragmentManager.findFragmentById(R.id.fragmentB) ;
        fragmentB.changeData(index);
    }
}
