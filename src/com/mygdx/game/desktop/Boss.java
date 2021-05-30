package com.mygdx.game.desktop;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;

public class Boss {
	public static ArrayList<Texture> boss = new ArrayList<Texture>();
	public static ArrayList<Texture> boss2 = new ArrayList<Texture>();
	public static ArrayList<Texture> boss3 = new ArrayList<Texture>();

	int hpboss = 100;
	float x = 1300;
	float y = 50;
	public Boss()
	{
	
		
		boss.add(new Texture("boss3-1.png"));
		boss.add(new Texture("boss3-2.png"));
		boss.add(new Texture("boss3-3.png"));
		boss.add(new Texture("boss3-4.png"));
		boss.add(new Texture("boss3-5.png"));
		boss.add(new Texture("boss3-6.png"));
		boss.add(new Texture("boss3-7.png"));
		
		boss2.add(new Texture("boss2-1.png"));
		boss2.add(new Texture("boss2-2.png"));
		boss2.add(new Texture("boss2-3.png"));
		boss2.add(new Texture("boss2-4.png"));
		boss2.add(new Texture("boss2-5.png"));
		boss2.add(new Texture("boss2-6.png"));
		boss2.add(new Texture("boss2-7.png"));
		
		boss3.add(new Texture("boss1.png"));
		boss3.add(new Texture("boss2.png"));
		boss3.add(new Texture("boss.3.png"));
		boss3.add(new Texture("boss4.png"));
		boss3.add(new Texture("boss5.png"));
		boss3.add(new Texture("boss6.png"));
		boss3.add(new Texture("boss7.png"));
		
		
	}
	
	public Texture getPic()
	{
		if(Game.dan == 0)
		{
			return boss.get((Game.run/8) %7); 
		}
		
		else if(Game.dan == 1)
		{
			return boss2.get((Game.run/8) %7); 
		}
		
		else
		{
			return boss3.get((Game.run/8) %7); 
		}
		
	}
}
