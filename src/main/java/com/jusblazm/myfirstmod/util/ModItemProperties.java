package com.jusblazm.myfirstmod.util;

import com.jusblazm.myfirstmod.MyFirstMod;
import com.jusblazm.myfirstmod.component.ModDataComponents;
import com.jusblazm.myfirstmod.item.ModItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;

public class ModItemProperties {
    public static void addCustomItemProperties() {
        ItemProperties.register(ModItems.CHISEL.get(), ResourceLocation.fromNamespaceAndPath(MyFirstMod.MOD_ID, "used"),
                (stack, level, entity, seed) -> stack.get(ModDataComponents.COORDINATES) != null ? 1f : 0f);
    }
}
