package net.crypticverse.limestonemod.item;

import net.crypticverse.limestonemod.LimestoneMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class LimestoneItems {
    public static final Item RAW_LIMESTONE = registerItem("raw_limestone", new Item(new FabricItemSettings()));
    public static final Item LIMESTONE_PIECE = registerItem("limestone_piece", new Item(new FabricItemSettings()));
    public static final Item LIMESTONE_PICKAXE = registerItem("limestone_pickaxe", new PickaxeItem(LimestoneToolMaterial.LIMESTONE, 0, -2.5f, new FabricItemSettings()));
    public static final Item LIMESTONE_AXE = registerItem("limestone_axe", new AxeItem(LimestoneToolMaterial.LIMESTONE, 4, -3f, new FabricItemSettings()));
    public static final Item LIMESTONE_SHOVEL = registerItem("limestone_shovel", new ShovelItem(LimestoneToolMaterial.LIMESTONE, 1, -3f, new FabricItemSettings()));
    public static final Item LIMESTONE_SWORD = registerItem("limestone_sword", new SwordItem(LimestoneToolMaterial.LIMESTONE, 5, -2.3f, new FabricItemSettings()));
    public static final Item LIMESTONE_HOE = registerItem("limestone_hoe", new HoeItem(LimestoneToolMaterial.LIMESTONE, -2, -2.5f, new FabricItemSettings()));

    private static Item registerItem (String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(LimestoneMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        LimestoneMod.LOGGER.info("Registering Mod Items for" + LimestoneMod.MOD_ID);
    }

}
