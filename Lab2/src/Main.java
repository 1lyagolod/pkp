import java.util.List;

public class Main {
    public static void main(String[] args) {

        ServiceList serviceList = new ServiceList();
        serviceList.addService(new Service("Мед. осмотр", 100.0, 30));
        serviceList.addService(new Service("Стоматологическая чистка", 80.0, 45));
        serviceList.addService(new Service("Проверка зрения", 120.0, 40));
        serviceList.displayServices();

        AppointmentList appointmentList = new AppointmentList();
        Worker doctor = new Worker("Иванов А.А.");
        Client patient1 = new Client("Голод И.О.", "+123456789");

        for (int i = 0; i < 15; i++) {
            Service randomService = getRandomService(serviceList);
            String randomDate = getRandomDate();
            String randomTime = getRandomTime();

            Appointment appointment = new Appointment(doctor, patient1, randomService, randomDate, randomTime);
            appointmentList.addAppointment(appointment);
        }

        System.out.println("До сортировки:");
        appointmentList.displayAppointments();

        appointmentList.sortByDate();

        appointmentList.removePastAppointments();

        System.out.println("\nПосле соритровки и удаления прошлых:");
        appointmentList.displayAppointments();
    }

    private static Service getRandomService(ServiceList serviceList) {
        List<Service> services = serviceList.getServices();
        int randomIndex = (int) (Math.random() * services.size());
        return services.get(randomIndex);
    }

    private static String getRandomDate() {
        int day = (int) (Math.random() * 30 + 1);
        String dayString = (day < 10) ? "0" + day : String.valueOf(day);
        return "2023-11-" + dayString;
    }

    private static String getRandomTime() {
        int hour = (int) (Math.random() * 12 + 1);
        int minute = (int) (Math.random() * 60);
        String period = (Math.random() < 0.5) ? "AM" : "PM";

        return String.format("%02d:%02d %s", hour, minute, period);
    }
}