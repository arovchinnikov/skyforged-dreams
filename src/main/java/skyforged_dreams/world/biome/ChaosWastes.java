package skyforged_dreams.world.biome;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

public class ChaosWastes {
    public static Biome register(Registerable<Biome> ctx) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        spawnBuilder.spawn(
            SpawnGroup.CREATURE,
            new SpawnSettings.SpawnEntry(EntityType.BAT, 5, 2, 5)
        );

        GenerationSettings.LookupBackedBuilder biomeBuilder = new GenerationSettings.LookupBackedBuilder(
            ctx.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
            ctx.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER)
        );

        DefaultBiomeFeatures.addMossyRocks(biomeBuilder);

        var biomeEffects = new BiomeEffects.Builder()
            .waterColor(0x0b0d4b)
            .waterFogColor(0x0b0d4b)
            .skyColor(0x800000)
            .grassColor(0x505050)
            .foliageColor(0x505050)
            .fogColor(0x260000)
            .grassColorModifier(BiomeEffects.GrassColorModifier.DARK_FOREST)
            .moodSound(BiomeMoodSound.CAVE)
            .particleConfig(new BiomeParticleConfig(ParticleTypes.ASH, 0.008F))
            .build();

        return new Biome.Builder()
            .precipitation(true)
            .downfall(0f)
            .temperature(1f)
            .generationSettings(biomeBuilder.build())
            .spawnSettings(spawnBuilder.build())
            .effects(biomeEffects)
            .build();
    }
}
