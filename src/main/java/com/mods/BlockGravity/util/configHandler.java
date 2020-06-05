package com.mods.BlockGravity.util;
import net.minecraftforge.common.ForgeConfig;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.IntValue;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.server.command.ConfigCommand;
import org.apache.commons.lang3.tuple.Pair;
import com.mods.BlockGravity.BlockGravity;
import java.io.File;
@Mod.EventBusSubscriber(modid = BlockGravity.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class configHandler {
    public static class Common{

        public final ForgeConfigSpec.BooleanValue enableGravity;
        public final ForgeConfigSpec.IntValue RealisticLevel;
        public final ForgeConfigSpec.IntValue gravityRange;
        public final ForgeConfigSpec.IntValue explosionRange;

        public Common(ForgeConfigSpec.Builder builder){
            builder.comment("gravityBlock mod configuration").push("GravityBlock");

            enableGravity = builder.comment("you can enable/disable gravity mod by setting here").translation("blockgravity.configgui.enableGravity").worldRestart().define("setGravityOn", true);
            RealisticLevel = builder.comment("set RealisticLevel to here, you can either set 1 or 2, level 2 is more realistic than level one, it adds support factor to determine if a block falls or not. ").translation("blockgravity.configgui.RealisticLevel").worldRestart()
                    .defineInRange("set Realistic Level",2,1,2);

            gravityRange = builder.comment("set the gravityRange to adjust the range of affected block. ").translation("blockgravity.configgui.gravityRange").worldRestart()
                    .defineInRange("set gravityRange range",2,0,6);
            explosionRange = builder.comment("set the explosionRange to adjust the range of explosion.").translation("blockgravity.configgui.explosionRange").worldRestart()
                    .defineInRange("set explosionRange range",2,0,6);
            builder.pop();
        }
    }
    public static final ForgeConfigSpec CONFIG_SPEC;
    public static final Common COMMON;
    static{
        final Pair<Common,ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Common::new);
        CONFIG_SPEC = specPair.getRight();
        COMMON = specPair.getLeft();


    }
    @SubscribeEvent
    public static void onLoad(final ModConfig.Loading event){}

    @SubscribeEvent
    public static void onFileChange(final ModConfig.Reloading event){

    }
}
