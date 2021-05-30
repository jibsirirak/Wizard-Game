package com.mygdx.game.desktop;

import java.util.ArrayList;
import java.util.Random;

import com.badlogic.gdx.graphics.Texture;

public class Monster {

	public static final ArrayList<Texture> mons1 = new ArrayList<Texture>();
	public static final ArrayList<Texture> mons2 = new ArrayList<Texture>();
	public static final ArrayList<Texture> mons3 = new ArrayList<Texture>();

	int mo = 0;
	float x = 1300;
	float y = 50;
	public Monster(int i)
	{
		Random random = new Random();
		x += (random.nextInt(5) * 10);
		mo = i;
		
		mons1.add(new Texture("0000.png"));
		mons1.add(new Texture("0002.png"));
		mons1.add(new Texture("0004.png"));
		mons1.add(new Texture("0006.png"));
		
		mons2.add(new Texture("a_000.png"));
		mons2.add(new Texture("a_008.png"));
		mons2.add(new Texture("a_016.png"));
		mons2.add(new Texture("a_024.png"));
		mons2.add(new Texture("a_032.png"));
		mons2.add(new Texture("a_040.png"));
		
		mons3.add(new Texture("og_000.png"));
		mons3.add(new Texture("og_008.png"));
		mons3.add(new Texture("og_016.png"));
		mons3.add(new Texture("og_024.png"));
		mons3.add(new Texture("og_032.png"));
		mons3.add(new Texture("og_040.png"));
		
		
		
		
	}
	
	public Texture getPic()
	{
		if(mo == 0)
		{
			return mons1.get((Game.run/6) %4); 
		}
		
		else if(mo == 1)
		{
			return mons2.get((Game.run/8) %6); 
		}
		
		else
		{
			return mons3.get((Game.run/8) %6); 
		}
		
	}
	
	
}
