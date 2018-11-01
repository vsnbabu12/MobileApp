package vsn.com.demoapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        System.out.println("myApp->SecondActivity 0nCreate()..");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("myApp->SecondActivity 0nStart()..");
        Log.i("message","onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("myApp->SecondActivity 0nResume()..");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("myApp->SecondActivity 0nPause()..");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("myApp->SecondActivity 0nStop()..");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("myApp->SecondActivity 0nDestroy()..");
    }


}
