package com.gdx.test;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class test extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	GameObject gameObject1;
	boolean bounce_animate = false;

	@Override
	public void create() {
		batch = new SpriteBatch();
		img = new Texture("ball.png");
		gameObject1 = new GameObject(img);

	}

	@Override
	public void render() {

		logic();
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(gameObject1.getTexture(), gameObject1.x, gameObject1.y);
		batch.end();
	}

	@Override
	public void dispose() {
		batch.dispose();
		img.dispose();
	}

	public void logic() {
		
		if( Gdx.input.isKeyJustPressed(Input.Keys.A)) {
			bounce_animate = true;
		}
		
		if(bounce_animate) {
			if( gameObject1.y >= 400 ) {
				System.out.println("Goes down");
				if( gameObject1.y <= 50) {
					bounce_animate = false;					
				}
				else {
					gameObject1.y -= 1.0;
				}					
			}
			else {
				gameObject1.y += 1.0;
			}
		}
		
		System.out.println("y = "+gameObject1.y);
	}
}
