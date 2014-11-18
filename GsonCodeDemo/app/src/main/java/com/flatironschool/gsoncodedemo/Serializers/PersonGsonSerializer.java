package com.flatironschool.gsoncodedemo.Serializers;

import android.app.ListFragment;
import android.content.Context;

import com.flatironschool.gsoncodedemo.Models.Person;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by altyus on 11/12/14.
 */
public class PersonGsonSerializer {

    private Context mContext;
    private String mFileName;

    public PersonGsonSerializer(Context context, String fileName){
        mContext = context;
        mFileName = fileName;
    }

    public void savePeople(List<Person> people)throws IOException{
         Person[] peopleArr = people.toArray(new Person[people.size()]);
        String peopleString = sGson().toJson(peopleArr, Person[].class);

        Writer writer = null;

        try{
            OutputStream out = mContext.openFileOutput(mFileName, Context.MODE_PRIVATE);
            writer = new OutputStreamWriter(out);
            writer.write(peopleString);
        } finally {
            if (writer != null){
                writer.close();
            }
        }
    }

    public List<Person> loadPeople() throws IOException {
        List<Person>people = new ArrayList<Person>();

        BufferedReader reader = null;

        try{
            InputStream in = mContext.openFileInput(mFileName);
            reader = new BufferedReader(new InputStreamReader(in));

            StringBuilder jsonString = new StringBuilder();
            String line = null;

            while((line = reader.readLine()) != null){
                jsonString.append(line);
            }

            Person[] peopleArr = sGson().fromJson(jsonString.toString(), Person[].class);

            people = Arrays.asList(peopleArr);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (reader != null){
                reader.close();
            }
        }

        return people;
    }

    private static Gson sGson(){
        return new GsonBuilder().setPrettyPrinting().create();
    }
}
