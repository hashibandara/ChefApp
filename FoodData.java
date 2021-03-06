package com;

public class FoodData {
    private String itemName;
    private String itemDescription;
    private String itemPrice;
    private String itemImage;

    public FoodData(String itemName, String itemDescription, String itemPrice, String  itemImage) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemImage = itemImage;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    
    public String getItemPrice() {
        return itemPrice;
    }

    
    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    
    public String getItemImage() {
        return itemImage;
    }

    
    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
    }
}

