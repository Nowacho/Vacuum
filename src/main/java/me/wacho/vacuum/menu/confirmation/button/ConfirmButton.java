package me.wacho.vacuum.menu.confirmation.button;

import me.wacho.vacuum.menu.Button;
import me.wacho.vacuum.menu.callback.MenuCallback;
import me.wacho.vacuum.item.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;

public class ConfirmButton extends Button {
    private final boolean confirm;
    private final MenuCallback<Boolean> callback;

    public ConfirmButton(boolean confirm, MenuCallback<Boolean> callback) {
        this.confirm = confirm;
        this.callback = callback;
    }
    @Override
    public ItemStack getButtonItem(Player player) {
        ItemBuilder itemBuilder = new ItemBuilder(Material.WOOL);
        itemBuilder.setName(this.confirm ? "&aConfirm" : "&cCancel");
        itemBuilder.setDurability((short) (this.confirm ? 5 : 14));
        return itemBuilder.toItemStack();
    }

    @Override
    public void clicked(Player player, int i, ClickType clickType, int hb) {
        if (this.confirm) {
            player.playSound(player.getLocation(), Sound.NOTE_PIANO, 20.0f, 0.1f);
        } else {
            player.playSound(player.getLocation(), Sound.DIG_GRAVEL, 20.0f, 0.1f);
        }

        player.closeInventory();
        this.callback.callback(this.confirm);
    }
}