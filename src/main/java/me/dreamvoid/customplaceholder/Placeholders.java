package me.dreamvoid.customplaceholder;

import me.clip.placeholderapi.PlaceholderAPI;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Placeholders extends PlaceholderExpansion {

	private final main plugin;

	public Placeholders(main plugin) {
		this.plugin = plugin;
	}

	@Override
	public @NotNull String getIdentifier() {
		return "customp";
	}

	@Override
	public @NotNull String getAuthor() {
		return "DreamVoid";
	}

	@Override
	public @NotNull String getVersion() {
		return "1.0";
	}

	@Override
	public boolean persist() {
		return true;
	}

	@Override
	public @Nullable String onRequest(OfflinePlayer player, @NotNull String params) {
		return plugin.getConfig().getString("placeholders." + params) != null ? PlaceholderAPI.setPlaceholders(player,plugin.getConfig().getString("placeholders." + params)) : null;
	}
}
