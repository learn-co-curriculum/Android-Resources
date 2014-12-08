# Support Libraries

---

# Why use Support Libraries? 

---

# Everyone loves new API

---

# But not everyone has the latest greatest phone

---

# In fact.. 

---

![](https://chart.googleapis.com/chart?chl=Froyo%7CGingerbread%7CIce%20Cream%20Sandwich%7CJelly%20Bean%7CKitKat&chf=bg%2Cs%2C00000000&chd=t%3A0.5%2C9.1%2C7.8%2C48.7%2C33.9&chco=c4df9b%2C6fad0c&cht=p&chs=500x250)

#A ton of people have Jelly Bean

---

### Support Libraries allow you to support older API levels while utilizing new features

---

### How to decide which Support Library to use? 

---

 * Target your Applications demographics
 * Weigh the tradeoffs 
 * v13 is often a very good choice, supporting 90%+ of the installed base, but some apps will need to go back to v8  

---

#[fit]Code

---

```java

package com.flatironschool.someawesomeproject;

import android.app.AlertDialog;
import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;

public class AdvancedViewActivity extends ActionBarActivity {

	//Yada Yada

}


```

---

#Checking API Level 

```java 

if(Build.VERSION.SDK_INT == 18 ){
            // Do some stuff
        }
else if (Build.VERSION.SDK_INT == 19) {
            // Do some stuff
        }
else{
            // Do some stuff
        }


```

---

#Targeting API's 

`@TargetApi(someApiLevel)`

Indicates that Lint should treat this type as targeting a given API level, no matter what the project target is.

```java

import android.annotation.TargetApi;

@TargetApi(13)
private void doSomeApiLevel13Things(){
	
}

```




