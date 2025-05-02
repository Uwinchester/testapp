import org.apache.log4j.Logger;
import com.google.gson.Gson;

public class App {
    private static final Logger logger = Logger.getLogger(App.class);
    
    public static void main(String[] args) {
        // Intentionally vulnerable components
        String json = "{\"name\":\"test\"}";
        Gson gson = new Gson();
        Object obj = gson.fromJson(json, Object.class);
        
        logger.info("Parsed: " + obj);
        
        // Using outdated httpcomponents
        org.apache.http.client.HttpClient client = 
            new org.apache.http.impl.client.DefaultHttpClient();
    }
}
