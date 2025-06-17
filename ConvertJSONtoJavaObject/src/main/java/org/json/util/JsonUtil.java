package org.json.util;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtil {
	
	private static ObjectMapper mapper = new ObjectMapper();
	
	public static String convertJavaObjectToJson(Object object) {
		String jsonResult = "";
		
		try {
			jsonResult = mapper.writeValueAsString(object);
		} catch (JsonGenerationException e) {
			System.out.println("ERROR CONVERT JAVA OBJECT TO JSON");
			e.printStackTrace();
		} catch (JsonMappingException e) {
			System.out.println("ERROR CONVERT JAVA OBJECT TO JSON");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR CONVERT JAVA OBJECT TO JSON");
			e.printStackTrace();
		}
		return jsonResult;
	}
	
	
	public static <T> T converJsonToJavaObject(String jsonString, Class<T>cls) {
		
		T resul = null;
		try {
			resul = mapper.readValue(jsonString, cls);
		} catch (JsonParseException e) {
			System.out.println("ERROR CONVERT JSON TO JAVA OBJECT");
			e.printStackTrace();
		} catch (JsonMappingException e) {
			System.out.println("ERROR CONVERT JSON TO JAVA OBJECT");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR CONVERT JSON TO JAVA OBJECT");
			e.printStackTrace();
		}
		
		return resul;
		
	}
	
}
