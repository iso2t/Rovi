package iso2t.rovi.datagen.model;

import iso2t.rovi.core.Rovi;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.data.PackOutput;

public abstract sealed class ModelProviders extends ModelProvider permits BlockModelProvider, ItemModelProvider {

	public ModelProviders (PackOutput output) {
		super(output, Rovi.MODID);
	}

}
