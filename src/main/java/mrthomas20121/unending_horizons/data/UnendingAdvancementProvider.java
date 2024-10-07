package mrthomas20121.unending_horizons.data;

import mrthomas20121.unending_horizons.UnendingHorizons;
import mrthomas20121.unending_horizons.init.UnendingBlocks;
import mrthomas20121.unending_horizons.init.CharredEntityTypes;
import mrthomas20121.unending_horizons.init.UnendingItems;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.critereon.EntityPredicate;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.KilledTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;

import java.util.function.Consumer;

public class UnendingAdvancementProvider implements ForgeAdvancementProvider.AdvancementGenerator {

    @Override
    public void generate(HolderLookup.Provider registries, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
        Advancement IMPROVED_FARMLAND = Advancement.Builder.advancement()
                .parent(new ResourceLocation("nether/root"))
                .display(UnendingBlocks.IMPROVED_FARMLAND_BLOCK.get(),
                        Component.translatable("advancement.charred_horizons.improved_farmland"),
                        Component.translatable("advancement.charred_horizons.improved_farmland.desc"),
                        new ResourceLocation("textures/block/netherrack.png"),
                        FrameType.TASK, true, true, false)
                .addCriterion("gold_ring", InventoryChangeTrigger.TriggerInstance.hasItems(UnendingBlocks.IMPROVED_FARMLAND_BLOCK.get()))
                .save(saver, new ResourceLocation(UnendingHorizons.MOD_ID, "improved_farmland"), existingFileHelper);

        Advancement SULFURIC_SKELETON = Advancement.Builder.advancement()
                .parent(new ResourceLocation("nether/root"))
                .display(UnendingItems.SULFURIC_BONE.get(),
                        Component.translatable("advancement.charred_horizons.sulfuric_skeleton"),
                        Component.translatable("advancement.charred_horizons.sulfuric_skeleton.desc"),
                        new ResourceLocation("textures/block/netherrack.png"),
                        FrameType.TASK, true, true, false)
                .addCriterion("gold_ring", KilledTrigger.TriggerInstance.playerKilledEntity(EntityPredicate.Builder.entity().of(CharredEntityTypes.SULFURIC_SKELETON.get())))
                .save(saver, new ResourceLocation(UnendingHorizons.MOD_ID, "sulfuric_skeleton"), existingFileHelper);
    }
}
