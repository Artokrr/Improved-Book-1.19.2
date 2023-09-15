package net.artokrr.improvedbook.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ImprovedBookScreen extends HandledScreen<ImprovedBookScreenHandler> {
    private static final Identifier TEXTURE = new Identifier("improvedbook", "textures/gui/container/book_gui.png");
    private TextFieldWidget textField;


    public ImprovedBookScreen(ImprovedBookScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);

    }
    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (this.width - this.backgroundWidth) / 2;
        int y = (this.height - this.backgroundHeight) / 2;
        this.drawTexture(matrices, x, y, 0, 0, this.backgroundWidth, this.backgroundHeight);
        this.drawTexture(matrices, x, y + 3 * 18 + 17, 0, 126, this.backgroundWidth, 96);
    }

    @Override
    protected void init() {
        super.init();
        int textFieldWidth = 400;
        int textFieldHeight = 400;
        int textFieldX = (this.width - textFieldWidth) / 2;  // Center it horizontally
        int textFieldY = (this.height - textFieldHeight) / 2;  // Center it vertically
        this.textField = new TextFieldWidget(this.textRenderer, textFieldX, textFieldY, textFieldWidth, textFieldHeight, Text.of("Enter text here"));
        this.setInitialFocus(this.textField);
        this.addDrawableChild(this.textField);
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        super.render(matrices, mouseX, mouseY, delta);
        this.textField.render(matrices, mouseX, mouseY, delta);
    }
}
