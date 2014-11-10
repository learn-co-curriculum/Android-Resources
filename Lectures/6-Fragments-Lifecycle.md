#[fit]Fragments

---

#What are Fragments? 

* Encapsulate a behavior or portion of User Interface
* Must be embedded in an Activity
* Fragment lifecycle relys upon the parent Activity's lifecycle 
* Fragment Manager provides for a way to interact with fragments from the Activity
* You can kinda think of them as Activities inside of Activities... kinda 

---

#Why are Fragments? 

###Couldn't we just use Activities for everything?

* Sure, before API 11 AKA Android 3.0 Fragments didn't exist
* But around that time tons of new device form factors were gaining traction
	*Tablets
	*Wearables
	*TV
	*Car

---

#[Fit]Still we could just use Activities for everything 
#[fit]but....

---

 *Fragments allow for UI to be reused
 *Fragments allow for UI to be dynamic (design for tablet and phone)
 *Largely, the logic doesn't change between a tablet and phone app but the UI does
 *Fragments allow for modularity and decoupling of elements

---

![fit](http://developer.android.com/images/fundamentals/fragments.png)

---

##Fragments have their own lifecycle!

---

##But you are already pretty familiar with it

---

![fit](http://developer.android.com/images/fragment_lifecycle.png)

---

##[fit]Two different Methods to add Fragments

---

##Layout XMl

```xml

<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/container"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    
    <fragment
        android:id="@+id/left_fragment"
        ....
        android:name="com.flatironschool.back_that_daz_up.DazFragment"
        tools:layout="@layout/fragment_daz"/>

    <fragment
        android:id="@+id/right_fragment"
        ....
        android:name="com.flatironschool.back_that_daz_up.DazDetailFragment"
        tools:layout="@layout/fragment_daz_detail" />

</RelativeLayout>

```

----

##Activity Subclass 

```java

	public class myActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_my);
        if (savedInstanceState == null) {

        	MyFragment fragment = new MyFragment();
        	fragment.setArguments(getIntent().getExtras());  

            getFragmentManager().beginTransaction()
                    .add(R.id.container, fragment)
                    .commit();

        }
    }


```

----

##Fragment Code

```java

public class MyFragment extends Fragment {
    public MyFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_my, container, false);
        return rootView;
    }
}

```

----

##The BackStack

* By Default keeps track of Activities used by the __system__
* Fragments can be added to the backstack using the FragmentManager 


----

![fit](http://media.tumblr.com/tumblr_ltw89eRWr01qa0pyv.jpg)
![fit](http://1.bp.blogspot.com/-BuNtVc0kG8s/TvO16QHvXBI/AAAAAAAAD3c/PC0ld2amwgU/s1600/Screen+Shot+2011-12-22+at+11.57.15+PM.png)