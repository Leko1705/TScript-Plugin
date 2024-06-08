package com.tscript.tscriptplugin;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class TScriptTokenType extends IElementType {
    public TScriptTokenType(@NonNls @NotNull String debugName) {
        super(debugName, TScriptLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "TScriptTokenType." + super.toString();
    }
}
