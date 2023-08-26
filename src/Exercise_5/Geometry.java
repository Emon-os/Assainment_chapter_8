package Exercise_5;

public class Geometry
{
    // Instance Variables

    // Constructors

    // Methods
    /**
     * Gets the Volume of a cube with side h
     * @param h Height of a side
     * @return volume
     */
    public static double cubeVolume(double h)
    {
        double volume = Math.pow(h, 3);
        return volume;
    }

    /**
     * Gets the Surface Area of a cube with side h
     * @param h Height of a side
     * @return surface area
     */
    public static double cubeSurface(double h)
    {
        double surfaceArea = 6 * Math.pow(h, 2);
        return surfaceArea;
    }

    /**
     * Gets the Volume of a sphere with given radius
     * @param r radius
     * @return volume
     */
    public static double sphereVolume(double r)
    {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        return volume;
    }

    /**
     * Gets the surface are of a sphere with given radius
     * @param r radius
     * @return surface area
     */
    public static double sphereSurface(double r)
    {
        double surfaceArea = 4.0 * Math.PI * Math.pow(r, 2);
        return surfaceArea;
    }

    /**
     * Gets the volume of a cylinder given radius and height
     * @param r radius
     * @param h height
     * @return volume
     */
    public static double cylinderVolume(double r, double h)
    {
        double volume = Math.PI * Math.pow(r, 2) * h;
        return volume;
    }

    /**
     * Gets the surface are of a cylinder with given radius and height
     * @param r radius
     * @param h height
     * @return surface area
     */
    public static double cylinderSurface(double r, double h)
    {
        double surfaceArea = (2 * Math.PI * r * h) + (2 * Math.PI * Math.pow(r, 2));
        return surfaceArea;
    }

    /**
     * Gets the volume of a cone given the radius and height
     * @param r radius
     * @param h height
     * @return volume
     */
    public static double coneVolume(double r, double h)
    {
        double volume = Math.PI * Math.pow(r, 2) * (h / 3.0);
        return volume;
    }

    /**
     * Gets the surface area of a cone given the radius and height
     * @param r radius
     * @param h height
     * @return surface area
     */
    public static double coneSurface(double r, double h)
    {
        double surfaceArea = Math.PI * r * (r + Math.sqrt(Math.pow(h, 2) + Math.pow(r, 2)));
        return surfaceArea;
    }
}
