package com.enderdevelopment.whisperingvoid.handler;

import com.enderdevelopment.whisperingvoid.entity.WhisperingVoidEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.Entity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@EventBusSubscriber(modid = "whisperingvoid", bus = EventBusSubscriber.Bus.MOD)
public class WhisperingVoidAnimationHandler {
    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(WhisperingVoidModel.LAYER_LOCATION, WhisperingVoidModel::createBodyLayer);
    }

    public static void setupAnimations(WhisperingVoidEntity entity, ModelPart root, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        // Setup animations here
    }
}