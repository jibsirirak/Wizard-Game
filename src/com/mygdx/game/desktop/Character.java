package com.mygdx.game.desktop;

import java.util.ArrayList;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Character implements ApplicationListener{

	public static final ArrayList<Texture> Attack = new ArrayList<Texture>();
	public static final ArrayList<Texture> Running = new ArrayList<Texture>();
	public static final ArrayList<Texture> Jump = new ArrayList<Texture>();
	public static final ArrayList<Texture> Die = new ArrayList<Texture>();
	SpriteBatch batch;
	
	public Character()
	{
		batch = new SpriteBatch();
		
		Running.add(new Texture("r1.png"));
		Running.add(new Texture("r2.png"));
		Running.add(new Texture("r3.png"));
		Running.add(new Texture("r4.png"));
		Running.add(new Texture("r5.png"));
		
		Attack.add(new Texture("a1.png"));
		Attack.add(new Texture("a2.png"));
		Attack.add(new Texture("a3.png"));
		Attack.add(new Texture("a4.png"));
		Attack.add(new Texture("a5.png"));
		
		Jump.add(new Texture("j1.png"));
		Jump.add(new Texture("j2.png"));
		Jump.add(new Texture("j3.png"));
		Jump.add(new Texture("j4.png"));
		Jump.add(new Texture("j5.png"));
		
		Die.add(new Texture("d1.png"));
		Die.add(new Texture("d2.png"));
		Die.add(new Texture("d3.png"));
		Die.add(new Texture("d4.png"));
		Die.add(new Texture("d5.png"));
			
	}
	
	public static Texture getPic(int m)
	{
		if(m == 0)
		{
			return Running.get((Game.run/4) %5); 
		}
		
		else if(m == 1)
		{
			return Attack.get((Game.run/4) %5); 
		}

		else if(m == 2)
		{
			return Jump.get(4); 
		}

		else
		{
			return Die.get((Game.run/4) %5); 
		}	
	}
	
	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

}
