package com.war.of.piszczac.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

import com.war.of.piszczac.core.ILocalizable;
import com.war.of.piszczac.core.ISizable;
import com.war.of.piszczac.core.IUpdatable;

public abstract class Sprite implements ILocalizable, ISizable, IDrawable,
		ISprite, IUpdatable {

	private int _x;
	private int _y;
	private int _width;
	private int _height;
	private int _drawOrder;
	private Bitmap _bitmap;
	private boolean _visible;
	private boolean _enable;
	private Paint _paint;

	public Sprite(int x, int y, int width, int height, Bitmap bitmap) {
		this._x = x;
		this._y = y;
		this._width = width;
		this._height = height;
		this._bitmap = bitmap;
		this._visible = true;
	}

	@Override
	public void draw(Canvas canvas) {
		if (isVisible() && getBitmap() != null) {
			canvas.drawBitmap(getBitmap(), getSourceRect(), getBounds(), _paint);
		}
	}

	protected Rect getSourceRect() {
		return new Rect(0, 0, getWidth(), getHeight());
	}

	@Override
	public int getX() {
		return _x;
	}

	@Override
	public int getY() {
		return _y;
	}

	@Override
	public void setX(int x) {
		this._x = x;
	}

	@Override
	public void setY(int y) {
		this._y = y;
	}

	@Override
	public int getWidth() {
		return this._width;
	}

	@Override
	public int getHeight() {
		return this._height;
	}

	@Override
	public void setWidth(int width) {
		this._width = width < 0 ? 0 : width;
	}

	@Override
	public void setHeight(int height) {
		this._height = height < 0 ? 0 : height;
	}

	@Override
	public void resize(int width, int height) {
		setWidth(width);
		setHeight(height);
	}

	@Override
	public int getDrawOrder() {
		return this._drawOrder;
	}

	@Override
	public void setDrawOrder(int order) {
		this._drawOrder = order;
	}

	@Override
	public Rect getBounds() {
		return new Rect(getX(), getY(), getX() + getWidth(), getY()
				+ getHeight());
	}

	@Override
	public Bitmap getBitmap() {
		return this._bitmap;
	}

	@Override
	public void setBitmap(Bitmap bitmap) {
		this._bitmap = bitmap;
	}

	@Override
	public void setVisible(boolean flag) {
		this._visible = flag;
	}

	@Override
	public boolean isVisible() {
		return _visible;
	}

	@Override
	public void update() {

	}

	@Override
	public Paint getPaint() {
		return _paint;
	}

	@Override
	public void setPaint(Paint _paint) {
		this._paint = _paint;
	}

	@Override
	public boolean isEnabled() {
		return _enable;
	}

	@Override
	public void setEnabled(boolean _enable) {
		this._enable = _enable;
	}
}
