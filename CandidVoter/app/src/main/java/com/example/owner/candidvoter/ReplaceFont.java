package com.example.owner.candidvoter;

import android.content.Context;
import android.graphics.Typeface;
import java.lang.reflect.Field;

/**
 * Created by Owner on 7/23/2015.
 */
public final class ReplaceFont {
    public static void replaceDefaultFont(Context context, String oldFont, String newFont){
        Typeface myFont = Typeface.createFromAsset(context.getAssets(),newFont);
        replaceFont(oldFont,myFont);
    }

    private static void replaceFont(String oldFont, final Typeface newTypeface) {
        Field myField = null;
        try {
            myField = Typeface.class.getDeclaredField(oldFont);
            myField.setAccessible(true);
            myField.set(null,newTypeface);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
