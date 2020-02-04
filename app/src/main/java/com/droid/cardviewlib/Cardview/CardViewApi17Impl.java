package com.droid.cardviewlib.Cardview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

import androidx.annotation.RequiresApi;

@RequiresApi(17)
class CardViewApi17Impl extends CardViewBaseImpl {
    CardViewApi17Impl() {
    }

    public void initStatic() {
        RoundRectDrawableWithShadow.sRoundRectHelper = new RoundRectDrawableWithShadow.RoundRectHelper() {
            public void drawRoundRect(Canvas canvas, RectF bounds, float cornerRadius, Paint paint) {
                canvas.drawRoundRect(bounds, cornerRadius, cornerRadius, paint);
            }
        };
    }
}
