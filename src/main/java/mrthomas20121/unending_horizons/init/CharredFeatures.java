package mrthomas20121.unending_horizons.init;

import mrthomas20121.charred_horizons.worldgen.feature.CharredHugeFungusFeature;
import mrthomas20121.charred_horizons.worldgen.feature.DroopingVinesFeature;
import mrthomas20121.unending_horizons.UnendingHorizons;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.HugeFungusConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CharredFeatures {

    public static DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(Registries.FEATURE, UnendingHorizons.MOD_ID);

    public static RegistryObject<DroopingVinesFeature> DROOPING_VINES = FEATURES.register("drooping_vines", () -> new DroopingVinesFeature(NoneFeatureConfiguration.CODEC));
    public static RegistryObject<CharredHugeFungusFeature> HUGE_FUNGUS = FEATURES.register("huge_fungus", () -> new CharredHugeFungusFeature(HugeFungusConfiguration.CODEC));
}
