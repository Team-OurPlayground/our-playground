package com.dong.ourplayground.web;


import com.dong.ourplayground.domain.chat.redistemplate.ChatRoom;
import com.dong.ourplayground.domain.chat.redistemplate.ChatRoomRepository;
import com.dong.ourplayground.web.dto.CreateRoomRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/chat")
public class ChatRoomController {


    private final ChatRoomRepository chatRoomRepository;

    @GetMapping("/rooms")
    @ResponseBody
    public List<ChatRoom> room() {
        return chatRoomRepository.findAll();
    }

    @PostMapping("/room")
    @ResponseBody
    public ChatRoom createRoom(@RequestBody CreateRoomRequestDTO createRoomRequestDTO) {
        return chatRoomRepository.createChatRoom(createRoomRequestDTO.getName());
    }

    @GetMapping("/room/{roomID}")
    @ResponseBody
    public ChatRoom roomInfo(@PathVariable String roomID) {
        return chatRoomRepository.findRoomById(roomID);
    }
}
