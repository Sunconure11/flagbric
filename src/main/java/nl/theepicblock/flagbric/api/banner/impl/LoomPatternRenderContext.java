package nl.theepicblock.flagbric.api.banner.impl;

import java.util.Collections;
import java.util.List;

/**
 * Extra static state for BannerBlockEntityRenderer.
 */
public final class LoomPatternRenderContext {
    private static List<LoomPatternData> loomPatterns = Collections.emptyList();

    private LoomPatternRenderContext() {
    }

    public static List<LoomPatternData> getLoomPatterns() {
        return loomPatterns;
    }

    /**
     * Set before BannerBlockEntityRenderer.method_23802 is called.
     */
    public static void setLoomPatterns(List<LoomPatternData> patterns) {
        loomPatterns = patterns;
    }
}