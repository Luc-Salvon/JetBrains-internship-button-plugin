package com.lucsalvon.jetbrains_internship_button_plugin.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.lucsalvon.jetbrains_internship_button_plugin.display.MainButtonWindow;
import org.jetbrains.annotations.NotNull;

/**
 * Represents the action to be performes when the UI button is pressed
 */
public class ModalWindowButtonAction extends AnAction {
    // Needs to be overridden, though there is no appropriate moment when this action should not be performes, so I kept it blank
    @Override
    public void update(@NotNull AnActionEvent event) {
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {
        Project currentProject = event.getProject();
        new MainButtonWindow(currentProject).show();

    }
}
