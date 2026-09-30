package iso2t.rovi.core.definitions;

import com.google.common.base.Preconditions;
import iso2t.rovi.core.CreativeTab;
import iso2t.rovi.core.Rovi;
import iso2t.rovi.helpers.registry.RegistryString;
import iso2t.rovi.helpers.resource.Resource;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemProvider;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class RoviItems {

	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(Rovi.MODID);
	private static final List<ItemDefinition<?>> ITEMS = new ArrayList<>();

	public static final ItemDefinition<Item> ROVI_HEAD = item("Rovi Head", Item::new);
	public static final ItemDefinition<Item> ROVI_FRAME = item("Rovi Frame", Item::new);
	public static final ItemDefinition<Item> ROVI_ARM = item("Rovi Arm", Item::new);
	public static final ItemDefinition<Item> ROVI_RUNNING_GEAR = item("Rovi Running Gear", Item::new);

	public static final ItemDefinition<Item> TRACK = item("Track", Item::new);
	public static final ItemDefinition<Item> WHEEL = item("Wheel", Item::new);
	public static final ItemDefinition<Item> DRIVE_SPROCKET = item("Drive Sprocket", Item::new);
	public static final ItemDefinition<Item> IDLER_WHEEL = item("Idler Wheel", Item::new);
	public static final ItemDefinition<Item> RETURN_ROLLER = item("Return Roller", Item::new);

	public static List<ItemDefinition<?>> getItems () {
		return Collections.unmodifiableList(ITEMS);
	}

	static <T extends Item> ItemDefinition<T> item (String englishName, Function<Item.Properties, T> factory) {
		var registry = new RegistryString(englishName);
		return item(englishName, Resource.get(registry.getRegistryName()), factory);
	}

	static <T extends Item> ItemDefinition<T> item (String englishName, Identifier id, Function<Item.Properties, T> factory) {
		Preconditions.checkArgument(id.getNamespace().equals(Rovi.MODID));
		var definition = new ItemDefinition<>(englishName, REGISTRY.registerItem(id.getPath(), factory));
		CreativeTab.add(definition);
		ITEMS.add(definition);
		return definition;
	}

}
