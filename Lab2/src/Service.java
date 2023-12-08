class Service {
    private String serviceName;
    private double cost;
    private int duration;

    public Service(String serviceName, double cost, int duration) {
        this.serviceName = serviceName;
        this.cost = cost;
        this.duration = duration;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getCost() {
        return cost;
    }

    public int getDuration() {
        return duration;
    }
}