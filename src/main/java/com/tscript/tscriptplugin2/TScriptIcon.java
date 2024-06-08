package com.tscript.tscriptplugin2;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class TScriptIcon extends AnAction {

    public static final Icon FILE = IconLoader.getIcon("icons/test_icon.png", TScriptIcon.class);

    public TScriptIcon(){
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {

    }

}
