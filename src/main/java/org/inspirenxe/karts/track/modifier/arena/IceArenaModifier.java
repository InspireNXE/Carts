/**
 * The MIT License (MIT)
 *
 * Copyright (c) InspireNXE <https://www.inspirenxe.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.inspirenxe.karts.track.modifier.arena;

import org.inspirenxe.karts.Karts;
import org.inspirenxe.karts.track.biome.SingleBiomeGenerator;
import org.inspirenxe.karts.track.generation.FixedSizeCylinderBarrierGenerator;
import org.inspirenxe.karts.track.util.WorldGeneratorUtil;
import org.spongepowered.api.data.DataContainer;
import org.spongepowered.api.data.DataQuery;
import org.spongepowered.api.world.biome.BiomeTypes;
import org.spongepowered.api.world.gen.WorldGenerator;
import org.spongepowered.api.world.gen.WorldGeneratorModifier;
import org.spongepowered.api.world.storage.WorldProperties;

public final class IceArenaModifier implements WorldGeneratorModifier {

    @Override
    public void modifyWorldGenerator(WorldProperties world, DataContainer settings, WorldGenerator worldGenerator) {
        WorldGeneratorUtil.clearGenerator(worldGenerator);
        worldGenerator.setBiomeGenerator(new SingleBiomeGenerator(BiomeTypes.FROZEN_OCEAN));
        worldGenerator.setBaseGenerationPopulator(new FixedSizeCylinderBarrierGenerator(75.5, 75.5));
    }

    @Override
    public String getId() {
        return Karts.PLUGIN_ID + ":modifier_track_arena_ice";
    }

    @Override
    public String getName() {
        return "Ice Arena Modifier";
    }
}
