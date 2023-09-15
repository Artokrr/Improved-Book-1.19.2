package net.artokrr.improvedbook.item;

import net.artokrr.improvedbook.ImprovedBookMod;
import net.artokrr.improvedbook.gui.ImprovedBookScreenHandler;

import net.artokrr.improvedbook.item.custom.ImprovedBookItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {
    public static final ScreenHandlerType<ImprovedBookScreenHandler> IMPROVED_BOOK_SCREEN_HANDLER;

    static {
        IMPROVED_BOOK_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(ImprovedBookMod.MOD_ID, "improved_book_screen_handler"), ImprovedBookScreenHandler::new);
    }


    public static final Item IMPROVED_BOOK = registerItem("improved_book",
            new ImprovedBookItem(new FabricItemSettings().group(ModItemGroup.IMPROVED_BOOK).maxCount(1)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ImprovedBookMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ImprovedBookMod.LOGGER.info("Registering mod items for " + ImprovedBookMod.MOD_ID);
    }
}
