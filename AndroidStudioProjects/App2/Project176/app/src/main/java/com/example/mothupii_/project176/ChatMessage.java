package com.example.mothupii_.project176;

/**
 * Created by Mothupii_ on 2017-10-07.
 */

public class ChatMessage
    {
        private Object messageText;
        public boolean left;
        public String message;
        //newly added with firebase
        private long messageTime;
        private String messageUser;

        public ChatMessage(boolean left, String message)
        {
        super();
        this.left = left;
        this.message = message;
    }
    public ChatMessage()
    {

    }
        public Object getMessageText()
        {
            return messageText;
        }


    public void setMessageText(String messageText)
    {
        this.messageText = messageText;
    }

    public String getMessageUser()
    {
        return messageUser;
    }

    public void setMessageUser(String messageUser)
    {
        this.messageUser = messageUser;
    }

    public void setMessageTime(long messageTime)
    {
        this.messageTime = messageTime;
    }
}
