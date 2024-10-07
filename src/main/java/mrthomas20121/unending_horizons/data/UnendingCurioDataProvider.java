package mrthomas20121.unending_horizons.data;

import mrthomas20121.unending_horizons.UnendingHorizons;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import top.theillusivec4.curios.api.CuriosDataProvider;

import java.util.concurrent.CompletableFuture;

public class UnendingCurioDataProvider extends CuriosDataProvider {

    public UnendingCurioDataProvider(PackOutput output, ExistingFileHelper fileHelper, CompletableFuture<HolderLookup.Provider> registries) {
        super(UnendingHorizons.MOD_ID, output, fileHelper, registries);
    }

    @Override
    public void generate(HolderLookup.Provider registries, ExistingFileHelper fileHelper) {
        this.createEntities("player").addPlayer().addSlots("ring", "ring", "ring", "charm");

        this.createSlot("ring").order(160).icon(new ResourceLocation("curios:slot/empty_ring_slot")).replace(true).size(3);
    }
}
