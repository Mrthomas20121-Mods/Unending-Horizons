package mrthomas20121.unending_horizons.init;

import mrthomas20121.unending_horizons.UnendingHorizons;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.Registries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CharredParticleTypes {

    public static DeferredRegister<ParticleType<?>> PARTICLE_TYPES = DeferredRegister.create(Registries.PARTICLE_TYPE, UnendingHorizons.MOD_ID);

    public static RegistryObject<SimpleParticleType> BLIGHT_SPORE = PARTICLE_TYPES.register("blight_spore", () -> new SimpleParticleType(false));
}
