package Lab3.Q1;

import java.awt.Graphics;
import java.awt.Color;
public class MyOval extends MyBoundedShape {
    
    public MyOval(int x1, int y1, int x2, int y2, Color color) {
        super(x1, y1, x2, y2, color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.drawOval(getX1(), getY1(), getX2(), getY2());
    }

    @Override
    public double getArea() {
        double width = Math.abs(getX2() - getX1());
        double height = Math.abs(getY2() - getY1());
        double area = Math.PI * (width / 2 * (height / 2));

        return area;
    }


}
