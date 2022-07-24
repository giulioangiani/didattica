package httpclientproject;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;
/**
 *
 * @author Giulio Angiani 
 */
public class HTTPclientProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException, JSONException {
         HttpClient client = HttpClient.newHttpClient();
         
         /*
         String url = "http://localhost/ifoa/json/loadDateTime.php";
         HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET() // GET is default
                .build();
         
         HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

         // parse JSON string
         String json = response.body();
         JSONObject obj = new JSONObject(json);
         String esito = (String)obj.get("esito");
         String dataora = (String)obj.get("testo");
         
         
         System.out.println("Esito dell'operazione : " + esito);
         System.out.println("Data e Ora corrente : " +dataora);
           */
         
         HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("http://localhost/ifoa/json/check.php?usr=giuang&pwd=ifoa"))
                .uri(URI.create("http://94.177.213.7/ws/oraesatta/"))
                .GET() // GET is default
                .build();
         
         HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

         // parse JSON string
         String json = response.body();
         System.out.println("json = " + json);
         JSONObject obj = new JSONObject(json);
         System.out.println(obj.get("hour")+":"+obj.get("minutes"));
	 if (obj.get("risultato").equals("OK")) 
		System.out.println("OK riconosciuto");
	 else
		System.out.println("Username o password errata");

         /*
         HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost/ifoa/json/loadDateTime.php"))
                .GET() // GET is default
                .build();
         
         HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

         // parse JSON string
         String json = response.body();
         JSONObject obj = new JSONObject(json);
         System.out.println(obj.get("nome"));
         System.out.println(obj.get("cognome"));
         
         // servizio somma
         int a = 1;
         int b = 2;
         request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost/ifoa/somma.php?a="+a+"&b="+b))
                .GET() // GET is default
                .build();
         
         response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
          System.out.println("La somma è " + response.body());
          
          
         String url = "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02";

          request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET() // GET is default
                .build();
         
         response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

         // parse JSON string
         json = response.body();
         obj = new JSONObject(json);
         JSONArray ja = obj.getJSONArray("weather");
         JSONObject first = ja.getJSONObject(0);
         System.out.println("Today in " + obj.get("name") + " it's " + first.get("main"));
         
         
         
        var values = new HashMap<String, String>() {{
            put("name", "John Doe");
            put ("occupation", "gardener");
        }};
 
        client = HttpClient.newHttpClient();
        request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost/ifoa/post.php"))
                .POST(HttpRequest.BodyPublishers.ofString("{\"d\":\"1\"}"))
                .build();

        response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        */
    }
    
}
