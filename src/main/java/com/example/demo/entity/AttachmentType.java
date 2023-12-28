package com.example.demo.entity;

public enum AttachmentType {
    IMAGE("Image"),
    SOUND("Sound");
    private String name;

    AttachmentType(String name) {
        this.name = name;
    }
}
