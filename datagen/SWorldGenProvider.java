package com.napzzzz.scratch.datagen;

import com.napzzzz.scratch.Scratch;
import com.napzzzz.scratch.worldgen.ScratchConfiguredFeatures;
import com.napzzzz.scratch.worldgen.ScratchPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class SWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ScratchConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ScratchPlacedFeatures::bootstrap);

    public SWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(Scratch.MOD_ID));
    }
}
