package com.company.liskovsubstitution.bad.lskovSubstitutionTest;

import com.company.liskovsubstitution.good.liskovSubstitutionTest.Rectangle;
import com.company.liskovsubstitution.good.liskovSubstitutionTest.Square;

public class LiskovSubstitutionTest {

    public static void main(String[] args) {


//        Rectangle rectangle = new Square(); // bad liskovSubstitution
//        rectangle.setWidth(2);
//        rectangle.setHeight(5);
//
//        if(rectangle.getArea() == 10){
//            System.out.println(rectangle.getArea());
//        }

        Square square = new Square(); // good liskovSubstitution

        square.setSize(4);

        if(square.area() == 16){
            System.out.println(square.area());
        }
    }
}
