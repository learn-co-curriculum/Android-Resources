# Location

---

#Google Play Services

* Preferred over Android API's for accessing location data
* Install via SDK Manager and Add to build.gradle 


`compile 'com.google.android.gms:play-services:5.0.77'`

---

#Permission 

* Manifest XML must define google play services version and permission

``` 

<manifest .....

<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION"/>

	<application ......>
		<meta-data android:name="com.google.android.gms.version" 		android:value="@integer/google_play_services_version" />
		</application>

</manifest>
```

--- 

#Check for Google Play Services 

```java 

int resultCode = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);

```

---

#Configure Callbacks 


---

##GoogleApiClient.ConnectionCallbacks

Called back when client is connected or disconnected from Google Play Service 

`onConnected(Bundle bundle)`
`onDisconnected()`

 LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mRequest, this);

---

##GoogleApiClient.OnConnectionFailedListener

Called when there was an error connecting to the Google Play Services 

`onConnectionFailed(ConnectionResult result)`

---

##LocationListener 

Used for receiving notifications from the LocationManager when the location has changed.

`onLocationChanged(Location location)` 

triggered by: 

`requestLocationUpdates(String, long, float, LocationListener)`

---

#Location Client

It's been Deprecated!! Woohoo!!! 

Use GoogleApiClient instead

---

#GoogleApiClient

Esentially replace this code: 

`mLocationClient = new LocationClient(this, this, this);`


With This Code


`mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addApi(LocationServices.API)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .build();`



