package com.war.of.piszczac.core;

public interface ISizable {
	int getWidth();
	int getHeight();
	void setWidth(int width);
	void setHeight(int height);
	void resize(int width, int height);
}
