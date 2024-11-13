package org.test.myfirstmod.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import org.test.myfirstmod.Myfirstmod;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> VALUABLE = tag("valuable");

        public static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Myfirstmod.MOD_ID, name));
        }
    }

    public static class Items {

    }
}
