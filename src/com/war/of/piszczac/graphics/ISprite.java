package com.war.of.piszczac.graphics;

import android.graphics.Bitmap;
import android.graphics.Rect;

public interface ISprite {
	Rect getBounds();
	Bitmap getBitmap();
	void setBitmap(Bitmap bitmap);
	void setVisible(boolean flag);
	boolean isVisible();
}
