import java.util.Scanner;

public class PushNotification {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        NewsSubscriber subscriber1 = new NewsSubscriber("Подписчик 1");
        NewsSubscriber subscriber2 = new NewsSubscriber("Подписчик 2");

        newsAgency.addObserver(subscriber1);
        newsAgency.addObserver(subscriber2);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Создать новость");
            System.out.println("2. Выход");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введите текст новости:");
                    scanner.nextLine(); // Очистка буфера после nextInt()
                    String newsText = scanner.nextLine();
                    newsAgency.addNews(newsText);
                    break;
                case 2:
                    System.out.println("Программа завершена.");
                    System.exit(0);
                default:
                    System.out.println("Некорректный выбор. Попробуйте еще раз.");
            }
        }
    }
}