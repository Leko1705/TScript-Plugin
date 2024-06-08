package com.tscript.tscriptplugin;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class TScriptElementType extends IElementType {

    public TScriptElementType(@NonNls @NotNull String debugName) {
        super(debugName, TScriptLanguage.INSTANCE);
    }
    
}
