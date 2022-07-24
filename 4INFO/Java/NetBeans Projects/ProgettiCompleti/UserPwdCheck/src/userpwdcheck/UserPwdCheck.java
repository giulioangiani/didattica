package userpwdcheck;
import org. .fasterxml.jackson.databind.ObjectMapper;
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
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class UserPwdCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        // TODO code application logic here
         HttpClient client = HttpClient.newHttpClient();
        
         HashMap<String, String> params = new HashMap<>();
         params.put("username", "giulio");
         params.put("password", "anziano");
         ObjectMapper om = new ObjectMapper();
         
         
         String url = "http://localhost/ifoa/test.php";
         HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .POST(HttpRequest.BodyPublishers.ofString(data)) // GET is default
                .build();
         
         HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

         // parse JSON string
         String json = response.body();
         System.out.println(json);
//         JSONObject obj = new JSONObject(json);
//         String esito = (String)obj.get("esito");
//         String dataora = (String)obj.get("testo");
         
         
//         System.out.println("Esito dell'operazione : " + esito);
//         System.out.println("Data e Ora corrente : " +dataora);
    }
    
}
