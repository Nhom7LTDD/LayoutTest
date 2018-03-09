package com.example.administrator.layouttt;


/**
 * Created by Administrator on 09/03/2018.
 */

public class bTitle {
    private String bookName;
    private String bookJacket;
    private int price;
    private int views;

    public bTitle(String bookName, String bookJacket, int price, int views){
        this.bookName= bookName;
        this.bookJacket=bookJacket;
        this.price=price;
        this.views=views;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookJacket() {
        return bookJacket;
    }

    public void setBookJacket(String bookJacket) {
        this.bookJacket = bookJacket;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
    @Override
    public String toString(){
        return this.bookName+this.price+"đ"+this.views;
    }
}
