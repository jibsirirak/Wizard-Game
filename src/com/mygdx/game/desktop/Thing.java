package com.mygdx.game.desktop;

import com.badlogic.gdx.graphics.Texture;
import java.util.*;

public class Thing {
	
	Texture Barrel1,Barrel2,Bomb,Mast,Wheel,Stone3,Stone5,Stone6;
	int th = 0;
	float x = 1300;
	float y = 15;
	public Thing(int i)
	{
		Random random = new Random();
		x += (random.nextInt(10) * 8);
		th = i;
		
		Barrel1 = new Texture("Barrel_1.png");
		Barrel2 = new Texture("Barrel_2.png");
		Bomb = new Texture("Bomb.png");
		Mast = new Texture("Mast.png");
		Wheel = new Texture("Steering-wheel.png");
		Stone3 = new Texture("Stone_3.png");
		Stone5 = new Texture("Stone_5.png");
		Stone6 = new Texture("Stone_6.png");
		
	}
	
	public Texture getPic()
	{
		if(th == 1)
		{
			return Barrel1;
		}
		
		else if(th== 2)
		{
			return Barrel2;
		}
		
		else if(th == 3)
		{
			return Bomb;
		}
		
		else if(th == 4)
		{
			return Mast;
		}
		
		else if(th == 5)
		{
			return Wheel;
		}
		else if(th == 6)
		{
			return Stone3;
		}
		else if(th== 7)
		{
			return Stone5;
		}
		else
		{
			return Stone6;
		}
	}
	
	
}
