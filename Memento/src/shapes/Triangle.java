package shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Triangle extends BaseShape {

    private int base;
    private int height;

    public Triangle(int x, int y, int base, int height, Color color) {
        super(x, y, color);
        this.base = base;
        this.height = height;
    }

    @Override
    public int getWidth() {
        return base;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        int[] xPoints = {x, x + base / 2, x + base};
        int[] yPoints = {y + height, y, y + height};
        graphics.drawPolygon(xPoints, yPoints, 3);
    }
    
}
