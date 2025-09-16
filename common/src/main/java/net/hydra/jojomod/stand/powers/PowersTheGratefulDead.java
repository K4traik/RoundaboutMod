package net.hydra.jojomod.stand.powers;

import net.hydra.jojomod.stand.powers.presets.NewPunchingStand;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;

public class PowersTheGratefulDead extends NewPunchingStand {
    public PowersTheGratefulDead(LivingEntity self) {
        super(self);
    }
    @Override
    public boolean isWip(){
        return true;
    }
    @Override
    public Component ifWipListDevStatus(){
        return Component.translatable(  "roundabout.dev_status.active").withStyle(ChatFormatting.AQUA);
    }
    @Override
    public Component ifWipListDev(){
        return Component.literal(  "K4traik").withStyle(ChatFormatting.DARK_PURPLE);
    }
}