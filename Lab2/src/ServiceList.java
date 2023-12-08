import java.util.ArrayList;
import java.util.List;

class ServiceList {
    private List<Service> services;

    public ServiceList() {
        this.services = new ArrayList<>();
    }

    public void addService(Service service) {
        services.add(service);
    }

    public void displayServices() {
        System.out.println("Список услуг:");
        for (Service service : services) {
            System.out.println("Услуга: " + service.getServiceName());
            System.out.println("Стоимость: $" + service.getCost());
            System.out.println("Длительность: " + service.getDuration() + " минут");
            System.out.println("--------------");
        }
    }

    public List<Service> getServices() {
        return services;
    }
}