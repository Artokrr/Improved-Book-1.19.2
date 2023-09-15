package net.artokrr.improvedbook.gui;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WButton;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.WListPanel;
import io.github.cottonmc.cotton.gui.widget.WPlainPanel;
import io.github.cottonmc.cotton.gui.widget.WScrollPanel;
import io.github.cottonmc.cotton.gui.widget.WSprite;
import io.github.cottonmc.cotton.gui.widget.WText;
import io.github.cottonmc.cotton.gui.widget.WTextField;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import net.fabricmc.fabric.api.util.TriState;
import net.minecraft.client.gui.screen.ingame.BookScreen;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class LibGuiGui extends LightweightGuiDescription {
    List<String> pages = new ArrayList<>();
    String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
            "Integer maximus, leo id varius rhoncus, elit erat varius felis, eget pulvinar massa nisi porttitor ex. Cras " +
            "mattis commodo metus accumsan mollis. Mauris lobortis quam et nisi suscipit, a tempus mi scelerisque. Sed ac quam efficitur, porta nisl " +
            "a, tempus dolor. Aenean vitae nulla ac est egestas ultricies. Ut eget mi a massa dapibus porttitor. " +
            "Proin risus elit, posuere vitae cursus id, pharetra id nunc. Donec tristique erat non nulla consequat, vel malesuada nunc " +
            "vestibulum. Integer nec euismod augue. In accumsan sapien mauris, eget varius quam condimentum id. Integer et " +
            "pellentesque metus. Ut porta neque tellus, eget porta ligula suscipit ac. In a ultricies risus. Suspendisse aliquam massa ut " +
            "iaculis lacinia. Phasellus sit amet magna placerat, vestibulum lorem condimentum, sodales magna.\n" +
            "\n" +
            "Donec suscipit pellentesque dui, eget condimentum dui feugiat vitae. Vivamus quam eros, bibendum id lorem ac, elementum " +
            "pellentesque ante. Quisque ac cursus nibh. Sed commodo, ipsum ac bibendum faucibus, magna nunc eleifend nisl, eget bibendum " +
            "lectus augue eget nisl. Nullam viverra, enim ornare aliquet porta, libero magna fringilla felis, at hendrerit sapien nisl id lectus. " +
            "Fusce nisi nunc, vulputate quis scelerisque eget, mattis et ex. Class aptent taciti sociosqu ad litora torquent per conubia nostra, " +
            "per inceptos himenaeos. Maecenas efficitur nulla et pulvinar venenatis. Donec libero mauris, ornare in finibus a, sodales at turpis. " +
            "Curabitur quis ex bibendum sem euismod porta sed eget dolor. Pellentesque vel efficitur sapien. Pellentesque id rutrum augue. " +
            "In lacinia mattis erat, mollis malesuada enim. Suspendisse vel mi a sapien ultrices imperdiet. Quisque in odio hendrerit, tincidunt ex " +
            "at, vestibulum mauris. Mauris blandit imperdiet velit.\n" +
            "\n" +
            "Cras id pretium ante. Pellentesque viverra sollicitudin venenatis. Maecenas et sagittis lacus. Nullam velit tortor, ullamcorper eget convallis eu, " +
            "interdum et lorem. Sed varius lacinia nunc, ac elementum justo aliquet id. Vivamus efficitur id mi at iaculis. Nam id convallis odio. Nullam tincidunt " +
            "ipsum eu nibh luctus laoreet sit amet non mauris. Mauris interdum tellus vel ipsum sollicitudin blandit. Cras ultrices magna tellus, eget gravida ipsum" +
            " condimentum quis. Fusce quis nibh tempus, sagittis nibh ut, eleifend massa. Suspendisse eleifend quis ligula id lobortis. Vivamus eleifend dolor mi, " +
            "quis tempor metus rhoncus non. In consequat id sem id condimentum. Aenean sed accumsan ante. In eu hendrerit diam, id interdum odio." +
            "Cras id pretium ante. Pellentesque viverra sollicitudin venenatis. Maecenas et sagittis lacus. Nullam velit tortor, ullamcorper eget convallis eu";

    public LibGuiGui() {
        WPlainPanel root = new WPlainPanel();
        setRootPanel(root);
        root.setSize(550, 450);
        root.setInsets(Insets.ROOT_PANEL);



        WText text = new WText(Text.literal(loremIpsum));

        WText text2 = new WText(Text.literal(loremIpsum));
        WPlainPanel textPanel = new WPlainPanel();
        textPanel.setSize(500, 1000);
        textPanel.add(text, 0, 0, 500, 0);
        textPanel.add(text2, 0, 300, 500, 0);
        WScrollPanel scrollPanel = new WScrollPanel(textPanel);
        scrollPanel.setScrollingHorizontally(TriState.FALSE);
        root.add(scrollPanel,0, 0, 510, 400);
        /*root.add(text, 0, 0, 550, 0);*/
        /*WButton nextPageButton = new WButton(Text.translatable("gui.improvedbook.nextpagebutton"));
        root.add(nextPageButton, 550, 450, 50, 5);
        WButton previousPageButton = new WButton(Text.translatable("gui.improvedbook.previouspagebutton"));
        root.add(previousPageButton, 0, 450, 50, 5);*/



//        WLabel label = new WLabel(Text.literal("Test"), 0xFFFFFF);
//        root.add(label, 0, 4, 2, 1);
        root.validate(this);
    }
}
