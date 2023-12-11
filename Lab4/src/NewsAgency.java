import java.util.ArrayList;
import java.util.List;

class NewsAgency implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // Метод для отправки новостей подписчикам
    public void addNews(String news) {
        System.out.println("Новая новость: " + news);
        notifyObservers(news);
    }
}