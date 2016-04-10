package com.emobot.rest.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.core.MultivaluedMap;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;

public class RestClient {
	/*public static void main(String[] args) {
		RestClient client = new RestClient();
		Map<String, String> inputParams = new HashMap<>();
		inputParams.put("message", "weather is good today");
		getChatResponse("https://calm-cliffs-49578.herokuapp.com/brain_bot/get_response", inputParams);
	}*/
	
	public static String getChatResponse(String url, Map<String, String> inputParams) {
		Client client = Client.create();

		WebResource webResource = client.resource(url);

		Set<String> keySet = inputParams.keySet();
		MultivaluedMap<String, String> qParams = new MultivaluedMapImpl();
		
		for(String key: keySet) {
			qParams.add(key, inputParams.get(key)); 
		}
		
		ClientResponse response = webResource.queryParams(qParams)
											.accept("application/json")
											.get(ClientResponse.class);
		
		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ response.getStatus());
		}

		String output = response.getEntity(String.class);

		System.out.println("Output from Server .... \n");
		System.out.println(output);

		return output;
	}
}
