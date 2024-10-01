package skyforged_dreams.util;

import net.minecraft.util.Identifier;
import skyforged_dreams.SkyforgedDreams;

public class IdentifierFactory {
    public static Identifier make(String name) {
        return Identifier.of(SkyforgedDreams.MOD_ID, name);
    }
}
