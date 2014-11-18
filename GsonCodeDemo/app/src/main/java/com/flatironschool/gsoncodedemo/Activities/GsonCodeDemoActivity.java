package com.flatironschool.gsoncodedemo.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.flatironschool.gsoncodedemo.Models.Person;
import com.flatironschool.gsoncodedemo.R;
import com.flatironschool.gsoncodedemo.Serializers.PersonGsonSerializer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class GsonCodeDemoActivity extends Activity {

    private static final String FILENAME = "people.json";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gson_code_demo);

        List<Person> people = new ArrayList<Person>();
        people.add(new Person("Al", "blue", 27, false, false));
        people.add(new Person("Sherry", "blue", 28, true, false));
        people.add(new Person("Erica", "blue", 30, false, true));
        people.add(new Person("James", "blue", 15, false, true));

        PersonGsonSerializer serializer = new PersonGsonSerializer(this, FILENAME);

        try {
            List<Person> loadedPeople = serializer.loadPeople();
            if (loadedPeople.size() == 0 || loadedPeople == null) {
                serializer.savePeople(people);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gson_code_demo, menu);
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
