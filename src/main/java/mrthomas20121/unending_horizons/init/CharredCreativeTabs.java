package mrthomas20121.unending_horizons.init;

import mrthomas20121.unending_horizons.UnendingHorizons;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class CharredCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UnendingHorizons.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BLOCK_TAB = register("block", () -> new ItemStack(UnendingBlocks.BLIGHT_NYLIUM.get()), CharredCreativeTabs::fillBlockTab);
    public static final RegistryObject<CreativeModeTab> ITEM_TAB = register("item", () -> new ItemStack(UnendingItems.SULFUR_DUST.get()), CharredCreativeTabs::fillItemTab);

    private static RegistryObject<CreativeModeTab> register(String name, Supplier<ItemStack> icon, CreativeModeTab.DisplayItemsGenerator displayItems)
    {
        return CREATIVE_TABS.register(name, () -> CreativeModeTab.builder()
                .icon(icon)
                .title(Component.translatable("creative_tab.charred_horizons." + name))
                .displayItems(displayItems)
                .build());
    }

    public static void fillItemTab(CreativeModeTab.ItemDisplayParameters parameters, CreativeModeTab.Output out) {
        out.accept(UnendingItems.SULFUR_DUST.get());
        out.accept(UnendingItems.SULFURIC_BONE.get());
        out.accept(UnendingBlocks.BLIGHT_ROOT.get());
        out.accept(UnendingBlocks.BLIGHT_FUNGUS.get());
        out.accept(UnendingBlocks.WITHERED_FUNGUS.get());
    }

    public static void fillBlockTab(CreativeModeTab.ItemDisplayParameters parameters, CreativeModeTab.Output out) {
        out.accept(UnendingBlocks.BLIGHT_NYLIUM.get());
        out.accept(UnendingBlocks.BLIGHT_NETHER_WART_BLOCK.get());
        out.accept(UnendingBlocks.BLIGHT_STEM.get());
        out.accept(UnendingBlocks.BLIGHT_HYPHAE.get());
        out.accept(UnendingBlocks.STRIPPED_BLIGHT_STEM.get());
        out.accept(UnendingBlocks.STRIPPED_BLIGHT_HYPHAE.get());
        out.accept(UnendingBlocks.BLIGHT_PLANKS.get());
        out.accept(UnendingBlocks.BLIGHT_SLAB.get());
        out.accept(UnendingBlocks.BLIGHT_STAIRS.get());
        out.accept(UnendingBlocks.BLIGHT_FENCE.get());
        out.accept(UnendingBlocks.BLIGHT_FENCE_GATE.get());
        out.accept(UnendingBlocks.BLIGHT_TRAPDOOR.get());
        out.accept(UnendingBlocks.BLIGHT_DOOR.get());
        out.accept(UnendingBlocks.BLIGHT_BUTTON.get());
        out.accept(UnendingBlocks.BLIGHT_SIGN.get());
        out.accept(UnendingBlocks.BLIGHT_HANGING_SIGN.get());

        out.accept(UnendingBlocks.WITHERED_NYLIUM.get());
        out.accept(UnendingBlocks.WITHERED_NETHER_WART_BLOCK.get());
        out.accept(UnendingBlocks.WITHERED_STEM.get());
        out.accept(UnendingBlocks.WITHERED_HYPHAE.get());
        out.accept(UnendingBlocks.STRIPPED_WITHERED_STEM.get());
        out.accept(UnendingBlocks.STRIPPED_WITHERED_HYPHAE.get());
        out.accept(UnendingBlocks.WITHERED_PLANKS.get());
        out.accept(UnendingBlocks.WITHERED_SLAB.get());
        out.accept(UnendingBlocks.WITHERED_STAIRS.get());
        out.accept(UnendingBlocks.WITHERED_FENCE.get());
        out.accept(UnendingBlocks.WITHERED_FENCE_GATE.get());
        out.accept(UnendingBlocks.WITHERED_TRAPDOOR.get());
        out.accept(UnendingBlocks.WITHERED_DOOR.get());
        out.accept(UnendingBlocks.WITHERED_BUTTON.get());
        out.accept(UnendingBlocks.WITHERED_SIGN.get());
        out.accept(UnendingBlocks.WITHERED_HANGING_SIGN.get());
        out.accept(UnendingBlocks.IMPROVED_FARMLAND_BLOCK.get());
    }
}
