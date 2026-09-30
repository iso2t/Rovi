package iso2t.rovi.helpers.registry;

import lombok.Getter;

@Getter
public final class RegistryString {

	private final String rawString;
	private final String registryName;

	public RegistryString (String input) {
		this.rawString = input;
		this.registryName = input.toLowerCase().replace(" ", "_");
	}

}
