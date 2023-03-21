package com.example.chatroomdemo.domain;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ChatRoomManager {
    private Map<String, ChatRoom> chatRooms;

    public ChatRoomManager() {
        this.chatRooms = new HashMap<>();
    }

    public void joinRoom(String roomId, String userId) {
        ChatRoom chatRoom = chatRooms.get(roomId);
        if (chatRoom == null) {
            chatRoom = new ChatRoom(roomId);
            chatRooms.put(roomId, chatRoom);
        }
        chatRoom.join(userId);
        System.out.println(userId + " joined room " + roomId);
        List<String> members = chatRoom.getMembers();
        members.remove(userId);
        System.out.println("Room " + roomId + " members: " + members);
    }

    public void leaveRoom(String roomId, String userId) {
        ChatRoom chatRoom = chatRooms.get(roomId);
        if (chatRoom == null) {
            return;
        }
        chatRoom.leave(userId);
        System.out.println(userId + " left room " + roomId);
        List<String> members = chatRoom.getMembers();
        members.remove(userId);
        System.out.println("Room " + roomId + " members: " + members);
    }
}
