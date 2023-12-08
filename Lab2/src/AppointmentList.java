import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class AppointmentList {
    private List<Appointment> appointments;

    public AppointmentList() {
        this.appointments = new ArrayList<>();
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public void displayAppointments() {
        System.out.println("Список записей:");
        for (Appointment appointment : appointments) {
            appointment.displayInfo();
            System.out.println("--------------");
        }
    }

    public void sortByDate() {
        Collections.sort(appointments, (a1, a2) -> a1.date.compareTo(a2.date));
    }

    public void removePastAppointments() {
        Iterator<Appointment> iterator = appointments.iterator();
        while (iterator.hasNext()) {
            Appointment appointment = iterator.next();
            if (isPastDate(appointment.date)) {
                iterator.remove();
            }
        }
    }

    private boolean isPastDate(String date) {
        return date.compareTo("2023-11-15") < 0;
    }
}