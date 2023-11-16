package course.part3;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherExample {
    public static void main(String[] args) {
        String apiKey = "";
        String city = "Seoul";
        String urlString = "";
        try{
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");

            int responseCode = connection.getResponseCode(); // 200
            if(responseCode == 200){
                //스트림(Stream = 입력,출력)의 연결
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuffer content = new StringBuffer();
                while((inputLine=in.readLine())!=null){
                    content.append(inputLine);
                }
                in.close();
                System.out.println("content.toString() = " + content.toString());
                //{ }
                JsonObject weatherData = JsonParser.parseString(content.toString()).getAsJsonObject();
                JsonObject mainData = weatherData.getAsJsonObject("main");
                double temp = mainData.get("temp").getAsDouble();
                System.out.println("temp = " + temp);
                connection.disconnect();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
