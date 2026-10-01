package iso2t.rovi.helpers.resource;

import iso2t.rovi.core.Rovi;
import iso2t.rovi.core.definitions.BlockDefinition;
import iso2t.rovi.core.definitions.ItemDefinition;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.neoforged.fml.loading.FMLPaths;

import java.nio.file.Path;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Resource {

	public static Identifier get (String path) {
		return Identifier.fromNamespaceAndPath(Rovi.MODID, path);
	}

	public static Identifier getMinecraftResource (String path) {
		return Identifier.withDefaultNamespace(path);
	}

	public static Identifier getCustomResource (String namespace, String path) {
		return Identifier.fromNamespaceAndPath(namespace, path);
	}

	public static Identifier getFromItem (Item item) {
		return BuiltInRegistries.ITEM.getKey(item);
	}

	public static Identifier getFromItem (ItemStack stack) {
		return Resource.getFromItem(stack.getItem());
	}

	public static Identifier getFromItem (ItemDefinition<?> item) {
		return Resource.getFromItem(item.get());
	}

	public static Identifier getFromBlock (Block block) {
		return BuiltInRegistries.BLOCK.getKey(block);
	}

	public static Identifier getFromBlock (BlockDefinition<?> block) {
		return Resource.getFromBlock(block.get());
	}

	public static Path getGameDirectory () {
		return FMLPaths.GAMEDIR.get();
	}

	public static Path getConfigDirectory () {
		return FMLPaths.CONFIGDIR.get();
	}

	public static Path getModsDirectory () {
		return FMLPaths.MODSDIR.get();
	}

}
