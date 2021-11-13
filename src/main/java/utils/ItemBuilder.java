package utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class ItemBuilder {
    private final ItemStack itemStack;

    public ItemBuilder(Material material) {
        itemStack = new ItemStack(material);
    }
    public ItemBuilder(Material material, int amount) {
        itemStack = new ItemStack(material, amount);
    }
    public ItemBuilder(Material material, int amount, int shortID) { itemStack = new ItemStack(material, amount, (short)shortID);}

    public ItemBuilder name(String name) {
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(name);
        itemStack.setItemMeta(itemMeta);
        return this;
    }

    public ItemBuilder enchantment(Enchantment enchantment, int level) {
        itemStack.addEnchantment(enchantment, level);
        return this;
    }

    public ItemBuilder skullOwner(String name) {
        SkullMeta skullMeta = (SkullMeta) itemStack.getItemMeta();
        skullMeta.setOwner(name);
        itemStack.setItemMeta(skullMeta);
        return this;
    }

    public ItemStack itemStack() {
        return itemStack;
    }
}
