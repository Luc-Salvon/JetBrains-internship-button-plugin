package com.lucsalvon.jetbrains_internship_button_plugin.display;

import com.intellij.openapi.project.Project;

import javax.swing.*;

public class LinkButton extends JButton {
    public LinkButton(Project currentProject, String label, String url) {
        super(label);
        super.addActionListener(actionEvent -> new BrowserWindow(currentProject, url).show());

    }

}
