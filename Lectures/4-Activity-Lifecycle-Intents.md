# Activity Lifecycle and Intents

---

#Starting an Activity 

  ![inline](http://developer.android.com/images/training/basics/basic-lifecycle.png)

  Step pyramid that gives the developer access to the application before or after various states are achieved

---

#Startup Steps

  * onCreate() - Application startup logic that should happen only once for the lifetime of the Activity. Often defining UI, Define Member Variables 
  * onStart() - Called Everytime your activity becomes visible
  * onRestart() - Only called if Activity is started from the stopped state.  Restoration work that occurs only if the Activity were previously stopped.  
  * onResume() - Called when the Activity is resumed from the paused state.  Restart actions that were stopped in onPause(). ex. play video.  Initialize components that were released in onPause(). 

---

#Tearing down an Activity

 ![inline](http://developer.android.com/images/training/basics/basic-lifecycle-create.png)

---

#Teardown Steps

  * onPause() - Prior to stopping the Activity is in a paused state (ex. when another activity's view partially covers) Should persist data / stop actions (ex. video). Release system resources
  * onStop() - Heavy load shutdown operations 
  * onDestroy() - Last callback before Activity is destroyed.  Should kill any background threads or long running processes.  

---

#Explicit Intents

---

##Activity Manager

* startActivity(...) Method is passed from the Activity sublcass to the Activity Manager
* Android OS class responsible for starting Activities
* Activity Manager checks manifest for the Activity specified in the Intent and starts the Activity 
* Key idea that makes it possible for intents to work between applications

---

##Extras

 * Key Value Pairs to carry extra data on intents
 * Use putExtra() methods to add extras
 * should use constants for extra keys. ex. `public static final String EXTRA_GIGAWATTS = "com.example.EXTRA_GIGAWATTS";`

---

##Code

---

##Launching Intent with Extra

  ```java
  	Intent intent = new Intent(MadLibActivity.this, MadLibStoryActivity.class);
                        intent.putExtra(SOME_CONSTANT, someObject);
    startActivity(intent);

  ```

##Getting Extra from Launched Activity

  ```java
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
  	    Intent intent = getIntent(); 
  	    Object someObject = intent.getStringExtra(SOME_CONSTANT); //assuming extra is a string
  	
  	    ....
  }

  ```


 
