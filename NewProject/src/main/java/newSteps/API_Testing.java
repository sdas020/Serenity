package newSteps;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.when;

import junit.framework.Assert;
import net.serenitybdd.core.Serenity;



//@SuppressWarnings("deprecation")
public class API_Testing {

	//public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	@SuppressWarnings("deprecation")
	public void API_Demo(){
	//{	
	int code=get("http://jsonplaceholder.typicode.com/posts").statusCode();
		System.out.println("Status code 1 : "+code);
		 String response = get("http://jsonplaceholder.typicode.com/posts")
			        .then()
			        .statusCode(code)
			        .extract().response().getBody().asString();
		
     String jsonbody=get("http://jsonplaceholder.typicode.com/posts").then().extract().body().jsonPath().get("[2].title");
     //String size=get("http://jsonplaceholder.typicode.com/posts").then().extract().body().jsonPath().get("[].size");
		Assert.assertEquals("200", code);
		//String code1=Serenity.setSessionVariable(code).toString();
		io.restassured.response.Response res=  when().get("http://jsonplaceholder.typicode.com/posts");
		System.out.println("Response Body:- "+response);
		System.out.println("Status code 2: "+res.getStatusCode());
		System.out.println("jason body="+jsonbody);
		//String size=get("http://jsonplaceholder.typicode.com/posts").then().extract().body().jsonPath().get("size()");
		System.out.println("size="+res.getStatusCode());
		
		 for(int i=0;i<100;i++)
		 {
			 String title="ratione ex tenetur perferendis";
			 String jsonbody1=get("http://jsonplaceholder.typicode.com/posts").then().extract().body().jsonPath().get("["+i+"].title");
			 if(jsonbody1.equalsIgnoreCase(title))
			 {
				 System.out.println("Pass");
				 break;
			 }
			
			
		 }
		 
	} 
	//}

}
