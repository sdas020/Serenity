package test1;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.when;
import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

//import static org.hamcrest.Matchers.
import java.util.HashMap;
import java.util.Map;

import cucumber.api.DataTable;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;
import net.serenitybdd.core.Serenity;




//@SuppressWarnings("deprecation")
public class API_Testing {

	//public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	
	@SuppressWarnings("deprecation")
	public void API_Demo(String posts){
	//{	
	//int code=get("http://jsonplaceholder.typicode.com/"+posts).statusCode();
	//Response resp=RestAssured.get("http://jsonplaceholder.typicode.com/posts");
	//	System.out.println("Status code 1 : "+code);
		HashMap<String,String> obj=new HashMap<String,String>();
		obj.put("Content-Type", "application/json");
		//String str=null;
//		 String response = when().get("http://jsonplaceholder.typicode.com/"+posts)
//			        .then()
//			        .statusCode(code)
//			        .extract().response().getBody().asString();
//		given().headers(obj).when().body(str).post();
//		when().
//        get("/lotto/{id}", 5).
//then().
//        statusCode(200).
//        body("lotto.lottoId", equalTo(5), 
//             "lotto.winners.winnerId");
		 
given().headers(obj).when().get("http://jsonplaceholder.typicode.com/posts");
		  
//     String jsonbody=get("http://jsonplaceholder.typicode.com/posts").then().extract().body().jsonPath().get("[2].title");
//     //String size=get("http://jsonplaceholder.typicode.com/posts").then().extract().body().jsonPath().get("[].size");
//		//Assert.assertEquals("200", code);
//		//String code1=Serenity.setSessionVariable(code).toString();
//		io.restassured.response.Response res=  when().get("http://jsonplaceholder.typicode.com/"+posts);
//		System.out.println("Response Body:- "+response);
//       //Serenity.setSessionVariable("response").to(response);
//		System.out.println("Status code 2: "+res.getStatusCode());
//		System.out.println("jason body="+jsonbody);
//		//String size=get("http://jsonplaceholder.typicode.com/posts").then().extract().body().jsonPath().get("size()");
//		System.out.println("size="+res.getStatusCode());
		int size=then().extract().body().jsonPath().get("size()");
		 for(int i=0;i<=size;i++)
		 {
			 String title="ratione ex tenetur perferendis";
			 String jsonbody1=then().extract().body().jsonPath().get("["+i+"].title");
			 
			 if(jsonbody1.equalsIgnoreCase(title))
			 {
				 System.out.println("Pass");
				 break;
			 }
			 
			
		 }
	}
		 
		 
//		 public void switchCase(String str1){
//		    
//		    switch(str1)
//		    {
//		        case "one":	System.out.println("one");
//		            break;
//		        case "two": System.out.println("two");
//		            break;
//		        case "three": System.out.println("three");
//		            break;
//		        default:
//		            System.out.println("no match");
//		            break;
//		    }
//			}
		 
	public void method(DataTable obj)
	{
		Map<String,String> obj1= obj.asMap(String.class, String.class);
		Map<String,String> obj2= new HashMap<String,String>();
		obj2.putAll(obj1);
		
		//then().assertThat().body("", containsString(""));
	}
}
	//}


