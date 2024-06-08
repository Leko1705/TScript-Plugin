package com.tscript.tscriptplugin;

import com.intellij.lang.Language;

public class TScriptLanguage extends Language {

    public static final TScriptLanguage INSTANCE = new TScriptLanguage();

    private TScriptLanguage() {
        super("TScript");
    }

}
