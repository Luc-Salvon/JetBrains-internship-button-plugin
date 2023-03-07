package com.lucsalvon.jetbrains_internship_button_plugin.display;

import com.intellij.openapi.project.Project;

import javax.swing.*;

public class LinkButton extends JButton {
    public LinkButton(Project currentProject, String label, String url) {
        // Crates a labelled button
        super(label);
        // When button pressed, launch a new window with an internal browser working the specified url
        super.addActionListener(actionEvent -> {
            BrowserWindow browserWindow = new BrowserWindow(currentProject, url);
            browserWindow.showAndGet();
            // Wait until the new window is closed, then close the browser as well
            browserWindow.disposeBrowser();
        });

    }

}
