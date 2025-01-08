package org.example;

public class Wall {
    double width;
    double height;

    /* ------------------------CONSTRUCTORS--------------------- */

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /* ------------------------METHODS--------------------- */

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double newWidth) {
        if(newWidth < 0) {
             newWidth = 0;
        }
         width = newWidth;
    }

    public void setHeight(double newHeight) {
        if(newHeight < 0) {
            newHeight = 0;
        }
        height = newHeight;
    }

    public double getArea() {
        return width * height;
    }

}
