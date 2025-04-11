package com.api.social.repository;

import com.api.social.model.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ChatRepository extends JpaRepository<Chat, Integer> {

    @Query("SELECT c FROM Chat c WHERE c.user1_id = :userId OR c.user2_id = :userId")
    List<Chat> findChatsByUserId(@Param("userId") Integer userId);
}