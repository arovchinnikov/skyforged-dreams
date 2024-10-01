package skyforged_dreams.world.biome.surface;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import skyforged_dreams.world.biome.Biomes;

public class SurfaceRules {
    private static final MaterialRules.MaterialRule BLACKSTONE = makeStateRule(Blocks.BLACKSTONE);
    public static MaterialRules.MaterialRule makeRules() {
        return MaterialRules.sequence(
            MaterialRules.sequence(
                MaterialRules.condition(
                    MaterialRules.biome(Biomes.CHAOS_WASTES),
                    MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH_RANGE_6, BLACKSTONE)
                )
            )
        );
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}
