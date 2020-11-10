package com.therokke.marsottomod.util;

import com.therokke.marsottomod.MarsottoMod;
import com.therokke.marsottomod.objects.items.Power_Wand;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MarsottoMod.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Basic Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",() -> new Item(new Item.Properties().group(MarsottoMod.TAB)));

    //Tools
    public static final RegistryObject<SwordItem> POWER_WAND = ITEMS.register("power_wand",()->
            new Power_Wand(ItemTier.IRON,1,1,new Item.Properties().group(MarsottoMod.TAB)));

    //Custom Items


}
