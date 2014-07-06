	package gcm.xenorite.init;

import gcm.xenorite.items.ItemCoreoriteIngot;
import gcm.xenorite.items.ItemCoreoriteMeltedIngot;
import gcm.xenorite.items.ItemFinoriteIngot;
import gcm.xenorite.items.ItemFinoriteMeltedIngot;
import gcm.xenorite.items.ItemPlaceHolderIngot;
import gcm.xenorite.items.ItemXenorite;
import gcm.xenorite.items.ItemXenoriteIngot;
import gcm.xenorite.items.ItemXenoriteMeltedIngot;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemXenorite xenoriteIngot = new ItemXenoriteIngot();
    public static final ItemXenorite coreoriteIngot = new ItemCoreoriteIngot();
    public static final ItemXenorite finoriteIngot = new ItemFinoriteIngot();
    public static final ItemXenorite xenoriteMeltedIngot = new ItemXenoriteMeltedIngot();
    public static final ItemXenorite coreoriteMeltedIngot = new ItemCoreoriteMeltedIngot();
    public static final ItemXenorite finoriteMeltedIngot = new ItemFinoriteMeltedIngot();
    public static final ItemXenorite placeHolderIngot = new ItemPlaceHolderIngot();

    public static void init()
    {
        GameRegistry.registerItem(xenoriteIngot, "xenoriteIngot");
        GameRegistry.addSmelting(gcm.xenorite.init.ModBlockOres.xenoriteOre, new ItemStack(xenoriteIngot), 1.0F);
        GameRegistry.registerItem(coreoriteIngot, "coreoriteIngot");
        GameRegistry.addSmelting(gcm.xenorite.init.ModBlockOres.coreoriteOre, new ItemStack(coreoriteIngot), 1.0F);
        GameRegistry.registerItem(finoriteIngot, "finoriteIngot");
        GameRegistry.addSmelting(gcm.xenorite.init.ModBlockOres.finoriteOre, new ItemStack(finoriteIngot), 1.0F);
        GameRegistry.registerItem(xenoriteMeltedIngot, "xenoriteMeltedIngot");
        GameRegistry.addSmelting(xenoriteIngot, new ItemStack(xenoriteMeltedIngot), 0.1F);
        GameRegistry.registerItem(coreoriteMeltedIngot, "coreoriteMeltedIngot");
        GameRegistry.addSmelting(coreoriteIngot, new ItemStack(finoriteMeltedIngot), 0.1F);
        GameRegistry.registerItem(finoriteMeltedIngot, "finoriteMeltedIngot");
        GameRegistry.addSmelting(finoriteIngot, new ItemStack(coreoriteMeltedIngot), 0.1F);
        GameRegistry.registerItem(placeHolderIngot, "placeHolderIngot");
		GameRegistry.addShapedRecipe(new ItemStack(placeHolderIngot),
				"XXX",
				"CCC",
				"FFF",
				'X', xenoriteMeltedIngot, 'C', coreoriteMeltedIngot, 'F', finoriteMeltedIngot);
        
    }
}