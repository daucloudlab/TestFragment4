package kz.kaznitu.lessons;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentA.Communicator{
    private FragmentManager fragmentManager ;
    private FragmentA fragmentA ;
    private FragmentB fragmentB ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager() ;
        FragmentA fragmentA = (FragmentA)fragmentManager.findFragmentById(R.id.fragmentA) ;
        fragmentA.setCommunicator(this);
    }

    @Override
    public void respond(int i) {
        FragmentB fragmentB = (FragmentB)fragmentManager.findFragmentById(R.id.fragmentB) ;

        if(fragmentB != null && fragmentB.isVisible()){
            fragmentB.changeData(i);
        } else {
            Intent intent = new Intent(this, AnotherActivity.class) ;
            intent.putExtra("index", i) ;
            startActivity(intent);
        }


    }
}
