package vsn.com.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("myApp->MainActivity 0nCreate()..");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("myApp->MainActivity 0nStart()..");
        Log.i("message","onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("myApp->MainActivity 0nResume()..");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("myApp->MainActivity 0nPause()..");
    }

    @Override
    protected void onStop() {
        super.onStop();




        System.out.println("myApp->MainActivity 0nStop()..");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("myApp->MainActivity 0nDestroy()..");
    }

    public void nextScreen(View view){
        Intent i = new Intent(MainActivity.this,SecondActivity.class);
        startActivity(i);
    }
}
