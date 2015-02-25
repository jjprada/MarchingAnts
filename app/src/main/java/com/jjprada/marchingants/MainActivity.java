package com.jjprada.marchingants;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.StringTokenizer;


public class MainActivity extends ActionBarActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 1; i <= 10; i++){
            Log.d(TAG, "OPTION #1: Ants go Marching " + i + " by " + i + ". " + "Hoorah! Hoorah!");
        }


        ArrayList<String> cancion = new ArrayList<String>();

        cancion.add("OPTION #2: Ants go marching one by one. Hoorah! Hoorah!");
        cancion.add("OPTION #2: Ants go marching two by two. Hoorah! Hoorah!");
        cancion.add("OPTION #2: Ants go marching three by three. Hoorah! Hoorah!");
        cancion.add("OPTION #2: Ants go marching four by four. Hoorah! Hoorah!");
        cancion.add("OPTION #2: Ants go marching five by five. Hoorah! Hoorah!");
        cancion.add("OPTION #2: Ants go marching six by six. Hoorah! Hoorah!");
        cancion.add("OPTION #2: Ants go marching seven by seven. Hoorah! Hoorah!");
        cancion.add("OPTION #2: Ants go marching eight by eight. Hoorah! Hoorah!");
        cancion.add("OPTION #2: Ants go marching nine by nine. Hoorah! Hoorah!");
        cancion.add("OPTION #2: Ants go marching ten by ten. Hoorah! Hoorah!");

        for (int i = 0; i < cancion.size(); i++){
            Log.d(TAG, cancion.get(i));
        }

        String[] numbers = {"one","two","three","four","five","six","seven","eight","nine","ten"};

        for (int i = 0; i < numbers.length; i++){
            Log.d(TAG, "OPTION #3: Ants go Marching " + numbers[i] + " by " + numbers[i] + ". " + "Hoorah! Hoorah!");
        }

        for (String number : numbers){
            Log.d(TAG, "OPTION #4: Ants go Marching " + number + " by " + number + ". " + "Hoorah! Hoorah!");
        }

        for (String number : numbers){
            String song = String.format("OPTION #5: Ants go Marching %1$s by %1$s Hoorah! Hoorah!", number);
            Log.d(TAG, song);
        }

        for (String number : numbers){
            String song = String.format(getResources().getString(R.string.song_format), number);
            Log.d(TAG, song);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
