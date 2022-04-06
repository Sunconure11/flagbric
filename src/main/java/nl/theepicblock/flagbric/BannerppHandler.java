package nl.theepicblock.flagbric;


import net.minecraft.item.ItemStack;
import nl.theepicblock.flagbric.api.banner.impl.LoomPatternConversions;
import nl.theepicblock.flagbric.api.banner.impl.LoomPatternRenderContext;

public class BannerppHandler {
    public static void onPreRender(ItemStack stack) {
        LoomPatternRenderContext.setLoomPatterns(LoomPatternConversions.makeLoomPatternData(LoomPatternConversions.getLoomPatternTag(stack)));
    }
}
