package me.wacho.vacuum.menu.buttons;

import me.wacho.vacuum.menu.Button;
import me.wacho.vacuum.menu.Menu;
import me.wacho.vacuum.item.ItemBuilder;
import lombok.AllArgsConstructor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;

@AllArgsConstructor
public class BackButton extends Button {

    private final Menu back;

    @Override
    public ItemStack getButtonItem(Player player) {
        return new ItemBuilder(Material.BED)
                .setName("&c&lBack")
                .setLore("&cClick here to return",
                        "&cto the previous menu.").toItemStack();
    }

    @Override
    public void clicked(Player player, int i, ClickType clickType, int hb) {
        Button.playNeutral(player);
        this.back.openMenu(player);
    }
}
