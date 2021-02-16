package com.qa.rest.tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;		//need to add them both manually
import static org.hamcrest.Matchers.*;			//hamcrest is for restassured methods

public class GetCallBDD 
{

	@Test
	public void test_numberOfCircuitsFor2017_Season()
	{
		/*
		given().
		when().
		then().
		assert()*/
		
		given().
		when().			//when what?
			get("http://ergast.com/api/f1/2017/circuits.json").						//get = what is the get method url, get will call the api
		then().																		//then what you want, i want to assert something(assert this particualr body)
			assertThat().
			statusCode(200).
			
			and().																	//asserting additional things and seperating by and
			
			body("MRData.CircuitTable.Circuits.circuitId", hasSize(20)).			//mrdata.circuittable(this is json object), has size method is already there in the api, what size are you expecting
			
			and().
			header("Content-Length", equalTo("4551"));
		
		
		//how to pass path parameter, query parameter
		//how to create rest assured specifcation builder, dataprovider, accessing secured api, authentication(normal and Oauth 2.0)
		//take authentication and pass it to some other api
	}
	
	
	
	
	
	
	
	
	
}
