package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);

        Path path = new Path();
        path.moveTo(100, 100);
        path.rLineTo(0, 400);
        path.rLineTo(800, 0);

        canvas.drawPath(path, paint);
        for (int i = 0; i < 6; i++) {
            Rect rect = new Rect(100 + 10, 500 - (20 * i) -50, 100 + (10 + 50), 500);
            paint.setColor(Color.GREEN);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(rect, paint);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTextSize(12);
            canvas.drawText("X"+i,140,510,paint);
            canvas.translate(60, 0);
        }

    }


}
