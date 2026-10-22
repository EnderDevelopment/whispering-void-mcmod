package com.enderdevelopment.whisperingvoid;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("whisperingvoid")
public class WhisperingVoidMod {
    public WhisperingVoidMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        WhisperingVoidRegistry.register(modEventBus);
    }
}