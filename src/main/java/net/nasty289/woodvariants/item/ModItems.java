package net.nasty289.woodvariants.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.nasty289.woodvariants.WoodVariants;

import java.util.function.Function;

public class ModItems {

    public static final Item SPRUCE_STICK = registerItem("spruce_stick", setting -> new Item(setting));
    public static final Item BIRCH_STICK = registerItem("birch_stick", setting -> new Item(setting));
    public static final Item ACACIA_STICK = registerItem("acacia_stick", setting -> new Item(setting));
    public static final Item CHERRY_STICK = registerItem("cherry_stick", setting -> new Item(setting));
    public static final Item CRIMSON_STICK = registerItem("crimson_stick", setting -> new Item(setting));
    public static final Item DARK_OAK_STICK = registerItem("dark_oak_stick", setting -> new Item(setting));
    public static final Item JUNGLE_STICK = registerItem("jungle_stick", setting -> new Item(setting));
    public static final Item MANGROVE_STICK = registerItem("mangrove_stick", setting -> new Item(setting));
    public static final Item PALE_OAK_STICK = registerItem("pale_oak_stick", setting -> new Item(setting));
    public static final Item WARPED_STICK = registerItem("warped_stick", setting -> new Item(setting));

    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(WoodVariants.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(WoodVariants.MOD_ID, name)))));
    }

    public static void registerModItems() {
        WoodVariants.LOGGER.info("Registering Mod Items for " + WoodVariants.MOD_ID);
    }
}
