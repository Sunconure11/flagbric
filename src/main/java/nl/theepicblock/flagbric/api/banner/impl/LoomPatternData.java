package nl.theepicblock.flagbric.api.banner.impl;

import net.minecraft.util.DyeColor;
import nl.theepicblock.flagbric.api.banner.loom.LoomPattern;

/**
 * Class to store loom pattern data in the banner - its pattern,
 * color, and the index (in the vanilla banner pattern list) that
 * this pattern appears before. This allows Banner++ loom patterns
 * to be used with vanilla banner patterns.
 */
public record LoomPatternData(LoomPattern pattern, DyeColor color, int index) {
    public LoomPatternData {
        if (index < 0) {
            throw new IllegalArgumentException("index: " + index);
        }
    }
}