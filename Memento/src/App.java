import java.awt.Color;

import editor.Editor;
import shapes.Circle;
import shapes.CompoundShape;
import shapes.Dot;
import shapes.Rectangle;
import shapes.Triangle;

public class App {
    public static void main(String[] args) throws Exception {
        Editor editor = new Editor();
        editor.loadShapes(
                new Circle(20, 50, 50, Color.BLUE),
                new Rectangle(150, 20, 50, 50, Color.black),
                new Triangle(350, 50, 60,120, Color.BLUE),
                new CompoundShape(
                        new Circle(100, 100, 60, Color.RED),
                        new Dot(120, 120, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                ),
                new CompoundShape(
                        new Triangle(180, 180, 90,70, Color.yellow),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
