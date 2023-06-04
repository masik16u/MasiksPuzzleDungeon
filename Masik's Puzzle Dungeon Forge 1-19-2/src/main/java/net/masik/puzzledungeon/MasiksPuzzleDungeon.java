package net.masik.puzzledungeon;

import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(MasiksPuzzleDungeon.MOD_ID)
public class MasiksPuzzleDungeon
{
    public static final String MOD_ID = "masiks_puzzle_dungeon";
    private static final Logger LOGGER = LogUtils.getLogger();

    //public static final String CREATE = "create";
    //public static final String QUARK = "quark";

    public MasiksPuzzleDungeon()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            //if ( ModList.get().isLoaded(CREATE)) {
            //    LOGGER.info("Create mod is loaded!");
            //}
            //if ( ModList.get().isLoaded(QUARK)) {
            //    LOGGER.info("Quark mod is loaded!");
            //}
        }
    }
}
