/*
 * VitalCondense is a Spigot Plugin that gives players the ability to condense items in their inventory.
 * Copyright © 2022 Leopold Meinel & contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see https://github.com/LeoMeinel/VitalCompact/blob/main/LICENSE
 */

package dev.meinel.leo.vitalcondense.storage;

import dev.meinel.leo.vitalcondense.VitalCondense;
import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public abstract class ValidRecipeStorage {

	protected final VitalCondense main = JavaPlugin.getPlugin(VitalCondense.class);

	public abstract Map<Material, Material> loadValidRecipes();

	public abstract void saveValidRecipes(@NotNull Map<Material, Material> validRecipes);

	public abstract void clear();
}
