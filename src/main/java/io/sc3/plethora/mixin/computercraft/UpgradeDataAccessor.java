package io.sc3.plethora.mixin.computercraft;

import dan200.computercraft.api.upgrades.UpgradeBase;
import dan200.computercraft.api.upgrades.UpgradeData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value = UpgradeData.class)
public interface UpgradeDataAccessor {
	@Accessor
	UpgradeBase getUpgrade();
}
