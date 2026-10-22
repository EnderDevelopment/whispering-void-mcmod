package com.enderdevelopment.whisperingvoid.handler;

import com.enderdevelopment.whisperingvoid.entity.WhisperingVoidEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;

@EventBusSubscriber(modid = "whisperingvoid")
public class WhisperingVoidBehaviorHandler {
    @SubscribeEvent
    public static void onEntityJoinLevel(EntityJoinLevelEvent event) {
        if (event.getEntity() instanceof WhisperingVoidEntity whisperingVoid) {
            whisperingVoid.goalSelector.addGoal(1, new NearestAttackableTargetGoal<>(whisperingVoid, Player.class, true));
            whisperingVoid.goalSelector.addGoal(2, new WhisperingVoidAttackGoal(whisperingVoid));
        }
    }

    static class WhisperingVoidAttackGoal extends Goal {
        private final WhisperingVoidEntity whisperingVoid;

        public WhisperingVoidAttackGoal(WhisperingVoidEntity whisperingVoid) {
            this.whisperingVoid = whisperingVoid;
        }

        @Override
        public boolean canUse() {
            return whisperingVoid.getTarget() != null;
        }

        @Override
        public void tick() {
            if (whisperingVoid.getTarget() instanceof Player player) {
                // Implement attack logic here
            }
        }
    }
}