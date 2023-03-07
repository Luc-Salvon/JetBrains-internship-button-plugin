package com.lucsalvon.jetbrains_internship_button_plugin.display;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.ui.jcef.JBCefBrowser;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class BrowserWindow extends DialogWrapper {
    String url;

    public BrowserWindow(Project currentProject, String url) {
        super(currentProject, true);
        this.url = url;
        init();
    }

    @Override
    protected @Nullable JComponent createCenterPanel() {
        JBCefBrowser jbCefBrowser = new JBCefBrowser();
        jbCefBrowser.loadURL(url);
        return jbCefBrowser.getComponent();
    }

}
