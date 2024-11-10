package org.test.myfirstmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.test.myfirstmod.Myfirstmod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =  DeferredRegister.create(ForgeRegistries.ITEMS, Myfirstmod.MOD_ID);

    public static final RegistryObject<Item> RANDOMTHINGIMADEINASEPRITEFORTHISMOD = ITEMS.register("randomthingimadeinasepriteforthismod", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NEW_RANDOM_THING = ITEMS.register("new_random_thing", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
