package com.therokke.marsottomod.util;

import com.therokke.marsottomod.MarsottoMod;
import com.therokke.marsottomod.objects.items.SpecialItem;
import net.minecraft.item.Item;
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

    //Custom Items
    public static final RegistryObject<Item> SPECIAL_ITEM = ITEMS.register("special_item", SpecialItem::new);


}
