package com.dong.ourplayground.domain.chat.redistemplate;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

// TODO: redisTemplate -> redisRepository 로 교체
@Getter
@Setter
public class ChatRoom implements Serializable {
    private String id;
    private String name;

    public static ChatRoom create(String name) {
        ChatRoom chatRoom = new ChatRoom();
        chatRoom.id = UUID.randomUUID().toString();
        chatRoom.name = name;
        return chatRoom;
    }
}
