package com.company.liskovsubstitution.good.liskovSubstitutionTest;

public class Square implements Shape{

    private int size;

    public void setSize(int size){
        this.size = size;
    }

    @Override
    public int area() {
        return size * size;
    }
}
