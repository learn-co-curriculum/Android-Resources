# Cursor Adapter

---

# Why use the Cursor Adapter? 

---

# Because it's easier and faster 

---

###Constructor

```java

 public ForecastAdapter(Context context, Cursor c, int flags) 

 ```

### Params: A Context (of course), A Cursor, and optional flags (we'll use 0)

---

#newView

Makes a new view to hold the data pointed to by cursor.

```java

public View newView(Context context, Cursor cursor, ViewGroup parent) 

```

---

#bindView

Bind an existing view to the data pointed to by cursor

```java

public void bindView(View view, Context context, Cursor cursor)

```

---

## Putting it together in an Activity

---

# 1. 

---

##Set a cursor with a DB Query ex. getAllPeople 

---

# 2. 

---

##Construct CursorAdapter with Cursor

---

# 3. 

---

##Change cursor or notify Adapter of changed data on updates

---

###`mPersonAdapter.changeCursor(cursor);`

