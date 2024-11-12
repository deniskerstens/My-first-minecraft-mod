package org.test.myfirstmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.test.myfirstmod.Myfirstmod;
import org.test.myfirstmod.item.custom.FuelItem;
import org.test.myfirstmod.item.custom.MetalDetectorItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =  DeferredRegister.create(ForgeRegistries.ITEMS, Myfirstmod.MOD_ID);

    public static final RegistryObject<Item> RANDOMTHINGIMADEINASEPRITEFORTHISMOD = ITEMS.register("randomthingimadeinasepriteforthismod", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NEW_RANDOM_THING = ITEMS.register("new_random_thing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector", () -> new MetalDetectorItem(new Item.Properties().durability(30)));
    public static final RegistryObject<Item> TEST_FOOD = ITEMS.register("test_food", () -> new Item(new Item.Properties().food(ModFoods.TEST_FOOD)));
    public static final RegistryObject<Item> TEST_FUEL = ITEMS.register("test_fuel", () -> new FuelItem(new Item.Properties(), 400));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
