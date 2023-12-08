class Appointment {
    public Worker worker;
    public Client client;
    public Service service;
    public String date;
    public String time;

    public Appointment(Worker worker, Client client, Service service, String date, String time) {
        this.worker = worker;
        this.client = client;
        this.service = service;
        this.date = date;
        this.time = time;
    }

    public void displayInfo() {
        System.out.println("Информация о записи:");
        System.out.println("Дата: " + date);
        System.out.println("Время: " + time);
        System.out.println("Врач: " + worker.name);
        System.out.println("Клиент: " + client.name);
        System.out.println("Номер клиента: " + client.getPhoneNumber());
        System.out.println("Услуга: " + service.getServiceName());
        System.out.println("Цена: $" + service.getCost());
        System.out.println("Длительность: " + service.getDuration() + " минут");
    }
}