package craftlabs.tutorialmod.objects.items;

import craftlabs.tutorialmod.Main;
import craftlabs.tutorialmod.init.ItemInit;
import craftlabs.tutorialmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRender(this, 0, "inventory");
	}
}
