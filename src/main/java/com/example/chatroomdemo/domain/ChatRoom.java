package com.example.chatroomdemo.domain;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    private String roomId;
    private List<String> members;

    public ChatRoom(String roomId) {
        this.roomId = roomId;
        this.members = new ArrayList<>();
    }

    public void join(String userId) {
        members.add(userId);
    }

    public void leave(String userId) {
        members.remove(userId);
    }

    public List<String> getMembers() {
        return members;
    }
}
