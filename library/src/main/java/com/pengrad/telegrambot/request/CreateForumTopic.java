package com.pengrad.telegrambot.request;

import com.pengrad.telegrambot.response.CreateForumTopicResponse;

public class CreateForumTopic extends BaseRequest<CreateForumTopic, CreateForumTopicResponse> {

    public CreateForumTopic(String chatId, String name) {
        super(CreateForumTopicResponse.class);
        add("chat_id", chatId);
        add("name", name);
    }

    public CreateForumTopic(Integer chatId, String name) {
        super(CreateForumTopicResponse.class);
        add("chat_id", chatId);
        add("name", name);
    }

    public CreateForumTopic iconColor(Integer iconColor) {
        add("icon_color", iconColor);
        return this;
    }

    public CreateForumTopic iconCustomEmojiId(String iconCustomEmojiId) {
        add("icon_custom_emoji_id", iconCustomEmojiId);
        return this;
    }
}
