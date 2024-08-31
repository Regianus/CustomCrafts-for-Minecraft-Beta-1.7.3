package com.regianus.betaquilescraftings;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class Recipes extends JavaPlugin {
  public void onEnable() {
	//This is the all the code needed to add a recipe
    //ItemStack helmOutput = new ItemStack(Material.CHAINMAIL_HELMET, 1);
    //ShapedRecipe chainHelm = new ShapedRecipe(helmOutput);
    //chainHelm.shape(new String[] { "SIS", "I I" });
    //chainHelm.setIngredient('I', Material.IRON_INGOT);
    //chainHelm.setIngredient('S', Material.STRING);
    //getServer().addRecipe((Recipe)chainHelm);
	///////////////////////////////
	ItemStack helmOutput = new ItemStack(Material.CHAINMAIL_HELMET, 1);
    ShapedRecipe chainHelm = new ShapedRecipe(helmOutput);
    chainHelm.shape(new String[] { "SIS", "I I" });
    chainHelm.setIngredient('I', Material.IRON_INGOT);
    chainHelm.setIngredient('S', Material.STRING);
    getServer().addRecipe((Recipe)chainHelm);
    ItemStack chestOutput = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
    ShapedRecipe chainChest = new ShapedRecipe(chestOutput);
    chainChest.shape(new String[] { "S S", "ISI", "SIS" });
    chainChest.setIngredient('I', Material.IRON_INGOT);
    chainChest.setIngredient('S', Material.STRING);
    getServer().addRecipe((Recipe)chainChest);
    ItemStack legsOutput = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
    ShapedRecipe chainLegs = new ShapedRecipe(legsOutput);
    chainLegs.shape(new String[] { "SIS", "I I", "S S" });
    chainLegs.setIngredient('I', Material.IRON_INGOT);
    chainLegs.setIngredient('S', Material.STRING);
    getServer().addRecipe((Recipe)chainLegs);
    ItemStack bootsOutput = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
    ShapedRecipe chainBoots = new ShapedRecipe(bootsOutput);
    chainBoots.shape(new String[] { "S S", "I I" });
    chainBoots.setIngredient('I', Material.IRON_INGOT);
    chainBoots.setIngredient('S', Material.STRING);
    getServer().addRecipe((Recipe)chainBoots);
	///////////////////////////////
	ItemStack rocamusgosa = new ItemStack(Material.MOSSY_COBBLESTONE, 1);
    ShapedRecipe mossycobble = new ShapedRecipe(rocamusgosa);
    mossycobble.shape(new String[] { " L ", "LCL", " L " });
    mossycobble.setIngredient('L', Material.LEAVES);
    mossycobble.setIngredient('C', Material.COBBLESTONE);
    getServer().addRecipe((Recipe)mossycobble);
	///////////////////////////
	ItemStack esponja = new ItemStack(Material.SPONGE, 1);
    ShapedRecipe sponge = new ShapedRecipe(esponja);
    sponge.shape(new String[] { " D ", "YWY", "SSS" });
    sponge.setIngredient('S', Material.SAND);
    sponge.setIngredient('W', Material.WOOL);
	sponge.setIngredient('Y', Material.YELLOW_FLOWER);
    sponge.setIngredient('D', Material.DIAMOND);
    getServer().addRecipe((Recipe)sponge);
  }
  
  public void onDisable() {}
}