package com.enderdevelopment.whisperingvoid.registry;

import com.enderdevelopment.whisperingvoid.entity.WhisperingVoidEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class WhisperingVoidRegistry {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(EntityType.class, "whisperingvoid");

    public static final EntityType<WhisperingVoidEntity> WHISPERING_VOID = ENTITY_TYPES.register("whispering_void", () -> EntityType.Builder.of(WhisperingVoidEntity::new, MobCategory.MONSTER).sized(0.6F, 1.8F).build("whispering_void"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}