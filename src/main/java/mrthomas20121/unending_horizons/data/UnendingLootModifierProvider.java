package mrthomas20121.unending_horizons.data;

import mrthomas20121.unending_horizons.UnendingHorizons;
import mrthomas20121.charred_horizons.data.loot.modifier.AddDungeonLootModifier;
import mrthomas20121.charred_horizons.init.CharredItems;
import net.minecraft.data.PackOutput;
import net.minecraft.util.random.WeightedEntry;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

import java.util.List;

public class UnendingLootModifierProvider extends GlobalLootModifierProvider {

    public UnendingLootModifierProvider(PackOutput output) {
        super(output, UnendingHorizons.MOD_ID);
    }

    @Override
    protected void start() {
        this.add("bastion_treasure", new AddDungeonLootModifier(
                new LootItemCondition[] {
                        LootTableIdCondition.builder(BuiltInLootTables.BASTION_TREASURE).build()
                },
                List.of(
                        WeightedEntry.wrap(new ItemStack(CharredItems.GOLD_RING.get()), 1),
                        WeightedEntry.wrap(new ItemStack(CharredItems.BLAZE_SLAYER.get()), 1)
                ),
                UniformInt.of(1, 4))
        );

        this.add("bastion_treasure", new AddDungeonLootModifier(
                new LootItemCondition[] {
                        LootTableIdCondition.builder(BuiltInLootTables.NETHER_BRIDGE).build()
                },
                List.of(
                        WeightedEntry.wrap(new ItemStack(CharredItems.MYSTERIOUS_CHARM.get()), 1),
                        WeightedEntry.wrap(new ItemStack(CharredItems.BLIGHT_RING.get()), 1),
                        WeightedEntry.wrap(new ItemStack(CharredItems.BLAZE_SLAYER.get()), 1),
                        WeightedEntry.wrap(new ItemStack(CharredItems.WITHERED_SWORD.get()), 3)
                ),
                UniformInt.of(1, 6))
        );
    }
}
