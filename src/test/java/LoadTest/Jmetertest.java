package LoadTest;




import org.apache.http.HttpResponse;
//import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Jmetertest {
    public static void main(String[] args) {

    int numberOfRequests = 10;
        HttpClient httpClient = HttpClients.createDefault();

        String url = "https://gorest.co.in/public/v2/users";


        try{
            for(int i = 0;i < numberOfRequests;i++){
                HttpGet request = new HttpGet(url);

                HttpResponse response = httpClient.execute(request);

                int statusCode = response.getStatusLine().getStatusCode();


                System.out.println("Status Code:" + statusCode);
            //System.out.println("response:" + response);
            long startTime  = System.currentTimeMillis();
            long  endTime = System.currentTimeMillis();
            long latency = endTime - startTime;
            System.out.println("latency:"   +  latency);
            System.out.println(startTime);
            System.out.println(endTime);

            BufferedReader reader = new BufferedReader(new  InputStreamReader(response.getEntity().getContent()));
      String line ;
      StringBuilder content = new StringBuilder();
      while((line=reader.readLine())!=null){
          content.append(line);
            }

            System.out.println( "response Content:" + content.toString());

            reader.close();
            Thread.sleep(100);

        }
    } catch (Exception e){e.printStackTrace();
        System.out.println(e.getMessage());

    }

    }
}





