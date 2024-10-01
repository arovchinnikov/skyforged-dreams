package skyforged_dreams.world.dimension;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.util.Identifier;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;
import skyforged_dreams.SkyforgedDreams;
import skyforged_dreams.util.IdentifierFactory;

import java.util.OptionalLong;

public class Dimensions {
    public static final RegistryKey<DimensionOptions> SVARTHALVHEIM_DIMENSION_OPTIONS = RegistryKey.of(
        RegistryKeys.DIMENSION,
        IdentifierFactory.make("svartalfheim")
    );

    public static final RegistryKey<World> SVARTHALVHEIM_WORLD = RegistryKey.of(
        RegistryKeys.WORLD,
        IdentifierFactory.make("svartalfheim")
    );

    public static final RegistryKey<DimensionType> SVARTHALVHEIM_DIMENSION_TYPE = RegistryKey.of(
        RegistryKeys.DIMENSION_TYPE,
        IdentifierFactory.make("svartalfheim")
    );

    public static void init(Registerable<DimensionType> ctx) {
        ctx.register(SVARTHALVHEIM_DIMENSION_TYPE, new DimensionType(
            OptionalLong.empty(),
            true,
            false,
            false,
            true,
            1.0,
            true,
            false,
            0,
            256,
            256,
            BlockTags.INFINIBURN_OVERWORLD,
            DimensionTypes.OVERWORLD_ID,
            0f,
            new DimensionType.MonsterSettings(false, false, UniformIntProvider.create(0, 0), 0)
        ));
    }
}
