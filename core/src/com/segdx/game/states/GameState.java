package com.segdx.game.states;

import com.badlogic.gdx.Screen;
import com.segdx.game.SEGDX;
import com.segdx.game.managers.Assets;

public class GameState implements Screen{

	@Override
	public void show() {
		
	}

	@Override
	public void render(float delta) {
		SEGDX.clear();
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

	@Override
	public void hide() {
	}

	@Override
	public void dispose() {
		//batch.dispose();
		Assets.disposeBlock(Assets.GAME_ASSETS);
	}

}
