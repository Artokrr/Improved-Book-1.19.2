/*
package net.artokrr.improvedbook.gui;

import io.wispforest.owo.ui.base.BaseUIModelScreen;
import io.wispforest.owo.ui.component.ButtonComponent;
import io.wispforest.owo.ui.component.Components;
import io.wispforest.owo.ui.container.Containers;
import io.wispforest.owo.ui.container.FlowLayout;
import io.wispforest.owo.ui.core.HorizontalAlignment;
import io.wispforest.owo.ui.core.Sizing;
import io.wispforest.owo.ui.core.VerticalAlignment;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class TestOwoScreen extends BaseUIModelScreen<FlowLayout> {


    public TestOwoScreen() {
        super(FlowLayout.class, DataSource.asset(new Identifier("improvedbook", "sizing")));
    }


    @Override
    protected void build(FlowLayout rootComponent) {

        rootComponent.childById(ButtonComponent.class, "inspector-button")
                .onPress(button -> this.uiAdapter.toggleInspector());
        var boxContainer = rootComponent.childById(FlowLayout.class, "box-container");

        // --------

        var contentButton = rootComponent.childById(ButtonComponent.class, "content-button");
        var contentX = rootComponent.childById(TextFieldWidget.class, "content-x-text-box");
        var contentY = rootComponent.childById(TextFieldWidget.class, "content-y-text-box");
        rootComponent.child(
                Containers.verticalFlow(Sizing.fixed(50), Sizing.fixed(50))
                        .child(Components.textBox(Sizing.fixed(100))).verticalAlignment(VerticalAlignment.CENTER)
                        .horizontalAlignment(HorizontalAlignment.CENTER)
        );

        contentX.setTextPredicate(s -> s.matches("\\d*"));
        contentX.setChangedListener(sizingListener(contentX, contentY, contentButton));

        contentY.setTextPredicate(s -> s.matches("\\d*"));
        contentY.setChangedListener(sizingListener(contentX, contentY, contentButton));

        contentButton.onPress(button -> {
            boxContainer.sizing(
                    Sizing.content(Integer.parseInt(contentX.getText())),
                    Sizing.content(Integer.parseInt(contentY.getText()))
            );
        });

        // --------

        var fixedButton = rootComponent.childById(ButtonComponent.class, "fixed-button");
        var fixedX = rootComponent.childById(TextFieldWidget.class, "fixed-x-text-box");
        var fixedY = rootComponent.childById(TextFieldWidget.class, "fixed-y-text-box");

        fixedX.setTextPredicate(s -> s.matches("\\d*"));
        fixedX.setChangedListener(sizingListener(fixedX, fixedY, fixedButton));

        fixedY.setTextPredicate(s -> s.matches("\\d*"));
        fixedY.setChangedListener(sizingListener(fixedX, fixedY, fixedButton));

        fixedButton.onPress(button -> {
            boxContainer.sizing(
                    Sizing.fixed(Integer.parseInt(fixedX.getText())),
                    Sizing.fixed(Integer.parseInt(fixedY.getText()))
            );
        });

        // --------

        var fillButton = rootComponent.childById(ButtonComponent.class, "fill-button");
        var fillX = rootComponent.childById(TextFieldWidget.class, "fill-x-text-box");
        var fillY = rootComponent.childById(TextFieldWidget.class, "fill-y-text-box");

        fillX.setTextPredicate(s -> s.matches("\\d*"));
        fillX.setChangedListener(sizingListener(fillX, fillY, fillButton));

        fillY.setTextPredicate(s -> s.matches("\\d*"));
        fillY.setChangedListener(sizingListener(fillX, fillY, fillButton));

        fillButton.onPress(button -> {
            boxContainer.sizing(
                    Sizing.fill(Integer.parseInt(fillX.getText())),
                    Sizing.fill(Integer.parseInt(fillY.getText()))
            );
        });
    }

    private static Consumer<String> sizingListener(TextFieldWidget x, TextFieldWidget y, ButtonWidget button) {
        return s -> button.active = !(x.getText().isEmpty() || y.getText().isEmpty());
    }


}

*/
