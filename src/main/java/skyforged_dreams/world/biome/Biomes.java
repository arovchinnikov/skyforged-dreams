package skyforged_dreams.world.biome;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.biome.Biome;
import skyforged_dreams.util.IdentifierFactory;

public class Biomes {
    public static final RegistryKey<Biome> CHAOS_WASTES = RegistryKey.of(
        RegistryKeys.BIOME,
        IdentifierFactory.make("chaos_wastes")
    );

    public static void init(Registerable<Biome> ctx) {
        ctx.register(CHAOS_WASTES, ChaosWastes.register(ctx));
    }
}
