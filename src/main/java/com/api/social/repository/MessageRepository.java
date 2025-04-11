package com.api.social.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.api.social.model.*;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer>{

    @Query("SELECT c FROM Message c WHERE c.chat_id = :chatId")
    List<Message> findMessagesByChatId(@Param("chatId") Integer chatId);
}
