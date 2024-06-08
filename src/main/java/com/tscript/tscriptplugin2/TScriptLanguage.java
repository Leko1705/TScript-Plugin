package com.tscript.tscriptplugin2;

import com.intellij.lang.Language;

public class TScriptLanguage extends Language {

    public static final TScriptLanguage INSTANCE = new TScriptLanguage();

    private TScriptLanguage() {
        super("TScript");
    }

}
