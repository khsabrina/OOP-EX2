package api;

public class Geo_Location implements GeoLocation {
    private double x;
    private double y;
    private double z;

    public Geo_Location(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double x() {
        return this.x;
    }
    public double y() {
        return this.y;
    }
    public double z() {
        return this.z;
    }
    public double distance(api.GeoLocation g) {
        return Math.sqrt(Math.pow(g.x()-this.x,2)+Math.pow(g.y()-this.y,2)+Math.pow(g.z()-this.z,2));
    }
}
