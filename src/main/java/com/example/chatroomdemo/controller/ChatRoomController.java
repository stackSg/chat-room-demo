package com.example.chatroomdemo.controller;

import com.example.chatroomdemo.domain.ChatRoomManager;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chatroom")
public class ChatRoomController {
    private ChatRoomManager chatRoomManager;

    public ChatRoomController() {
        this.chatRoomManager = new ChatRoomManager();
    }

    @PostMapping("/{roomId}/{userId}")
    public void joinRoom(@PathVariable String roomId, @PathVariable String userId) {
        chatRoomManager.joinRoom(roomId, userId);
    }

    @DeleteMapping("/{roomId}/{userId}")
    public void leaveRoom(@PathVariable String roomId, @PathVariable String userId) {
        chatRoomManager.leaveRoom(roomId, userId);
    }
}
