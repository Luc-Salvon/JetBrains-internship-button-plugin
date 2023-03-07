package com.lucsalvon.jetbrains_internship_button_plugin.display;

import com.intellij.openapi.project.Project;

import javax.swing.*;

/**
 * Represents a button which, when clicked, opens a link on an internal web browser window
 */
public class LinkButton extends JButton {
    /**
     * Creates an instance of a link button
     * @param currentProject the current project
     * @param label the text to be displayed on the button
     * @param url the url of the website the button will link to
     */
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
