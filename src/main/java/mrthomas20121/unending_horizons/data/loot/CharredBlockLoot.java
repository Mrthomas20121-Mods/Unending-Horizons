package mrthomas20121.unending_horizons.data.loot;

import mrthomas20121.unending_horizons.init.UnendingBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.Set;
import java.util.function.Supplier;

public class CharredBlockLoot extends BlockLootSubProvider {
    public CharredBlockLoot() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.add(UnendingBlocks.BLIGHT_NYLIUM.get(), (block) -> this.createSingleItemTableWithSilkTouch(block, Blocks.NETHERRACK));
        this.add(UnendingBlocks.WITHERED_NYLIUM.get(), (block) -> this.createSingleItemTableWithSilkTouch(block, Blocks.NETHERRACK));
        addNetherVinesDropTable(UnendingBlocks.DROOPING_VINES.get(), UnendingBlocks.DROOPING_VINES_PLANT.get());
        dropSelf(UnendingBlocks.IMPROVED_FARMLAND_BLOCK.get());
        dropSelf(UnendingBlocks.EXOTIC_SHROOMLIGHT.get());
        dropSelf(UnendingBlocks.BLIGHT_FUNGUS.get());
        dropSelf(UnendingBlocks.WITHERED_FUNGUS.get());
        dropSelf(UnendingBlocks.BLIGHT_FUNGUS.get());
        dropSelf(UnendingBlocks.WITHERED_FUNGUS.get());
        dropSelf(UnendingBlocks.BLIGHT_ROOT.get());
        dropSelf(UnendingBlocks.BLIGHT_NETHER_WART_BLOCK.get());
        dropSelf(UnendingBlocks.WITHERED_NETHER_WART_BLOCK.get());
        dropSelf(UnendingBlocks.DROOPING_VINES.get());
        dropSelf(UnendingBlocks.DROOPING_VINES_PLANT.get());
        dropSelf(UnendingBlocks.BLIGHT_STEM.get());
        dropSelf(UnendingBlocks.WITHERED_STEM.get());
        dropSelf(UnendingBlocks.BLIGHT_HYPHAE.get());
        dropSelf(UnendingBlocks.WITHERED_HYPHAE.get());
        dropSelf(UnendingBlocks.STRIPPED_BLIGHT_STEM.get());
        dropSelf(UnendingBlocks.STRIPPED_WITHERED_STEM.get());
        dropSelf(UnendingBlocks.STRIPPED_BLIGHT_HYPHAE.get());
        dropSelf(UnendingBlocks.STRIPPED_WITHERED_HYPHAE.get());
        dropSelf(UnendingBlocks.BLIGHT_PLANKS.get());
        dropSelf(UnendingBlocks.WITHERED_PLANKS.get());
        dropSelf(UnendingBlocks.BLIGHT_SLAB.get());
        dropSelf(UnendingBlocks.WITHERED_SLAB.get());
        dropSelf(UnendingBlocks.BLIGHT_STAIRS.get());
        dropSelf(UnendingBlocks.WITHERED_STAIRS.get());
        dropSelf(UnendingBlocks.BLIGHT_PRESSURE_PLATE.get());
        dropSelf(UnendingBlocks.WITHERED_PRESSURE_PLATE.get());
        dropSelf(UnendingBlocks.BLIGHT_BUTTON.get());
        dropSelf(UnendingBlocks.WITHERED_BUTTON.get());
        dropSelf(UnendingBlocks.BLIGHT_FENCE.get());
        dropSelf(UnendingBlocks.WITHERED_FENCE.get());
        dropSelf(UnendingBlocks.BLIGHT_FENCE_GATE.get());
        dropSelf(UnendingBlocks.WITHERED_FENCE_GATE.get());
        dropSelf(UnendingBlocks.BLIGHT_DOOR.get());
        dropSelf(UnendingBlocks.WITHERED_DOOR.get());
        dropSelf(UnendingBlocks.BLIGHT_TRAPDOOR.get());
        dropSelf(UnendingBlocks.WITHERED_TRAPDOOR.get());
        dropSelf(UnendingBlocks.BLIGHT_SIGN.get());
        dropOther(UnendingBlocks.BLIGHT_WALL_SIGN.get(), UnendingBlocks.BLIGHT_SIGN.get());
        dropSelf(UnendingBlocks.WITHERED_SIGN.get());
        dropOther(UnendingBlocks.WITHERED_WALL_SIGN.get(), UnendingBlocks.WITHERED_SIGN.get());
        dropSelf(UnendingBlocks.BLIGHT_HANGING_SIGN.get());
        dropOther(UnendingBlocks.BLIGHT_WALL_HANGING_SIGN.get(), UnendingBlocks.BLIGHT_HANGING_SIGN.get());
        dropSelf(UnendingBlocks.WITHERED_HANGING_SIGN.get());
        dropOther(UnendingBlocks.WITHERED_WALL_HANGING_SIGN.get(), UnendingBlocks.WITHERED_HANGING_SIGN.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return UnendingBlocks.BLOCKS.getEntries().stream().map(Supplier::get).toList();
    }
}
