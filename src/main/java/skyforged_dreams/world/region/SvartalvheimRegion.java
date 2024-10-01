package skyforged_dreams.world.region;

import com.mojang.datafixers.util.Pair;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import skyforged_dreams.world.biome.Biomes;
import terrablender.api.Region;
import terrablender.api.RegionType;
import terrablender.api.Regions;

import java.util.function.Consumer;

public class SvartalvheimRegion extends Region {
    public SvartalvheimRegion(Identifier name, int weight) {
        super(name, RegionType.OVERWORLD, weight);
    }
}
