package skyforged_dreams.mixin;

import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Objects;

import static skyforged_dreams.world.dimension.Dimensions.SVARTHALVHEIM_WORLD;

@Mixin(WorldRenderer.class)
public class CloudRendererMixin {
    @Shadow private @Nullable ClientWorld world;

    @Inject(at = @At("HEAD"), method = "renderClouds", cancellable = true)
    private void onRenderClouds(
        MatrixStack matrices,
        Matrix4f matrix4f,
        Matrix4f matrix4f2,
        float tickDelta,
        double cameraX,
        double cameraY,
        double cameraZ,
        CallbackInfo ci
    ) {
        if (world == null) {
            return;
        }

        if (Objects.equals(world.getRegistryKey(), SVARTHALVHEIM_WORLD)) {
            ci.cancel();
        }
    }
}
