package com.therokke.marsottomod.events;

import com.therokke.marsottomod.MarsottoMod;

import com.therokke.marsottomod.objects.items.Power_Wand;
import com.therokke.marsottomod.util.RegistryHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Effects;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = MarsottoMod.MOD_ID, bus = Bus.FORGE)
public class AddingBuffs {

    @SubscribeEvent
    public void addInstaHealth(PlayerInventory player){
        if(player.hasItemStack(new ItemStack(Items.PUMPKIN))){
            System.out.println("Ce lo ho");
        }
    }

}
