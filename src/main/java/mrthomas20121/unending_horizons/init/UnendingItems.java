package mrthomas20121.unending_horizons.init;

import mrthomas20121.unending_horizons.UnendingHorizons;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class UnendingItems {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, UnendingHorizons.MOD_ID);

    public static RegistryObject<SignItem> BLIGHT_SIGN = ITEMS.register("blight_sign", () -> new SignItem(new Item.Properties().stacksTo(16), UnendingBlocks.BLIGHT_SIGN.get(), UnendingBlocks.BLIGHT_WALL_SIGN.get()));
    public static RegistryObject<SignItem> BLIGHT_HANGING_SIGN = ITEMS.register("blight_hanging_sign", () -> new HangingSignItem(UnendingBlocks.BLIGHT_HANGING_SIGN.get(), UnendingBlocks.BLIGHT_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static RegistryObject<SignItem> WITHERED_SIGN = ITEMS.register("withered_sign", () -> new SignItem(new Item.Properties().stacksTo(16), UnendingBlocks.WITHERED_SIGN.get(), UnendingBlocks.WITHERED_WALL_SIGN.get()));
    public static RegistryObject<SignItem> WITHERED_HANGING_SIGN = ITEMS.register("withered_hanging_sign", () -> new HangingSignItem(UnendingBlocks.WITHERED_HANGING_SIGN.get(), UnendingBlocks.WITHERED_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static RegistryObject<Item> SULFUR_DUST = ITEMS.register("sulfur_dust", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));

    public static RegistryObject<Item> SULFURIC_BONE = ITEMS.register("sulfuric_bone", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
}
