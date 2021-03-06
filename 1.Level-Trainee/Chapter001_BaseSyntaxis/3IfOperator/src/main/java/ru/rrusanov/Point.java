package ru.rrusanov;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
/**
 * Class set point by coordinate system, calculate triangle side.
 * @author Rusanov Roman
 * @since 02.06.2016
 * @version 0.1
 **/
public class Point {
	/**
	 * value for coordinates.
	 */
	public double x, y;
	/**
	 * Disigner for Point.
	 * @param x (int) x coordinate
	 * @param y (int) y coordinate
	**/
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * Calculation of triangle side.
	 * @param p2 (Point) x.y
	 * @return double (Distance of two point this - p2 )
	**/
    public double distanceTo(Point p2) {
		return sqrt(pow((this.x - p2.x), 2) + pow((this.y - p2.y), 2));
	}
}

