package com.webserver.restful;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MessageService {
	
	private Map<Long, Message> messages = DataBaseClass.getMessages();

	public List<Message> getAllMessages(){
		return new ArrayList<Message>(messages.values());
	}
	
	
	
	public MessageService() {
		messages.put(1L, new Message(1, "Hello Java", "User 1"));
		messages.put(2L, new Message(2, "Hello Rest", "User 2"));
		messages.put(3L, new Message(3, "Hello Jersey", "User 1"));
		messages.put(3L, new Message(3, "Hello Test 2", "User 1"));
	}



	public Message addMessage(Message message){
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message){
		if(message.getId() <= 0){
			return null;
		}
		messages.put(message.getId(), message);
		
		return message;
	}
	
	public Message removeMessage(long id){
		
		return messages.remove(id);
	}
	
	
	
}
