package mrthomas20121.unending_horizons.data;

import mrthomas20121.unending_horizons.UnendingHorizons;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class UnendingRegistrySets extends DatapackBuiltinEntriesProvider {

    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, UnendingConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, UnendingPlacedFeatures::bootstrap);

    public UnendingRegistrySets(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(UnendingHorizons.MOD_ID));
    }
}
