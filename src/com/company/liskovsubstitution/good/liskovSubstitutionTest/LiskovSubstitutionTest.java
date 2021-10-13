package com.company.liskovsubstitution.good.liskovSubstitutionTest;

public class LiskovSubstitutionTest {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(2);
        rectangle.setHeight(5);

        if(rectangle.area() == 10){
            System.out.println(rectangle.area());
        }
    }
}
