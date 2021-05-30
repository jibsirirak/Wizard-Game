package com.mygdx.game.desktop;

import com.badlogic.gdx.graphics.Texture;

public class Item {

	Texture bomb1;
	int boom = 0;
	float x = 510;
	float y = 470;
	Texture potion;
	
	public Item(int i)
	{
		boom = i;
		bomb1 = new Texture("bomb1.png");
		potion = new Texture("potion.png");
	}
	public Texture getPic()
	{
		if(boom == 0)
		{
			return bomb1;
		}
		else
		{
			return potion;
		}
	}
}
