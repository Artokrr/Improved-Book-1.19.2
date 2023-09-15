package net.artokrr.improvedbook;

import net.artokrr.improvedbook.gui.ImprovedBookScreen;
import net.artokrr.improvedbook.item.ModItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

public class ImprovedBookModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(ModItems.IMPROVED_BOOK_SCREEN_HANDLER, ImprovedBookScreen::new);

    }
}
