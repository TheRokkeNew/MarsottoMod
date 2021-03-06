package com.therokke.marsottomod.objects.items;

import com.therokke.marsottomod.util.RegistryHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Random;

public class Power_Wand extends SwordItem {

    //public static Effect[] effectList = {Effects.ABSORPTION ,Effects.HASTE};
    public static ArrayList<Effect> effectList = new ArrayList<>();
    /*
    *Effects.GLOWING,Effects.JUMP_BOOST,Effects.SPEED,Effects.LUCK
    *
    */
    public Power_Wand(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {

        playerIn.clearActivePotions();
        ItemStack item = playerIn.getHeldItemMainhand();

        Random random = new Random();
        int i =(int) (Math.random() * effectList.size());

        playerIn.addPotionEffect(new EffectInstance(effectList.get(i),100,2));
        item.damageItem(15,playerIn,playerEntity -> {});
        System.out.println(effectList.size());
        return super.onItemRightClick(worldIn, playerIn, handIn);

    }

    public static void add(Effect newEffect){
        effectList.add(newEffect);
    }
    public static void updateArrayList(){
        effectList.add(Effects.ABSORPTION);
        effectList.add(Effects.HASTE);
    }
}
