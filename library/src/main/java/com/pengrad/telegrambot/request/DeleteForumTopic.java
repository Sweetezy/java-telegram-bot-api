package com.pengrad.telegrambot.request;

import com.pengrad.telegrambot.response.BaseResponse;

public class DeleteForumTopic extends BaseRequest<DeleteForumTopic, BaseResponse> {
    public DeleteForumTopic(Integer chatId, Integer messageThreadId) {
        super(BaseResponse.class);
        add("chat_id", chatId);
        add("message_thread_id", messageThreadId);
    }

    public DeleteForumTopic(String chatId, Integer messageThreadId) {
        super(BaseResponse.class);
        add("chat_id", chatId);
        add("message_thread_id", messageThreadId);
    }
}