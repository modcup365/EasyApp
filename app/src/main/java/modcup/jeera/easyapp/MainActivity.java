package modcup.jeera.easyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import modcup.jeera.easyapp.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);     //Save instanceState is resume application to continue
        setContentView(R.layout.activity_main);

        //Add Fragment Activities
        if(savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().add(R.id.contentFragmentMain,new MainFragment()).commit();

        }

    } // Main Method  :: Every app start from this method
}// Main Class
