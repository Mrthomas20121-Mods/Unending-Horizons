package mrthomas20121.unending_horizons.init;

import mrthomas20121.charred_horizons.block_entity.BlightHangingSignBlockEntity;
import mrthomas20121.charred_horizons.block_entity.BlightSignBlockEntity;
import mrthomas20121.charred_horizons.block_entity.WitheredHangingSignBlockEntity;
import mrthomas20121.charred_horizons.block_entity.WitheredSignBlockEntity;
import mrthomas20121.unending_horizons.UnendingHorizons;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CharredBlockEntities {

    public static DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, UnendingHorizons.MOD_ID);

    public static final RegistryObject<BlockEntityType<BlightSignBlockEntity>> BLIGHT_SIGN = BLOCK_ENTITY_TYPES.register("blight_sign", () ->
            BlockEntityType.Builder.of(BlightSignBlockEntity::new, UnendingBlocks.BLIGHT_WALL_SIGN.get(), UnendingBlocks.BLIGHT_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<BlightHangingSignBlockEntity>> BLIGHT_HANGING_SIGN = BLOCK_ENTITY_TYPES.register("blight_hanging_sign", () ->
            BlockEntityType.Builder.of(BlightHangingSignBlockEntity::new, UnendingBlocks.BLIGHT_WALL_HANGING_SIGN.get(), UnendingBlocks.BLIGHT_HANGING_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<WitheredSignBlockEntity>> WITHERED_SIGN = BLOCK_ENTITY_TYPES.register("withered_sign", () ->
            BlockEntityType.Builder.of(WitheredSignBlockEntity::new, UnendingBlocks.WITHERED_WALL_SIGN.get(), UnendingBlocks.WITHERED_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<WitheredHangingSignBlockEntity>> WITHERED_HANGING_SIGN = BLOCK_ENTITY_TYPES.register("withered_hanging_sign", () ->
            BlockEntityType.Builder.of(WitheredHangingSignBlockEntity::new, UnendingBlocks.WITHERED_WALL_HANGING_SIGN.get(), UnendingBlocks.WITHERED_HANGING_SIGN.get()).build(null));
}
