package com.dong.ourplayground.web.dto;

import com.dong.ourplayground.domain.chat.ChatRoom;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreateRoomRequestDTO {
    private String name;

    @Builder
    public CreateRoomRequestDTO(String name) {
        this.name = name;
    }

    public ChatRoom toEntity() {
        return ChatRoom.builder()
                .name(name)
                .build();
    }
}
