package com.fantasy.rabbitaiagent.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fantasy.rabbitaiagent.model.entity.ChatMessage;
import com.fantasy.rabbitaiagent.service.ChatMessageService;
import com.fantasy.rabbitaiagent.mapper.ChatMessageMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author Fantasy
* @description 针对表【chat_message(聊天消息表)】的数据库操作Service实现
* @createDate 2025-08-11 00:30:38
*/
@Service
public class ChatMessageServiceImpl extends ServiceImpl<ChatMessageMapper, ChatMessage>
    implements ChatMessageService {

    @Override
    public List<ChatMessage> findLatestMessages(String conversationId, int limit) {
        // 只根据 conversationId 查询，不涉及 messageType
        return this.lambdaQuery()
                .eq(ChatMessage::getConversationId, conversationId)
                .last("limit " + limit)
                .list();
    }

    @Override
    public Boolean deleteByConversationId(String conversationId) {
        return this.remove(lambdaQuery().eq(ChatMessage::getConversationId,conversationId));
    }
}




