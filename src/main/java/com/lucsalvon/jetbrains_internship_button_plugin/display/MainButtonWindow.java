package com.lucsalvon.jetbrains_internship_button_plugin.display;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.util.ui.JBUI;
import org.jetbrains.annotations.NotNull;
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
    protected Action @NotNull [] createActions(){
        return new Action[]{this.getOKAction()};
    }


    @Override
    protected @Nullable JComponent createCenterPanel() {
        JPanel dialogPanel = new JPanel(new BorderLayout());

        String labelText = "<b>Hi!</b> Thanks for checking out my application task! <br><br> Here's a song I really enjoy right now as well as a cat video to brighten your day :D";
        JLabel label = new JLabel("<html><p style=\"width:270px\">" + labelText + "</p></html>");
        label.setSize(100, 100);
        dialogPanel.add(label, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));

        LinkButton linkedInButton = new LinkButton(currentProject, "Song", "https://www.youtube.com/watch?v=vfTiuZaESKs");
        LinkButton gitHubButton = new LinkButton(currentProject, "Cat video", "https://www.youtube.com/watch?v=kgrV3_g9rYY");

        buttonPanel.add(linkedInButton);
        buttonPanel.add(gitHubButton);
        buttonPanel.setBorder(JBUI.Borders.emptyTop(10));

        dialogPanel.add(buttonPanel, BorderLayout.SOUTH);


        return dialogPanel;
    }
}
