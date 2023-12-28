package com.example.demo.service;

import com.example.demo.entity.Attachment;
import com.example.demo.entity.AttachmentType;

public class AttachmentServicePoor {
    public void handleAttachment(Attachment attachment){
        if(attachment.getType().equals(AttachmentType.IMAGE)){
            System.out.println("Handle attachment image");
        } else if(attachment.getType().equals(AttachmentType.SOUND)){
            System.out.println("Handle attachment sound");
        }
    }
}
