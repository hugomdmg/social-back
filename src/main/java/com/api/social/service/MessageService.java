package com.api.social.service;

import org.springframework.stereotype.Service;

import com.api.social.repository.MessageRepository;
import java.util.*;
import com.api.social.model.*;

@Service
public class MessageService {

	private MessageRepository messageRepository;
	
	MessageService(MessageRepository messageRepository){
		this.messageRepository = messageRepository;
	}
	
	public List<Message> getMessagesByChatId(Integer id){
		return this.messageRepository.findMessagesByChatId(id);
	}
	
	public Message saveMessage(Message message) {
		return this.messageRepository.save(message);
	}
}
