package com.example.demo.attachmentGenerator;

import com.example.demo.entity.Attachment;
import com.example.demo.entity.AttachmentType;

public abstract class AttachmentGenerator {

    public abstract AttachmentType getAttachmentType();
    protected Attachment generateAttachment(){
        System.out.println("Generating attachment");
        //stupid logic
        return new Attachment();
    }
}
