import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class YandexMapsAPI {

    public static void main(String[] args) {
        String apiKey = "1474396d-007d-416f-9eb7-ddb9b152b826";
        String startPoint = "37.620070,55.753630";  // Координаты Москвы
        String endPoint = "30.315868,59.939095";    // Координаты Санкт-Петербурга

        try {
            // Построение URL для запроса к API Яндекс.Карт
            String apiUrl = "https://api.routing.yandex.net/v2/route";

            // Формирование параметров запроса
            String urlParameters = "apikey=" + apiKey +
                    "&waypoints=" + startPoint + "~" + endPoint +
                    "&format=json" +
                    "&results=1";

            // Отправка HTTP-запроса
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);

            // Передача параметров в теле запроса
            try (DataOutputStream wr = new DataOutputStream(connection.getOutputStream())) {
                byte[] postData = urlParameters.getBytes(StandardCharsets.UTF_8);
                wr.write(postData);
            }

            // Получение и обработка ответа
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            // Обработка JSON-ответа
            System.out.println(response.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
