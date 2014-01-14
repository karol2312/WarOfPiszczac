package com.war.of.piszczac.core;

import android.graphics.Canvas;
import android.view.SurfaceHolder;

public class GameThread extends Thread {

	private SurfaceHolder _surfaceHolder;
	private GameState _gameState;

	public GameThread(SurfaceHolder surfaceHolder){
		super();
		
		this._surfaceHolder = surfaceHolder;
	}
	
	
	@Override
	public void run() {
		Canvas canvas;

		while (_gameState == GameState.RUNNING) {
			canvas = null;
			try {
				canvas = _surfaceHolder.lockCanvas();
				synchronized (_surfaceHolder) {
				}
			} finally {
				if (canvas != null) {
					_surfaceHolder.unlockCanvasAndPost(canvas);
				}
			}
		}
	}

	public GameState getGameState() {
		return _gameState;
	}

	public void setGameState(GameState _gameState) {
		this._gameState = _gameState;
	}
}
