package com.emobot.response;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import com.emobot.rest.client.RestClient;

public class RespondAPI {
	
	private String str;
	
	public RespondAPI(String str) {
		this.str = str;
	}

	public String getJsonResponseFromChatbot1(){
		Map<String, String> inputParams = new HashMap<String, String>();
		inputParams.put("message", str);
		String jsonString = RestClient.getChatResponse("http://calm-cliffs-49578.herokuapp.com/program_o_bot/get_response", inputParams);
		JSONObject obj = new JSONObject(jsonString);
		String response = obj.getString("botsay");
		return response;
	}
	
	public String getJsonResponseFromChatbot2(){
		Map<String, String> inputParams = new HashMap<String, String>();
		inputParams.put("message", str);
		String jsonString = RestClient.getChatResponse("http://calm-cliffs-49578.herokuapp.com/pers_forge_bot/get_response", inputParams);
		JSONObject obj = new JSONObject(jsonString);
		JSONObject obj1 = obj.getJSONObject("message");
		String response = obj1.getString("message");
		return response;
	}
	
	public String getJsonResponseFromChatbot3(){
		Map<String, String> inputParams = new HashMap<String, String>();
		inputParams.put("message", str);
		String jsonString = RestClient.getChatResponse("https://calm-cliffs-49578.herokuapp.com/brain_bot/get_response", inputParams);
		JSONObject obj = new JSONObject(jsonString);
		JSONObject obj1 = obj.getJSONObject("response");
		String response = obj1.getString("message");
		return response;
	}
	
	public String getJsonResponseFromChatbot4(){
		Map<String, String> inputParams = new HashMap<String, String>();
		inputParams.put("message", str);
		String jsonString = RestClient.getChatResponse("https://calm-cliffs-49578.herokuapp.com/eliza_bot/get_response", inputParams);
		JSONObject obj = new JSONObject(jsonString);
		JSONObject obj1 = obj.getJSONObject("response");
		String response = obj1.getString("message");
		return response;
	}
}
