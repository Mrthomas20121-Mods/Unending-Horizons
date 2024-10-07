package mrthomas20121.unending_horizons.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;
import net.minecraftforge.data.event.GatherDataEvent;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class UnendingDatagen {

    public static void init(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        PackOutput packOutput = generator.getPackOutput();

        UnendingBlockTagProvider tags = new UnendingBlockTagProvider(packOutput, lookupProvider, fileHelper);
        generator.addProvider(event.includeServer(), tags);
        generator.addProvider(event.includeServer(), new UnendingItemTagProvider(packOutput, lookupProvider, tags.contentsGetter(), fileHelper));
        generator.addProvider(event.includeServer(), new UnendingCurioDataProvider(packOutput, fileHelper, lookupProvider));
        generator.addProvider(event.includeServer(), new UnendingRecipeProvider(packOutput));

        generator.addProvider(event.includeServer(), new UnendingRegistrySets(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), UnendingLootTableData.create(packOutput));
        generator.addProvider(event.includeServer(), new UnendingLootModifierProvider(packOutput));
        generator.addProvider(event.includeServer(), new ForgeAdvancementProvider(packOutput, lookupProvider, fileHelper, List.of(new UnendingAdvancementProvider())));

        generator.addProvider(event.includeClient(), new UnendingBlockstateProvider(packOutput, fileHelper));
        generator.addProvider(event.includeClient(), new UnendingLangProvider(packOutput));
        generator.addProvider(event.includeClient(), new UnendingItemModelProvider(packOutput, fileHelper));

    }
}
