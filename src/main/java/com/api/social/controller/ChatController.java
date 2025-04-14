package com.api.social.controller;
import com.api.social.service.*;

import org.springframework.web.bind.annotation.*;
import com.api.social.model.*;
import java.util.List;


@RestController
@RequestMapping("/chat")
@CrossOrigin(origins = {"http://localhost:4200", "https://social-flame-pi.vercel.app/"})
public class ChatController {


	private ChatService chatService;
	
	ChatController(ChatService chatService){
		this.chatService = chatService;
	}
	
	@PostMapping("/create")
	public Chat create(@RequestBody Chat chat) {
		System.out.print(chat.getUser1_id());
		System.out.print(chat.getUser2_id());

		this.chatService.createChat(chat);
		return chat;
	}
	
	@PostMapping("/find")
	public List<Chat> findByUser(@RequestBody User user) {
		return this.chatService.findChatsByUserId(user.getId());
		
	}
}
