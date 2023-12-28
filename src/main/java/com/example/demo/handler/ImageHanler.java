package com.example.demo.handler;

import com.example.demo.attachmentGenerator.AttachmentGenerator;
import com.example.demo.entity.Attachment;
import com.example.demo.entity.AttachmentType;

public class ImageHanler extends AttachmentGenerator implements AttachmentHandler{
    @Override
    public void handle() {
        System.out.println("Handle attachment image");
    }

    @Override
    public Attachment generateAttachment() {
        var attachment = super.generateAttachment();
        //
        return attachment;
    }


    @Override
    public AttachmentType getAttachmentType() {
        return null;
    }

}
