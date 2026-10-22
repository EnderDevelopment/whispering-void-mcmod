package com.enderdevelopment.whisperingvoid.handler;

import com.enderdevelopment.whisperingvoid.entity.WhisperingVoidEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;

@EventBusSubscriber(modid = "whisperingvoid", bus = EventBusSubscriber.Bus.MOD)
public class WhisperingVoidSpawnHandler {
    @SubscribeEvent
    public static void registerSpawnPlacements(RegisterSpawnPlacementsEvent event) {
        event.register(EntityType.Builder.of(WhisperingVoidEntity::new, MobCategory.MONSTER).build(), MobSpawnSettings.SpawnerData.of(EntityType.CREEPER, 100, 1, 1), Biome.Selector.all(), MobSpawnSettings.SpawnerData::new);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(EntityType.Builder.of(WhisperingVoidEntity::new, MobCategory.MONSTER).build(), WhisperingVoidEntity.createAttributes().build());
    }
}