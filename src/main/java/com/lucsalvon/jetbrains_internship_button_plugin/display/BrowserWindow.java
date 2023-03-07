package com.lucsalvon.jetbrains_internship_button_plugin.display;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.ui.jcef.JBCefBrowser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class BrowserWindow extends DialogWrapper {
    JBCefBrowser jbCefBrowser;

    public BrowserWindow(Project currentProject, String url) {
        super(currentProject, true);

        jbCefBrowser = new JBCefBrowser();
        jbCefBrowser.loadURL(url);

        init();
    }

    @Override
    protected Action @NotNull [] createActions() {
        return new Action[]{this.getOKAction()};
    }

    @Override
    protected @Nullable JComponent createCenterPanel() {
        return jbCefBrowser.getComponent();
    }

    protected void disposeBrowser() {
        jbCefBrowser.dispose();
    }

}
