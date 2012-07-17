package com.siu.android.andgapisutils.util;

import android.graphics.drawable.Drawable;

/**
 * @author Lukasz Piliszczuk <lukasz.pili AT gmail.com>
 */
public final class MarkerUtils {

    private MarkerUtils() {
    }

    public static Drawable boundBottomLeft(Drawable drawable) {
        drawable.setBounds(0, -drawable.getIntrinsicHeight(), drawable.getIntrinsicWidth(), 0);
        return drawable;
    }
}
