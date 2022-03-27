
package net.mcreator.battlepass.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class VbuckItem extends Item {
	public VbuckItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("vbuck");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
