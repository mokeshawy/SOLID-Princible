package com.company.liskovsubstitution.good.liskovSubstitutionTest;

public class Rectangle implements Shape{

    private int width;
    private int height;

    public void setWidth( int width ){
        this.width = width;
    }

    public void setHeight( int height){
        this.height = height;
    }


    @Override
    public int area() {
        return width * height;
    }
}
