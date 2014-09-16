# Project Structure

---

# Application Manifest

- Required in every application 
- Defines the application's package name
- Describes application components
- Declares application permissions (ex. Internet Permission)

---

# Resources 

- Stored in the application's res/ folder 
- Has a pre-defined list of sub directories for different resource types (animator/, anim/, color/, drawable/, layout/, menu/, raw/, values/, xml/)
- Can provide alternate resources to support specific device configurations

---
</br> 
```
res/
    drawable/   
        icon.png
        background.png    
    drawable-hdpi/  
        icon.png
        background.png 
```

---

# Activities

- The primary visual component for an application 
- An application can have many activities
- Register capabilities in the Manifest 
- Any activity can serve as an entry point for an application (if registered as such in the Manifest)


