package com.dionnatas.imagenslayout.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class ResourceUtils {
    public static Drawable devolveDrawable(Context context, String drawaebleEmTexto) {
        Resources resources = context.getResources();
        int idDoDrawable = resources.getIdentifier(drawaebleEmTexto
                , "drawable", context.getPackageName());
        return resources.getDrawable(idDoDrawable);
    }
}
