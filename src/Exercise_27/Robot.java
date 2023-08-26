package Exercise_27;

import java.awt.Point;

public class Robot {
    private Point location;
    private String direction;

    public Robot() {
        location = new Point(0, 0);
        direction = "N";
    }

    public void turnLeft() {
        // Update direction based on current direction
    }

    public void turnRight() {
        // Update direction based on current direction
    }

    public void move() {
        // Update location based on current direction
    }

    public Point getLocation() {
        return location;
    }

    public String getDirection() {
        return direction;
    }
}
