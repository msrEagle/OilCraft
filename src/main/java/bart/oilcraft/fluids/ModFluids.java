package bart.oilcraft.fluids;

import net.minecraft.block.Block;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModFluids {
    public static Fluid Oil;
    public static Block OilBlock;

    public static void init() {
        Oil = new OilCraftFluids("Oil");
        OilBlock = new BlockOil(Oil);
    }
}

