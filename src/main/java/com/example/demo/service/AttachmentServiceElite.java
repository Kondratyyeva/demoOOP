package com.example.demo.service;

import com.example.demo.entity.Attachment;
import com.example.demo.entity.AttachmentType;
import com.example.demo.handler.AttachmentHandler;
import com.example.demo.handler.ImageHanler;
import com.example.demo.handler.SoundHandler;

import java.util.HashMap;
import java.util.Map;

public class AttachmentServiceElite {
    private Map<AttachmentType, AttachmentHandler> attachmentHandlers = new HashMap<>();

    public AttachmentServiceElite() {
        attachmentHandlers.put(AttachmentType.IMAGE, new ImageHanler());
        attachmentHandlers.put(AttachmentType.SOUND, new SoundHandler());
    }

    public void handleAttachment(Attachment attachment){
        attachmentHandlers.get(attachment.getType()).handle();
    }

    public Attachment generateAttachment(AttachmentType attachmentType){
        return attachmentHandlers.get(attachmentType).generateAttachment();
    }
}
