/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangle;

/**
 *
 * @author Reem Khattab
 */
public class Rectangle {
    double length;
    double width;
    double perimeter;
    double area;

    Rectangle(double w, double l) {
        width = w;
        length = l;

    }
    double getLength(double l) {
        return l;
    }
    double getWidth(double w) {
        return w;
    }
    double getPerimeter() {
        return ((2 * length) + (2 * width));
    }
    double getArea() {
        return (length * width);

    }

}