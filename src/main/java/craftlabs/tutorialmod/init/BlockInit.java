package craftlabs.tutorialmod.init;

import java.util.ArrayList;
import java.util.List;

import craftlabs.tutorialmod.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block BLOCK_COPPER = new BlockBase("block_copper", Material.IRON);
}
