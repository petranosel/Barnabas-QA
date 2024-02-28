package RestAssured;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;

public class RestAssuredget {

    public static void main(String[] args) {
//        getcall();
//        postcall();
       int id =postcall();
    putCall(id);
   deletecall(id);
    }
    public static void getcall() {
        RestAssured.baseURI = "https://gorest.co.in/public/v2";
        Response response = RestAssured.given()
                .when()
                .get("/users");
        int StatusCode = response.getStatusCode();
        System.out.println("status code:" +StatusCode );
        JSONArray jsonarray = new JSONArray(response.getBody().asString());

        System.out.println("response:");

        for (int i = 0; i < jsonarray.length(); i++) {
            JSONObject jsonObject = jsonarray.getJSONObject(i);
            int id = jsonObject.getInt("id");
            String name = jsonObject.getString("name");
            String email = jsonObject.getString("email");
            String gender = jsonObject.getString("gender");
            String status = jsonObject.getString("status");


            System.out.println(id+ "|" + name + "|" + email + "|" + gender + "|" + status);

        }


    }

  public static int postcall(){
      RestAssured.baseURI = "https://gorest.co.in/public/v2";

      String requestBody = "{\"name\": \"bar abcd\", \"email\": \"barabcd@something.com\", \"gender\": \"male\", \"status\": \"active\"}";
      String BearerToken ="Bearer 3fa834afcd0b15783b04203b35c1aa6b77315c465b300d57f3697c1e0b8b6631";
    Response response = RestAssured.given()
            .contentType(ContentType.JSON)
            .header("Authorization",BearerToken)
            .body(requestBody)
            .when()
            .post("/users");

    JSONObject getID = new JSONObject(response.getBody().asString());
    int id = getID.getInt("id");

    String responseBody = response.getBody().asString();
    System.out.println("Response Body:");
    System.out.println(responseBody);
    int statusCode = response.getStatusCode();
    System.out.println("Status Code: " + statusCode);

    return id;

    }
public  static  void putCall(int id){
    RestAssured.baseURI = "https://gorest.co.in/public/v2";
    String requestBody = "{\"name\": \"john Smith\",\"email\":\"johdoe@examble.com\",\"gender\":\"male\",\"status\":\"active\"}";
   String bearerToken = "bearer 3fa834afcd0b15783b04203b35c1aa6b77315c465b300d57f3697c1e0b8b6631 ";
    Response response = RestAssured.given()
            .contentType(ContentType.JSON)
            .header("Authorization",bearerToken)
            .body(requestBody)
            .when()
            .put("/users/" + id);

    String responseBody = response.getBody().asString();
    System.out.println("response Body: ");
    System.out.println(responseBody);


}
 public static void deletecall (int id){
   RestAssured.baseURI= "https://gorest.co.in/public/v2" ;
   String bearerToken = "bearer 3fa834afcd0b15783b04203b35c1aa6b77315c465b300d57f3697c1e0b8b6631";
     Response response = RestAssured.given()

             .header("Authorization",bearerToken)
             .when()
             .delete("/users/" + id);
 String responseBody = response.getBody().asString();
     System.out.println("response:");
     System.out.println(responseBody);

     int statusCode = response.getStatusCode();
     System.out.println("statusCode:" + statusCode);

    }


}