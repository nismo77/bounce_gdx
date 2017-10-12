package com.gdx.test;

import com.badlogic.gdx.math.Rectangle;

import com.badlogic.gdx.graphics.Texture;


public class GameObject extends Rectangle{
	
	private Texture texture;
	
	
	public GameObject(Texture texture) {
		
		this.texture = texture;
	}
	
	public Texture getTexture() {
		return texture;
	}

}
