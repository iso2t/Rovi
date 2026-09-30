package iso2t.rovi.datagen.language;

import iso2t.rovi.core.Rovi;
import iso2t.rovi.core.definitions.RoviBlocks;
import iso2t.rovi.core.definitions.RoviItems;
import net.minecraft.data.DataGenerator;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class RoviEnLangProvider extends LanguageProvider {

	public RoviEnLangProvider (DataGenerator generator) {
		super(generator.getPackOutput(), Rovi.MODID, "en_us");
	}

	@Override
	protected void addTranslations () {
		for (var item : RoviItems.getItems()) add(item.get(), item.localizedName().getRawString());
		for (var block : RoviBlocks.getBlocks()) add(block.get(), block.localizedName().getRawString());

		addManualTranslations();
	}

	protected void addManualTranslations () {
		add("itemGroup." + Rovi.MODID, Rovi.NAME);
	}

}
