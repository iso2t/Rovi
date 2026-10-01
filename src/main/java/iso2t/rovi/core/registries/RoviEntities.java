package iso2t.rovi.core.registries;

import iso2t.rovi.core.Rovi;
import iso2t.rovi.entity.RoviCompanionEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class RoviEntities {

	public static final DeferredRegister<EntityType<?>>                                REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, Rovi.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<RoviCompanionEntity>> ROVI     = REGISTRY.register("rovi", id -> EntityType.Builder.of(RoviCompanionEntity::new, MobCategory.CREATURE).sized(0.9F, 1.1F).eyeHeight(0.8F).clientTrackingRange(8).noLootTable().build(ResourceKey.create(Registries.ENTITY_TYPE, id)));

	public static void registerAttributes (EntityAttributeCreationEvent event) {
		event.put(ROVI.get(), RoviCompanionEntity.createAttributes().build());
	}
}
