package com.httt.car_management.services.helper;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ResponseMessageFactory {
	
	private static Map<ResponseMessageType, Supplier<ResponseMessage>> maps = new HashMap<>(); 
	
	static {
		maps.put(ResponseMessageType.SUCCESS, ResponseMessage::new);
		maps.put(ResponseMessageType.ERROR, ResponseMessage::new);
	}
	
	public static ResponseMessage getResponseMessage(ResponseMessageType type) {
		
		if (!maps.containsKey(type)) {
			maps.put(type, ResponseMessage::new);
		}
		return maps.get(type).get();
	}
}

enum ResponseMessageType {
	SUCCESS, ERROR
}
