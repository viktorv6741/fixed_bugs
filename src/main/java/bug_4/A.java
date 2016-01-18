package bug_4;

import java.awt.*;

class A {

    Polygon polygon;
    private int width = polygon.getBounds().width;
    private int height = polygon.getBounds().height;


    public A(int[] x, int[] y) {
        this.polygon = new Polygon(x, y, x.length);
        this.width = polygon.getBounds().width;
        this.height = polygon.getBounds().height;
    }


    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}