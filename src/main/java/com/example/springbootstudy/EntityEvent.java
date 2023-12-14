package com.example.springbootstudy;

import lombok.Getter;

import java.util.EventObject;

public class EntityEvent extends EventObject {
    @Getter
    private final AccessType accessType;

    public EntityEvent(Object entiy, AccessType accessType) {
        super(entiy);
        this.accessType = accessType;
    }

}
