public class GeoLocation
{
    private double latitude;
    private double longitude;

    public GeoLocation(double lat, double lon)
    {
        latitude = lat;
        longitude = lon;
    }

    public String getCoords()
    {
        String coords = "(" + latitude + ", " + longitude + ")";
        return coords;
    }

    public void printCoords()
    {
        String coords = getCoords();
        System.out.println(coords);
    }
}
