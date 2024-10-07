package mrthomas20121.unending_horizons.data;

import mrthomas20121.charred_horizons.init.CharredBlocks;
import mrthomas20121.charred_horizons.init.CharredFeatures;
import mrthomas20121.unending_horizons.UnendingHorizons;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.HugeFungusConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NetherForestVegetationConfig;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;

public class UnendingConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> BLIGHT_FUNGUS = createKey("blight_fungus");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLIGHT_FUNGUS_PLANTED = createKey("blight_fungus_planted");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLIGHT_VEGETATION = createKey("blight_vegetation");

    public static final ResourceKey<ConfiguredFeature<?, ?>> WITHERED_FUNGUS = createKey("withered_fungus");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WITHERED_FUNGUS_PLANTED = createKey("withered_fungus_planted");

    public static final ResourceKey<ConfiguredFeature<?, ?>> WITHERED_VEGETATION = createKey("withered_vegetation");

    public static final ResourceKey<ConfiguredFeature<?, ?>> DROOPING_VINES = createKey("drooping_vines");

    public static ResourceKey<ConfiguredFeature<?, ?>> createKey(String p_255643_) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(UnendingHorizons.MOD_ID, p_255643_));
    }

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        BlockPredicate blockpredicate = BlockPredicate.matchesBlocks(Blocks.OAK_SAPLING, Blocks.SPRUCE_SAPLING, Blocks.BIRCH_SAPLING, Blocks.JUNGLE_SAPLING, Blocks.ACACIA_SAPLING, Blocks.CHERRY_SAPLING, Blocks.DARK_OAK_SAPLING, Blocks.MANGROVE_PROPAGULE, Blocks.DANDELION, Blocks.TORCHFLOWER, Blocks.POPPY, Blocks.BLUE_ORCHID, Blocks.ALLIUM, Blocks.AZURE_BLUET, Blocks.RED_TULIP, Blocks.ORANGE_TULIP, Blocks.WHITE_TULIP, Blocks.PINK_TULIP, Blocks.OXEYE_DAISY, Blocks.CORNFLOWER, Blocks.WITHER_ROSE, Blocks.LILY_OF_THE_VALLEY, Blocks.BROWN_MUSHROOM, Blocks.RED_MUSHROOM, Blocks.WHEAT, Blocks.SUGAR_CANE, Blocks.ATTACHED_PUMPKIN_STEM, Blocks.ATTACHED_MELON_STEM, Blocks.PUMPKIN_STEM, Blocks.MELON_STEM, Blocks.LILY_PAD, Blocks.NETHER_WART, Blocks.COCOA, Blocks.CARROTS, Blocks.POTATOES, Blocks.CHORUS_PLANT, Blocks.CHORUS_FLOWER, Blocks.TORCHFLOWER_CROP, Blocks.PITCHER_CROP, Blocks.BEETROOTS, Blocks.SWEET_BERRY_BUSH, Blocks.WARPED_FUNGUS, Blocks.CRIMSON_FUNGUS, Blocks.WEEPING_VINES, Blocks.WEEPING_VINES_PLANT, Blocks.TWISTING_VINES, Blocks.TWISTING_VINES_PLANT, Blocks.CAVE_VINES, Blocks.CAVE_VINES_PLANT, Blocks.SPORE_BLOSSOM, Blocks.AZALEA, Blocks.FLOWERING_AZALEA, Blocks.MOSS_CARPET, Blocks.PINK_PETALS, Blocks.BIG_DRIPLEAF, Blocks.BIG_DRIPLEAF_STEM, Blocks.SMALL_DRIPLEAF);

        register(context, BLIGHT_FUNGUS, CharredFeatures.HUGE_FUNGUS.get(), new HugeFungusConfiguration(CharredBlocks.BLIGHT_NYLIUM.get().defaultBlockState(), CharredBlocks.BLIGHT_STEM.get().defaultBlockState(), CharredBlocks.BLIGHT_NETHER_WART_BLOCK.get().defaultBlockState(), CharredBlocks.EXOTIC_SHROOMLIGHT.get().defaultBlockState(), blockpredicate, false));
        register(context, BLIGHT_FUNGUS_PLANTED, CharredFeatures.HUGE_FUNGUS.get(), new HugeFungusConfiguration(CharredBlocks.BLIGHT_NYLIUM.get().defaultBlockState(), CharredBlocks.BLIGHT_STEM.get().defaultBlockState(), CharredBlocks.BLIGHT_NETHER_WART_BLOCK.get().defaultBlockState(), CharredBlocks.EXOTIC_SHROOMLIGHT.get().defaultBlockState(), blockpredicate, true));
        register(context, WITHERED_FUNGUS, CharredFeatures.HUGE_FUNGUS.get(), new HugeFungusConfiguration(CharredBlocks.WITHERED_NYLIUM.get().defaultBlockState(), CharredBlocks.WITHERED_STEM.get().defaultBlockState(), CharredBlocks.WITHERED_NETHER_WART_BLOCK.get().defaultBlockState(), CharredBlocks.EXOTIC_SHROOMLIGHT.get().defaultBlockState(), blockpredicate, false));
        register(context, WITHERED_FUNGUS_PLANTED, CharredFeatures.HUGE_FUNGUS.get(), new HugeFungusConfiguration(CharredBlocks.WITHERED_NYLIUM.get().defaultBlockState(), CharredBlocks.WITHERED_STEM.get().defaultBlockState(), CharredBlocks.WITHERED_NETHER_WART_BLOCK.get().defaultBlockState(), CharredBlocks.EXOTIC_SHROOMLIGHT.get().defaultBlockState(), blockpredicate, true));

        WeightedStateProvider weightedstateprovider = new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(CharredBlocks.BLIGHT_ROOT.get().defaultBlockState(), 87).add(CharredBlocks.BLIGHT_FUNGUS.get().defaultBlockState(), 11).add(CharredBlocks.WITHERED_FUNGUS.get().defaultBlockState(), 1));

        register(context, BLIGHT_VEGETATION, Feature.NETHER_FOREST_VEGETATION, new NetherForestVegetationConfig(weightedstateprovider, 8, 4));
        register(context, WITHERED_VEGETATION, Feature.NETHER_FOREST_VEGETATION, new NetherForestVegetationConfig(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.WITHER_ROSE.defaultBlockState(), 87).add(CharredBlocks.WITHERED_FUNGUS.get().defaultBlockState(), 1)), 8, 4));

        register(context, DROOPING_VINES, CharredFeatures.DROOPING_VINES.get(), FeatureConfiguration.NONE);
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
