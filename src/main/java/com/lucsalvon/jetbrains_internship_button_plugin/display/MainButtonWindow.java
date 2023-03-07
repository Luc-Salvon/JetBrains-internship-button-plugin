package com.lucsalvon.jetbrains_internship_button_plugin.display;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

public class MainButtonWindow extends DialogWrapper {
    Project currentProject;

    public MainButtonWindow(Project currentProject) {
        super(currentProject, true);
        this.currentProject = currentProject;
        setTitle("Internship Task");
        init();
    }


    @Override
    protected @Nullable JComponent createCenterPanel() {
        JPanel dialogPanel = new JPanel(new BorderLayout());

        String labelText = "Hi!\n\nThanks for checking out my application task!\nHere's a song I really enjoy right now and a cat video to brighten your day :D";
        JLabel label = new JLabel(labelText);
        dialogPanel.add(label, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout());

        LinkButton linkedInButton = new LinkButton(currentProject, "Song", "https://www.youtube.com/watch?v=vfTiuZaESKs");
        LinkButton gitHubButton = new LinkButton(currentProject, "Cat video", "https://www.youtube.com/watch?v=kgrV3_g9rYY");

        buttonPanel.add(linkedInButton);
        buttonPanel.add(gitHubButton);

        dialogPanel.add(buttonPanel, BorderLayout.SOUTH);


        return dialogPanel;
    }
}
