package com.zixiken.dimdoors.world.pocket;

import com.zixiken.dimdoors.world.CustomSkyProvider;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Jared Johnson on 1/24/2017.
 */
public class PocketSkyProvider extends CustomSkyProvider
{
    @Override
    public ResourceLocation getMoonRenderPath() {
        return new ResourceLocation("DimDoors:textures/other/limboMoon.png");
    }

    @Override
    public ResourceLocation getSunRenderPath() {
        return new ResourceLocation("DimDoors:textures/other/limboSun.png");
    }
}
