
package com.mycompany.item;

public class Item {
    protected int location;
    protected String description;

    public Item(int location, String description) {
        this.location = location;
        this.description = description;
    }

    // Getter for location
    public int getLocation() {
        return location;
    }

    // Setter for location
    public void setLocation(int location) {
        this.location = location;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }
}

