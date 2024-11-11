package org.test.myfirstmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.test.myfirstmod.Myfirstmod;
import org.test.myfirstmod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Myfirstmod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("random_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NEW_RANDOM_THING.get()))
            .title(Component.translatable("creativetab.random_tab")).displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.NEW_RANDOM_THING.get());
                output.accept(ModItems.RANDOMTHINGIMADEINASEPRITEFORTHISMOD.get());
                output.accept(ModBlocks.TEST_BLOCK.get());
                output.accept(ModBlocks.TEST_ORE.get());
                output.accept(ModItems.METAL_DETECTOR.get());
            }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
