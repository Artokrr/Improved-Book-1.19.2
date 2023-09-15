package net.artokrr.improvedbook.item.custom;

import net.artokrr.improvedbook.gui.LibGuiGui;
import net.artokrr.improvedbook.gui.LibGuiScreen;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.WritableBookItem;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ImprovedBookItem extends WritableBookItem {
    public ImprovedBookItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.literal("Улучшенная книга с пером, позволяющая писать больше текста на страницах,").formatted(Formatting.YELLOW));
            tooltip.add(Text.literal("а так же импортировать текстовые файлы, вставлять текст и изображения!"));
        } else {
            tooltip.add(Text.literal("Продвинутая книжка с пером!").formatted(Formatting.DARK_PURPLE));
            tooltip.add(Text.literal("Нажми SHIFT, чтобы узнать больше!").formatted(Formatting.DARK_PURPLE));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (world.isClient) {
            MinecraftClient.getInstance().setScreen(new LibGuiScreen(new LibGuiGui()));
        }
        /*if (!world.isClient) {
//            user.openHandledScreen(new SimpleNamedScreenHandlerFactory((syncId, inv, player) ->
//                new ImprovedBookScreenHandler(syncId,inv), Text.of("Improved Book")));
        }*/
        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
