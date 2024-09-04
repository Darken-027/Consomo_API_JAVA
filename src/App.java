import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutionException;

public class App {
    public static void main(String[] args) throws Exception {
        try{
        URL url = new URL("https://api.chucknorris.io/jokes/random");

        HttpURLConnection connection = (HttpURLConnection)  url.openConnection();

        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();

        if(responseCode == 200){
            
        }else{
            throw new RuntimeException("Error al conectar a la API Code : " + responseCode);
        }

        } catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
