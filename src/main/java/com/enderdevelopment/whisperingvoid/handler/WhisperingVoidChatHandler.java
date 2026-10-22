package com.enderdevelopment.whisperingvoid.handler;

import com.enderdevelopment.whisperingvoid.entity.WhisperingVoidEntity;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;

@EventBusSubscriber(modid = "whisperingvoid")
public class WhisperingVoidChatHandler {
    @SubscribeEvent
    public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
        if (event.getEntity() instanceof ServerPlayer player) {
            player.sendSystemMessage(Component.literal("Whispering Void has entered the world."));
        }
    }

    @SubscribeEvent
    public static void onPlayerChat(PlayerEvent.PlayerChatEvent event) {
        if (event.getEntity() instanceof ServerPlayer player) {
            // Implement chat logic here
        }
    }
}