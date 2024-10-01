package skyforged_dreams.integration;

import skyforged_dreams.SkyforgedDreams;
import skyforged_dreams.util.IdentifierFactory;
import skyforged_dreams.world.biome.surface.SurfaceRules;
import skyforged_dreams.world.region.SvartalvheimRegion;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class TerraBlender implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized()
    {
        Regions.register(new SvartalvheimRegion(IdentifierFactory.make("svartalvheim"), 4));

        SurfaceRuleManager.addSurfaceRules(
            SurfaceRuleManager.RuleCategory.OVERWORLD,
            SkyforgedDreams.MOD_ID, SurfaceRules.makeRules()
        );
    }
}
