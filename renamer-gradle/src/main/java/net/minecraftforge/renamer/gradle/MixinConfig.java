/*
 * Copyright (c) Forge Development LLC
 * SPDX-License-Identifier: LGPL-2.1-only
 */
package net.minecraftforge.renamer.gradle;

import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.provider.ListProperty;
import org.gradle.api.provider.MapProperty;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.SourceSet;

public interface MixinConfig {
	abstract Property<String> getConfig();
	abstract Property<String> getRefMap();
	abstract Property<Boolean> getDisableTargetValidator();
	abstract Property<Boolean> getDisableTargetExport();
	abstract Property<Boolean> getDisableOverwriteChecker();
	abstract Property<String> getOverwriteErrorLevel();
	abstract Property<String> getDefaultObfuscationEnv();
	abstract ListProperty<String> getMappingTypes();
	abstract MapProperty<String, String> getTokens();
	abstract ConfigurableFileCollection getExtraMappings();
	abstract Property<Boolean> getQuiet();
	abstract Property<Boolean> getShowMessageTypes();
	abstract MapProperty<String, String> getMessages();

	void sourceset(SourceSet sourceSet);
	void run(Object runConfig);
}
