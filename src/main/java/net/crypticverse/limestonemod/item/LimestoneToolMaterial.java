package net.crypticverse.limestonemod.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum LimestoneToolMaterial implements ToolMaterial {
    LIMESTONE(2, 100, 3, 2, 15, () -> Ingredient.ofItems(LimestoneItems.LIMESTONE_PIECE));
    private final int miningLevel;
    private final int itemDurability;
    private final int miningSpeed;
    private final int attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    LimestoneToolMaterial(int miningLevel, int itemDurability, int miningSpeed, int attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
