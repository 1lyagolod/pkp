public class Main {
    public static void main(String[] args) {
        GPSPoint startPoint = new GPSPoint(40.7128, -74.0060);
        GPSPoint endPoint = new GPSPoint(34.0522, -118.2437);

        Navigator navigator = new Navigator();

        double distance = navigator.calculateDistance(startPoint, endPoint);
        System.out.println("Distance: " + distance + " km");

        navigator.navigateTo(endPoint);
    }
}
