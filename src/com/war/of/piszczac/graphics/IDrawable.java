package com.war.of.piszczac.graphics;

import android.graphics.Canvas;
import android.graphics.Paint;

public interface IDrawable {
	
	int getDrawOrder();
	void setDrawOrder(int order);
	void draw(Canvas canvas);
	void setPaint(Paint paint);
	Paint getPaint();
}
