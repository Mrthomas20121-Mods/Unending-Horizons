package mrthomas20121.unending_horizons;

import mrthomas20121.unending_horizons.data.UnendingDatagen;
import mrthomas20121.unending_horizons.init.*;
import mrthomas20121.unending_horizons.worldgen.CharredSurfaceData;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import terrablender.api.SurfaceRuleManager;

@Mod(UnendingHorizons.MOD_ID)
public class UnendingHorizons {

	public static final String MOD_ID = "unending_horizons";

	public UnendingHorizons() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		UnendingItems.ITEMS.register(bus);
		UnendingBlocks.BLOCKS.register(bus);
		CharredBlockEntities.BLOCK_ENTITY_TYPES.register(bus);
		CharredCreativeTabs.CREATIVE_TABS.register(bus);
		CharredEntityTypes.ENTITY_TYPES.register(bus);
		CharredFeatures.FEATURES.register(bus);
		CharredParticleTypes.PARTICLE_TYPES.register(bus);
		CharredLootModifiers.LOOT_MODIFIERS.register(bus);

		bus.addListener(UnendingDatagen::init);
		bus.addListener(this::setup);
	}

	public void setup(FMLCommonSetupEvent event) {
		SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.NETHER, MOD_ID, CharredSurfaceData.rules());
	}
}
