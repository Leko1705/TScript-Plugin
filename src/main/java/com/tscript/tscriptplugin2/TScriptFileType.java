package com.tscript.tscriptplugin2;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.util.NlsSafe;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class TScriptFileType extends LanguageFileType {

    public static final TScriptFileType INSTANCE = new TScriptFileType();

    private TScriptFileType() {
        super(TScriptLanguage.INSTANCE);
    }

    @Override
    public @NonNls @NotNull String getName() {
        return "TScript File";
    }

    @Override
    public @NlsContexts.Label @NotNull String getDescription() {
        return "TScript language file";
    }

    @Override
    public @NlsSafe @NotNull String getDefaultExtension() {
        return "tscript";
    }

    @Override
    public Icon getIcon() {
        return TScriptIcon.FILE;
    }
}
