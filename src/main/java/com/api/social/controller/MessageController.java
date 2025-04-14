package com.api.social.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.api.social.model.*;
import com.api.social.service.MessageService;

@RestController
@RequestMapping("/message")
@CrossOrigin(origins = {"http://localhost:4200", "https://social-flame-pi.vercel.app/"})
public class MessageController {
	
	private MessageService messageService;
	
	MessageController(MessageService messageService){
		this.messageService = messageService;
	}

	@PostMapping("/messages-chat-id")
	public List<Message> GetMessagesByChatId(@RequestBody Id id) {
		System.out.print("hola");
		System.out.print(id);
		return this.messageService.getMessagesByChatId(id.getId());
	}
	
	@PostMapping("/send-message")
	public Message saveMessage(@RequestBody Message message) {
		return this.messageService.saveMessage(message);
	}
}
