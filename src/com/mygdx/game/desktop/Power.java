package com.mygdx.game.desktop;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;

public class Power {

	public static final ArrayList<Texture> power = new ArrayList<Texture>();

	
	float x ;
	float y ;
	public Power(float x,float y)
	{	
		this.x = x;
		this.y = y;
		power.add(new Texture("power2.png"));
		power.add(new Texture("power3.png"));		
	}
	
	public Texture getPic()
	{
		return power.get((Game.run/4) %2);
	}
	
}
