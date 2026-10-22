package com.enderdevelopment.whisperingvoid.client.renderer;

import com.enderdevelopment.whisperingvoid.client.model.WhisperingVoidModel;
import com.enderdevelopment.whisperingvoid.entity.WhisperingVoidEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class WhisperingVoidRenderer extends MobRenderer<WhisperingVoidEntity, WhisperingVoidModel<WhisperingVoidEntity>> {
    public WhisperingVoidRenderer(EntityRendererProvider.Context context) {
        super(context, new WhisperingVoidModel<>(context.bakeLayer(WhisperingVoidModel.LAYER_LOCATION)), 0.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(WhisperingVoidEntity entity) {
        return new ResourceLocation("whisperingvoid", "textures/entity/whispering_void.png");
    }

    @Override
    public void render(WhisperingVoidEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}