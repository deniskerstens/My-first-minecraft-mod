package org.test.myfirstmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties TEST_FOOD =
            new FoodProperties.Builder().nutrition(8).saturationMod(1.2f).build();
}
