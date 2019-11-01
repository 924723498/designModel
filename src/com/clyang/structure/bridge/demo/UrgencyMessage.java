package com.clyang.structure.bridge.demo;

public class UrgencyMessage extends AbstractMessage {
    public UrgencyMessage(MessageImplementor implementor) {
        super(implementor);
    }

    @Override
    public void sendMessage(String message, String toUser) {

        super.sendMessage("加急:"+message, toUser);
    }

    /**
     * 紧急情况需要监听消息状态
     * @param messageId
     * @return
     */
    public Object watch(String messageId){
        return null;
    }
}
