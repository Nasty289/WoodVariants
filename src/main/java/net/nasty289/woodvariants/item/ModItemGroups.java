package net.nasty289.woodvariants.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.nasty289.woodvariants.WoodVariants;

public class ModItemGroups {

    public static final ItemGroup WOOD_VARIANTS_INGREDIENTS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(WoodVariants.MOD_ID, "wood_variants_ingredients"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SPRUCE_STICK))
                    .displayName(Text.translatable("itemgroup.wood_variants.wood_variants_ingredients"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SPRUCE_STICK);
                        entries.add(ModItems.WARPED_STICK);
                        entries.add(ModItems.ACACIA_STICK);
                        entries.add(ModItems.BIRCH_STICK);
                        entries.add(ModItems.CHERRY_STICK);
                        entries.add(ModItems.CRIMSON_STICK);
                        entries.add(ModItems.DARK_OAK_STICK);
                        entries.add(ModItems.JUNGLE_STICK);
                        entries.add(ModItems.MANGROVE_STICK);
                        entries.add(ModItems.PALE_OAK_STICK);
                    }).build());

    public static void registerItemGroups() {
        WoodVariants.LOGGER.info("Registering Item Groups for " + WoodVariants.MOD_ID);
    }
}
