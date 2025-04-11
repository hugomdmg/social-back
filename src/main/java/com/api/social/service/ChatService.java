package com.api.social.service;

import com.api.social.repository.ChatRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.social.model.*;
import java.util.List;

@Service
public class ChatService {

    @Autowired
	private ChatRepository chatRepository;
	
	ChatService(ChatRepository chatRepository){
		this.chatRepository = chatRepository;
	}
	
	public Chat createChat(Chat chat){
		this.chatRepository.save(chat);
		return chat;
	}
	
	public List<Chat> findChatsByUserId(Integer id){
		return this.chatRepository.findChatsByUserId(id);
	}
	

}
