public class Main {
    public static void main(String[] args) {

        GPSNavigator gpsNavigator = new GPSNavigator();
        User user = new User("John");


        Location currentLocation = gpsNavigator.getCurrentLocation();
        System.out.println(user.name + " находится на координатах: (" +
                currentLocation.latitude + ", " + currentLocation.longitude + ")");


        Location destination = new Location(50.1904, 30.2049);
        Route route = gpsNavigator.calculateRoute(destination);
        gpsNavigator.displayRoute(route);
    }
}