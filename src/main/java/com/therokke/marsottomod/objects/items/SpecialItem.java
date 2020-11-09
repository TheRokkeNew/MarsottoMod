package com.therokke.marsottomod.objects.items;

import com.therokke.marsottomod.MarsottoMod;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.PotionEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

public class SpecialItem extends Item {
    public SpecialItem() {
        super(new Item.Properties().group(MarsottoMod.TAB));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {

        playerIn.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST,200,2));
        System.out.println("Cliccato");
        return ActionResult.resultSuccess(new ItemStack(Items.PUMPKIN));//playerIn.getHeldItem(handIn)
    }
}
