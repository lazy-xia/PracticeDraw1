package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形

        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.FILL);

        Path path = new Path();
        path.addArc(200, 200, 400, 400, -180, 180);
//        path.addArc(400, 200, 600, 400, -180, 180);
        path.arcTo(400, 200, 600, 400, -180, 180,false);
        path.lineTo(400, 400);
        canvas.drawPath(path,paint);
    }
}
