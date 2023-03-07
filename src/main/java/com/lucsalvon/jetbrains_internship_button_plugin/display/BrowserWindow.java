package com.lucsalvon.jetbrains_internship_button_plugin.display;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.ui.jcef.JBCefBrowser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Represents a window displaying the internal web browser
 */
public class BrowserWindow extends DialogWrapper {
    JBCefBrowser jbCefBrowser; // Instance of the internal web browser

    /**
     * Creates a new browser window
     * @param currentProject the current project
     * @param url the url of the website to be displayed by the web browser
     */
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

    /**
     * Disposes of the browser instance
     */
    protected void disposeBrowser() {
        jbCefBrowser.dispose();
    }

}
