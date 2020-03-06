package com.example.gridlayout;

public class ShopData {
    private int shopImage;
    private String shopName;
    private String shopCategory;
    private int shopRating;
    private int shopPrice;
    private int shopDiscount;
    private String itemType;

    public ShopData(int shopImage, String shopName, String shopCategory, int shopRating, int shopPrice, int shopDiscount, String itemType) {
        this.shopImage = shopImage;
        this.shopName = shopName;
        this.shopCategory = shopCategory;
        this.shopRating = shopRating;
        this.shopPrice = shopPrice;
        this.shopDiscount = shopDiscount;
        this.itemType = itemType;
    }

    public int getShopImage() {
        return shopImage;
    }

    public String getShopName() {
        return shopName;
    }

    public String getShopCategory() {
        return shopCategory;
    }

    public int getShopRating() {
        return shopRating;
    }

    public int getShopPrice() {
        return shopPrice;
    }

    public int getShopDiscount() {
        return shopDiscount;
    }

    public String getItemType() {
        return itemType;
    }
}
