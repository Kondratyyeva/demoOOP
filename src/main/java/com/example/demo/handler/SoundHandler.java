package com.example.demo.handler;

import com.example.demo.attachmentGenerator.AttachmentGenerator;
import com.example.demo.entity.Attachment;
import com.example.demo.entity.AttachmentType;

public class SoundHandler extends AttachmentGenerator implements AttachmentHandler{
    @Override
    public void handle() {
        System.out.println("Handle attachment sound");
    }

    @Override
    public AttachmentType getAttachmentType() {
        return AttachmentType.SOUND;
    }

    @Override
    public Attachment generateAttachment() {
        var attachment = super.generateAttachment();
        return attachment;
    }
}
