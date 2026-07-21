package com.jusblazm.myfirstmod.worldgen.tree;

import com.jusblazm.myfirstmod.MyFirstMod;
import com.jusblazm.myfirstmod.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower BLOODWOOD = new TreeGrower(MyFirstMod.MOD_ID + ":bloodwood",
            Optional.empty(), Optional.of(ModConfiguredFeatures.BLOODWOOD_KEY), Optional.empty());
}