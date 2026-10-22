package com.enderdevelopment.whisperingvoid.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class WhisperingVoidEntity extends Monster {
    protected WhisperingVoidEntity(EntityType<? extends Monster> entityType, Level level) {
        super(entityType, level);
    }
}