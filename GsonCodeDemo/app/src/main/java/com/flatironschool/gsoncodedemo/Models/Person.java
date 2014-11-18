package com.flatironschool.gsoncodedemo.Models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


/**
 * Created by altyus on 11/12/14.
 */
public class Person {
    private String mName;
    private String mFavoriteColor;
    private int mAge;
    private boolean mIsMarried;
    private boolean mHasDog;

    public Person(String name, String favoriteColor, int age, boolean isMarried, boolean hasDog) {
        mName = name;
        mFavoriteColor = favoriteColor;
        mAge = age;
        mIsMarried = isMarried;
        mHasDog = hasDog;
    }

    public static Gson sGson() {
        return new GsonBuilder().setPrettyPrinting().create();
    }
//    public Person(String jsonString){
//        Person person = sGson().fromJson(jsonString, Person.class);
//        mName = person.mName;
//        mFavoriteColor = person.mFavoriteColor;
//        mAge = person.mAge;
//        mIsMarried = person.mIsMarried;
//        mHasDog = person.mHasDog;
//    }

    public String getName() {
        return mName;
    }

    public String getFavoriteColor() {
        return mFavoriteColor;
    }

    public int getAge() {
        return mAge;
    }

    public boolean isMarried() {
        return mIsMarried;
    }

    public boolean isHasDog() {
        return mHasDog;
    }
}
