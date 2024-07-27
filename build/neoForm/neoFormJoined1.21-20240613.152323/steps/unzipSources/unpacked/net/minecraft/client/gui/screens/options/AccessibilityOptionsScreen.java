package net.minecraft.client.gui.screens.options;

import net.minecraft.client.OptionInstance;
import net.minecraft.client.Options;
import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.Tooltip;
import net.minecraft.client.gui.layouts.LinearLayout;
import net.minecraft.client.gui.screens.ConfirmLinkScreen;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.util.CommonLinks;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class AccessibilityOptionsScreen extends OptionsSubScreen {
    public static final Component TITLE = Component.translatable("options.accessibility.title");

    private static OptionInstance<?>[] options(Options pOptions) {
        return new OptionInstance[]{
            pOptions.narrator(),
            pOptions.showSubtitles(),
            pOptions.highContrast(),
            pOptions.autoJump(),
            pOptions.menuBackgroundBlurriness(),
            pOptions.textBackgroundOpacity(),
            pOptions.backgroundForChatOnly(),
            pOptions.chatOpacity(),
            pOptions.chatLineSpacing(),
            pOptions.chatDelay(),
            pOptions.notificationDisplayTime(),
            pOptions.bobView(),
            pOptions.toggleCrouch(),
            pOptions.toggleSprint(),
            pOptions.screenEffectScale(),
            pOptions.fovEffectScale(),
            pOptions.darknessEffectScale(),
            pOptions.damageTiltStrength(),
            pOptions.glintSpeed(),
            pOptions.glintStrength(),
            pOptions.hideLightningFlash(),
            pOptions.darkMojangStudiosBackground(),
            pOptions.panoramaSpeed(),
            pOptions.hideSplashTexts(),
            pOptions.narratorHotkey()
        };
    }

    public AccessibilityOptionsScreen(Screen pLastScreen, Options pOptions) {
        super(pLastScreen, pOptions, TITLE);
    }

    @Override
    protected void init() {
        super.init();
        AbstractWidget abstractwidget = this.list.findOption(this.options.highContrast());
        if (abstractwidget != null && !this.minecraft.getResourcePackRepository().getAvailableIds().contains("high_contrast")) {
            abstractwidget.active = false;
            abstractwidget.setTooltip(Tooltip.create(Component.translatable("options.accessibility.high_contrast.error.tooltip")));
        }
    }

    @Override
    protected void addOptions() {
        this.list.addSmall(options(this.options));
    }

    @Override
    protected void addFooter() {
        LinearLayout linearlayout = this.layout.addToFooter(LinearLayout.horizontal().spacing(8));
        linearlayout.addChild(
            Button.builder(Component.translatable("options.accessibility.link"), ConfirmLinkScreen.confirmLink(this, CommonLinks.ACCESSIBILITY_HELP)).build()
        );
        linearlayout.addChild(Button.builder(CommonComponents.GUI_DONE, p_345508_ -> this.minecraft.setScreen(this.lastScreen)).build());
    }
}