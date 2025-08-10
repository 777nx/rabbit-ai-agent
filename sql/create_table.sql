drop database if exists ai_agent;

create database ai_agent;

use ai_agent;

drop table if exists chat_message;

-- 创建聊天消息表
CREATE TABLE IF NOT EXISTS chat_message
(
    id             bigint      NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    conversationId varchar(64) NOT NULL COMMENT '会话ID',
    content        text        NOT NULL COMMENT '消息内容',
    role           varchar(32) NOT NULL COMMENT '角色：user/assistant/system',
    tokens         int                  DEFAULT '0' COMMENT '消息token数',
    createTime     datetime    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updateTime     datetime    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    isDelete       tinyint              DEFAULT '0' NOT NULL COMMENT '是否删除',
    PRIMARY KEY (id),
    KEY `idx_conversation_id` (conversationId)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='聊天消息表';
