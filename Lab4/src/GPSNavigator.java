class GPSNavigator {
    public Location getCurrentLocation() {

        return new Location(37.7749, -122.4194);
    }

    public Route calculateRoute(Location destination) {
        Location currentLocation = getCurrentLocation();
        return new Route(currentLocation, destination);
    }

    public void displayRoute(Route route) {
        System.out.println("Маршрут от (" + route.startLocation.latitude + ", " +
                route.startLocation.longitude + ") до (" +
                route.endLocation.latitude + ", " + route.endLocation.longitude + ")");
    }
}