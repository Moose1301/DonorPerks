package xyz.minestory.donorperks.guis;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import xyz.minestory.donorperks.DonorPerksPlugin;

public class GalacticGUI implements Listener {
    private DonorPerksPlugin plugin;
    public GalacticGUI(DonorPerksPlugin plugin){
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    public static Inventory GalacticInventory = Bukkit.createInventory(null, 9, "Galactic Perks and Rewards");
    private static Inventory GalacticCommands = Bukkit.createInventory(null, 18, "Galactic Commands");
    private static Inventory GalacticPerks = Bukkit.createInventory(null, 9, "Galactic Perks");


    static {
        ItemStack diamondblock = new ItemStack(Material.DIAMOND_BLOCK);
        ItemMeta diamondblockm = diamondblock.getItemMeta();
        diamondblockm.setDisplayName(ChatColor.GREEN + "Commands");
        diamondblock.setItemMeta(diamondblockm);

        ItemStack goldblock = new ItemStack(Material.GOLD_BLOCK);
        ItemMeta goldblockm = goldblock.getItemMeta();
        goldblockm.setDisplayName(ChatColor.YELLOW + "Perks");
        goldblock.setItemMeta(goldblockm);

        ItemStack purchase = new ItemStack(Material.BOOK);
        ItemMeta pb = purchase.getItemMeta();
        pb.setDisplayName(ChatColor.AQUA + "Buy now!");
        purchase.setItemMeta(pb);

        //commands start here
        ItemStack enderchest = new ItemStack(Material.ENDER_CHEST);
        ItemMeta em = enderchest.getItemMeta();
        em.setDisplayName(ChatColor.LIGHT_PURPLE + "/enderchest");
        enderchest.setItemMeta(em);

        ItemStack feed = new ItemStack(Material.COOKED_BEEF);
        ItemMeta fm = feed.getItemMeta();
        fm.setDisplayName(ChatColor.LIGHT_PURPLE + "/feed");
        feed.setItemMeta(fm);

        ItemStack playertime = new ItemStack(Material.WATCH);
        ItemMeta timem = playertime.getItemMeta();
        timem.setDisplayName(ChatColor.LIGHT_PURPLE + "/playertime");
        playertime.setItemMeta(timem);

        ItemStack workbench = new ItemStack(Material.WORKBENCH);
        ItemMeta wbm = workbench.getItemMeta();
        wbm.setDisplayName(ChatColor.LIGHT_PURPLE + "/Workbench");
        workbench.setItemMeta(wbm);

        ItemStack pweather = new ItemStack(Material.YELLOW_FLOWER);
        ItemMeta pweatherm = pweather.getItemMeta();
        pweatherm.setDisplayName(ChatColor.LIGHT_PURPLE + "/pweather");
        pweather.setItemMeta(pweatherm);

        ItemStack fix = new ItemStack(Material.ANVIL);
        ItemMeta fixm = fix.getItemMeta();
        fixm.setDisplayName(ChatColor.LIGHT_PURPLE + "/fix");
        fix.setItemMeta(fixm);

        ItemStack fly = new ItemStack(Material.NAME_TAG);
        ItemMeta flym = fly.getItemMeta();
        flym.setDisplayName(ChatColor.LIGHT_PURPLE + "/fly");
        fly.setItemMeta(flym);

        //Perks start here
        ItemStack galactickit = new ItemStack(Material.DIAMOND);
        ItemMeta gkm = galactickit.getItemMeta();
        gkm.setDisplayName(ChatColor.LIGHT_PURPLE + "Access to Galactic Kit");
        galactickit.setItemMeta(gkm);

        ItemStack pv = new ItemStack(Material.ENDER_CHEST);
        ItemMeta pv7 = pv.getItemMeta();
        pv7.setDisplayName(ChatColor.LIGHT_PURPLE + "Access to 7 Player Vaults");
        pv.setItemMeta(pv7);

        ItemStack homes = new ItemStack(Material.BED);
        ItemMeta homesm = homes.getItemMeta();
        homesm.setDisplayName(ChatColor.LIGHT_PURPLE + "25 homes");
        homes.setItemMeta(homesm);

        ItemStack csigns = new ItemStack(Material.SIGN);
        ItemMeta csignsm = csigns.getItemMeta();
        csignsm.setDisplayName(ChatColor.LIGHT_PURPLE + "Ability to use colored text on signs");
        csigns.setItemMeta(csignsm);

        GalacticInventory.setItem(0, diamondblock);
        GalacticInventory.setItem(4, goldblock);
        GalacticInventory.setItem(8, purchase);
        GalacticCommands.setItem(0, enderchest);
        GalacticCommands.setItem(1, feed);
        GalacticCommands.setItem(2, playertime);
        GalacticCommands.setItem(3, workbench);
        GalacticCommands.setItem(4, pweather);
        GalacticCommands.setItem(5, fix);
        GalacticCommands.setItem(6, fly);
        GalacticCommands.setItem(8, purchase);
        GalacticPerks.setItem(0, galactickit);
        GalacticPerks.setItem(2, pv);
        GalacticPerks.setItem(4, homes);
        GalacticPerks.setItem(6, csigns);
        GalacticPerks.setItem(8, purchase);



    }




    @EventHandler
    public void onInventoryClick(InventoryClickEvent event){
        Player player = (Player) event.getWhoClicked();
        ItemStack clicked = event.getCurrentItem();
        Inventory inventory = event.getInventory();
        if (event.getView().getTitle().equalsIgnoreCase("Galactic Perks and Rewards")){
            e.setCancelled(true);
            if (e.getCurrentItem() == null) {
                return;
            }
            if (clicked.getType() == Material.DIAMOND_BLOCK){
                event.setCancelled(true);
                player.closeInventory();
                player.openInventory(GalacticCommands);
            }
        }
            if (event.getView().getTitle().equalsIgnoreCase("Galactic Perks and Rewards")){
                e.setCancelled(true);
            if (e.getCurrentItem() == null) {
                return;
            }
                if (clicked.getType() == Material.GOLD_BLOCK){
                    event.setCancelled(true);
                    player.closeInventory();
                    player.openInventory(GalacticPerks);
                }
            }
            if (event.getView().getTitle().equalsIgnoreCase("Galactic Perks and Rewards")){
                e.setCancelled(true);
            if (e.getCurrentItem() == null) {
                return;
            }
                if (clicked.getType() == Material.BOOK){
                    event.setCancelled(true);
                    player.sendMessage(ChatColor.BLUE + "You can purchase the Galactic Rank here" + ChatColor.AQUA + " shop.minestory.xyz");
                    player.closeInventory();
            }
        }
            if (event.getView().getTitle().equalsIgnoreCase("Galactic Commands")){
                e.setCancelled(true);
            if (e.getCurrentItem() == null) {
                return;
            }
                event.setCancelled(true);
            }
            if (event.getView().getTitle().equalsIgnoreCase("Galactic Perks")){
                e.setCancelled(true);
            if (e.getCurrentItem() == null) {
                return;
            }
                event.setCancelled(true);
            }


    }



}
