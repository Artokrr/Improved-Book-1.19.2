package net.artokrr.improvedbook.gui;

import com.mojang.authlib.GameProfile;
import net.artokrr.improvedbook.item.ModItems;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.screen.slot.Slot;

public class ImprovedBookScreenHandler extends ScreenHandler {


    public ImprovedBookScreenHandler(int syncId, PlayerInventory inventory) {
        super(ModItems.IMPROVED_BOOK_SCREEN_HANDLER, syncId);
    }


    @Override
    public boolean canUse(PlayerEntity player) {
        return true;
    }

    @Override
    public boolean onButtonClick(PlayerEntity player, int id) {
        return super.onButtonClick(player, id);
    }

    @Override
    public ItemStack transferSlot(PlayerEntity player, int index) {
        return null;
    }

    @Override
    public void close(PlayerEntity player) {
        super.close(player);
    }
}
