package com.example.thoaduong.qlktx;

/**
 * Created by thoaduong on 07/06/2018.
 */

class ChatBubble {
    private String content;
    private boolean myMessage;

    public ChatBubble(String content, boolean myMessage) {
        this.content = content;
        this.myMessage = myMessage;
    }

    public String getContent() {
        return content;
    }

    public boolean myMessage() {
        return myMessage;
    }
}
