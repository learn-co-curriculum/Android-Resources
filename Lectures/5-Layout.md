# Layout

---

# Defining Layouts 

* Programatically in Java via Activity or Fragment 
* XML 

---

# Layout XML File 

* XML Files stored in src/main/res/layout 
* Layout files contain exactly one root element (always a View object)
* Additional View objects can be added as child elements 

--- 

# Some XML Code 

</br> 

```xml 
<?xml version="1.0" encoding="utf-8"?>

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
				    android:layout_width="match_parent" 
				    android:layout_height="match_parent"
				    android:orientation="vertical" > 
		 
		  <TextView android:id="@+id/myTextview"
		  			android:layout_width="wrap_content"
		  			android:layout_height="wrap_content"
		  			android:text="I should probably use a String Resource for this!" />

</LinearLayout>

```

---

# Required Layout XML Attributes

* ID - `android:id="@+id/someAttributeName"` **Required to access element from Java code**

* Layout Width and Height - `android:layout_width="match_parent"
							 android:layout_height="wrap_content"`

---

# Load XML Layout in Java Code 

Load layout resource in `Activity.onCreate()` using `setContentView() method`
Access child elements using findViewById()method 


---

</br> 

```java

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_myToDoList); // set content view

        ListView myListView = (ListView)findViewById(R.id.myListView);

        //Do things with myListView

```

---

## Resources 

* [Layout Resource](http://developer.android.com/guide/topics/resources/layout-resource.html)
* [Layouts](http://developer.android.com/guide/topics/ui/declaring-layout.html)
* [Relative Layout](http://developer.android.com/guide/topics/ui/layout/relative.html)
* [Linear Layout](http://developer.android.com/guide/topics/ui/layout/linear.html)
* [Grid View](http://developer.android.com/guide/topics/ui/layout/gridview.html)
* [List View](http://developer.android.com/guide/topics/ui/layout/gridview.html)
