package com.mygdx.game.desktop;

import java.util.ArrayList;
import java.util.Random;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Game implements ApplicationListener {
	
	public static final String TITLE = "Wizard"; 
	public static final int V_WIDTH = 600;
	public static final int V_HEIGHT = 275;
	public static final int SCALE = 2;
	public static int scene = 0;
	
	public static ArrayList<Thing> Randomthing = new ArrayList<Thing>();
	public static ArrayList<Thing> Randomthing2 = new ArrayList<Thing>();
	public static ArrayList<Monster> Random_monster = new ArrayList<Monster>();
	public static ArrayList<Monster> Random_monster2 = new ArrayList<Monster>();
	public static ArrayList<Power> power1 = new ArrayList<Power>();
	public static ArrayList<Power> power2 = new ArrayList<Power>();
	public static ArrayList<Texture> over = new ArrayList<Texture>();
	public static ArrayList<Texture> winner = new ArrayList<Texture>();
	public static ArrayList<Texture> intro = new ArrayList<Texture>();
	public static ArrayList<Texture> howto = new ArrayList<Texture>();
	public static ArrayList<Boss> bossy = new ArrayList<Boss>();
	public static ArrayList<Boss> bossy2 = new ArrayList<Boss>();
	public static ArrayList<Item> tem = new ArrayList<Item>();
	public static ArrayList<Item> tem2 = new ArrayList<Item>();
	
	
	SpriteBatch batch;
	Texture cha1,introbg,map1,map2,map3;
	Texture startbt,guidebt,character1,character2,character3,character4,character5;
	Texture hp100,hp80,hp60,hp40,hp20,stage1,stage2,stage3,itemeiei,score,barboss100,barboss75,barboss50,barboss25,barboss1002,barboss752,barboss502,barboss252,barboss1003,barboss753,barboss503,barboss253;
	
	public Character Cha;
	public Item item;
	
	
	static int dan = 0;
	float x;
	float y;
	int s = 0;
	static int run = 0;
	int state = 0;
	int reload = 0;
	int chacreate = 1 ;
	int blood = 100;
	Boolean Bb = true;
	public int delay = 0;
	
	
	Random random = new Random();
	@Override
	public void create() {
		
		batch = new SpriteBatch();
		cha1 = new Texture("1_IDLE_003.png");
		introbg = new Texture("introbackground.png");
		map1 = new Texture("map1.png");
		map2 = new Texture("map2long.png");
		map3 = new Texture("map3long.png");
		
		hp100 = new Texture("hp100.png");
		hp80 = new Texture("hp80.png");
		hp60 = new Texture("hp60.png");
		hp40 = new Texture("hp40.png");
		hp20 = new Texture("hp20.png");
		stage1 = new Texture("stage1.png");
		stage2 = new Texture("stage2.png");
		stage3 = new Texture("stage3.png");
		itemeiei = new Texture("item1.png");
		score = new Texture("score.png");
		
		over.add(new Texture("ov1.png"));
		over.add(new Texture("ov2.png"));
		over.add(new Texture("ov3.png"));
		over.add(new Texture("ov4.png"));
		over.add(new Texture("ov5.png"));
		over.add(new Texture("ov6.png"));
		
		winner.add(new Texture("win2.png"));
		winner.add(new Texture("win3.png"));
		winner.add(new Texture("win2.png"));
		winner.add(new Texture("win1.png"));
		winner.add(new Texture("win2.png"));
		
		Cha = new Character();
		
		intro.add(new Texture("p1.png"));
		intro.add(new Texture("p2.png"));
		intro.add(new Texture("p3.png"));
		
		howto.add(new Texture("how1.png"));
		howto.add(new Texture("how2.png"));
		
		barboss100 = new Texture("barboss100.gif");
		barboss75 = new Texture("barboss75.gif");
		barboss50 = new Texture("barboss50.gif");
		barboss25 = new Texture("barboss25.gif");
		
		barboss1002 = new Texture("barboss100-2.gif");
		barboss752 = new Texture("barboss75-2.gif");
		barboss502 = new Texture("barboss50-2.gif");
		barboss252 = new Texture("barboss25-2.gif");
		
		barboss1003 = new Texture("barboss100-3.gif");
		barboss753 = new Texture("barboss75-3.gif");
		barboss503 = new Texture("barboss50-3.gif");
		barboss253 = new Texture("barboss25-3.gif");
		
		}

	@Override
	public void dispose() {
			
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void render() {
		
		batch.begin();
		run += 1;
		if(delay > 0)
		{
			delay -= 1;
		}
		if (scene == 0)
		{	
			batch.draw(introbg,x,y);
			batch.draw(intro.get((run/18)%3),x,y);
			
			float c = 0;
			float v = 0;
			
			if(Gdx.input.isTouched())
			{
				c = Gdx.input.getX();
				v = Gdx.input.getY();
			}
			
			startbt = new Texture("startbt.png");
			Buttonja sbt = new Buttonja(startbt,330,50,220,80);
			sbt.update(batch, c, v);
			
			guidebt = new Texture("guidebt (2).png");
			Buttonja gbt = new Buttonja(guidebt,670,50,220,80);
			gbt.update(batch, c, v);
			
		}
		
		if (scene == 2)
		{
			batch.draw(howto.get((run/20)%2), x, y);
			if(Gdx.input.isKeyPressed(Keys.ENTER)) 
			{
				scene = 0;
			}
		}
		
		if (scene == 3)
		{
			if(dan == 0)
			{
				batch.draw(map1, 0 - (run*2), 0 );
				batch.draw(stage1,870,420);
			}
			if(dan == 1)
			{
				batch.draw(map2, 0 - (run*2), 0 - 100 );
				batch.draw(stage2,870,420);
			} 
			if(dan == 2)
			{
				batch.draw(map3, 0 - (run*2), 0 - 100 );
				batch.draw(stage3,870,420);
			} 
			// =========================== control key ====================================//		
			if (y <= 0 ) 
			{
				if (Gdx.input.isKeyPressed(Keys.SPACE)&&(s==0)) 
				{
					s = 15;
					state = 2;
				}
			}
			if(s > 0) 
			{
				y += 20;
				s -= 1;
			}	
			if (y <= 0)
			{
				state = 0;
			}	
			if (y > 0) 
			{
				y = y - 3;
					
			}	
			if(Gdx.input.isKeyPressed(Keys.UP)&&(reload == 0)) 
			{
				reload = 100;
				power1.add(new Power(x+100 ,y+70));
			}
			if(reload > 85) 
			{
				
				state = 1;
			}	
			if(reload > 0) 
			{
				reload -=1;
			}
			
			if (Gdx.input.isKeyPressed(Keys.S)&& delay == 0) 
			{
				if(tem2.size() > 0)
				{
					if(tem2.get(0).boom == 0 ) 
					{
						Random_monster.clear();
						Random_monster2.clear();
						if(bossy2.size() > 0)
						{
							for(Boss a:bossy2)
							{
								if(a.hpboss > 0)
								{
									a.hpboss -= 50;
								}
								else
								{
									bossy.remove(a);
									dan += 1;
								}
								
							}
						}
						tem.remove(0);
					}
					if(tem2.get(0).boom == 1)
					{
						if(blood < 100)
						{
							blood += 20;	
						}
						tem.remove(0);
					}
				}
				delay += 100;
			}
			tem2.clear();
			tem2.addAll(tem);
			// ================================ power =================================//
			power2.addAll(power1);
			for(Power a: power2)
			{
				for(Monster b: Random_monster2)
				{
					if((b.x - a.x) < 150)
					{
						if((a.y - b.y) < 80)
						{
							power1.remove(a);
							Random_monster.remove(b);
						}
					}
				}
				
				for(Boss c: bossy2)
				{
					if((c.x - a.x) < -70)
					{
						if((a.y - c.y) < 500)
						{
							power1.remove(a);
							c.hpboss -=25;
						if(c.hpboss <= 0) 
						{
							if(dan < 2)
							{
								bossy.remove(c);
								x = 0;
								y = 0;
								run = 0;
								
								dan += 1;
								Randomthing.clear();
								Random_monster.clear();
								power1.clear();
								Bb = true;
							}
							else
							{
								scene = 5;
							}
							
						}
						}
					}
				}
				
				
				
				batch.draw(a.getPic(),a.x,a.y );
				a.x += 15;
				
				if(a.x > (V_WIDTH * SCALE) + 70)
				{
					power1.remove(a);
				}
				
			}
			power2.clear();
			Random_monster2.clear();
			Random_monster2.addAll(Random_monster);
				
			// =============================== Monster =======================================//
			
				if (run%300 == 0)                      
				{
					Random_monster.add(new Monster(dan));
				}
					
			for(Monster a:Random_monster)
			{
				batch.draw(a.getPic(),a.x,a.y);
				a.x -= 3;
				
			}
			
			for(Monster a:Random_monster2)
			{
				if(a.x <= -70)
				{
					Random_monster.remove(a); //out of window
				}
				if(a.x - (x + 175) < -50)  //event crash
				{
					if(y-(a.y + 100) < -50)  
					{
						blood -= 20;
						Random_monster.remove(a);
						
					}
				}
			}
			Random_monster2.clear();
			Random_monster2.addAll(Random_monster);
			// =============================== create thing ============================//	

			if (run%150 == 0)                      
			{
				Randomthing.add(new Thing(1 + random.nextInt(8)));
			}
			
			for(Thing a:Randomthing)
			{
				batch.draw(a.getPic(),a.x,a.y);
				a.x -= 6;
				
			}
			Randomthing2.addAll(Randomthing);
			
			for(Thing a:Randomthing2)
			{
				if(a.x <= -70)
				{
					Randomthing.remove(a); //out of window
				}
				if(a.x - (x + 175) < -50)  //event crash
				{
					if(y-(a.y + 100) < -50)  
					{
						Randomthing.remove(a);
						blood -= 20;
					}
				}
			}
			Randomthing2.clear();
			// ===================================== boss ===================================//
			if(dan == 0 && run % 500 == 0 && Bb) 
			{
				bossy.add(new Boss());
				Bb = false;
			}
			if(dan == 1 && run % 500 == 0 && Bb) 
			{
				bossy.add(new Boss());
				Bb = false;
			}
			if(dan == 2 && run % 500 == 0 && Bb) 
			{
				bossy.add(new Boss());
				Bb = false;
			}
			
			for(Boss b: bossy2)
			{
				
				batch.draw(b.getPic(),b.x,b.y);
				if(dan == 0)
				{
					b.x -= 1;

					if(b.hpboss == 100)
					{
						batch.draw(barboss100,b.x + 80,b.y + 250);
					}
					else if(b.hpboss == 75)
					{
						batch.draw(barboss75,b.x + 80,b.y + 250);
					}
					else if(b.hpboss == 50)
					{
						batch.draw(barboss50,b.x + 80,b.y + 250);
					}
					else
					{
						batch.draw(barboss25,b.x + 80,b.y + 250);
					}
				}
				if(dan == 1)
				{
					b.x -= 2;
					if(b.hpboss == 100)
					{
						batch.draw(barboss1002,b.x + 80,b.y + 250);
					}
					else if(b.hpboss == 75)
					{
						batch.draw(barboss752,b.x + 80,b.y + 250);
					}
					else if(b.hpboss == 50)
					{
						batch.draw(barboss502,b.x + 80,b.y + 250);
					}
					else
					{
						batch.draw(barboss252,b.x + 80,b.y + 250);
					}
				}
				else
				{
					b.x -= 2;
					if(b.hpboss == 100)
					{
						batch.draw(barboss1003,b.x + 80,b.y + 250);
					}
					else if(b.hpboss == 75)
					{
						batch.draw(barboss753,b.x + 80,b.y + 250);
					}
					else if(b.hpboss == 50)
					{
						batch.draw(barboss503,b.x + 80,b.y + 250);
					}
					else
					{
						batch.draw(barboss253,b.x + 80,b.y + 250);
					}
					
				}
				
			}
			
			
			for(Boss a:bossy2)
			{
				
				if(a.x - (x + 175) < -50)  //event crash
				{
					if(y - (a.y + 300) < -50)  
					{
						blood = 0;
						bossy.remove(a);
						scene = 4;
					}
				}
			}
			bossy2.clear();
			bossy2.addAll(bossy);
			
			
			// ================================ blood cha ====================================//
			if(blood == 100)
			{
				batch.draw(hp100,20,460);
			}
			else if(blood == 80)
			{
				batch.draw(hp80,20,460);
			}
			else if(blood == 60)
			{
				batch.draw(hp60,20,460);
			}
			else if(blood == 40)
			{
				batch.draw(hp40,20,460);
			}
			else if(blood == 20)
			{
				batch.draw(hp20,20,460);
			}
			else
			{
				scene = 4;
			}
			// ==============================================================//
			
			// ========================= item ===============================//
			if(run % 200 == 0) 
			{
				if(tem.size() < 3)
				{
				tem.add(new Item(random.nextInt(2)));
				
				}	
			}
			if(tem2.size() > 0)
			{	System.out.println("q");
				if(tem2.get(0) != null)
				{
					batch.draw(tem2.get(0).getPic(),tem2.get(0).x,tem2.get(0).y);
					
				}
			}
			if(tem2.size() > 1)
				if(tem2.get(1) != null)
				{
					batch.draw(tem2.get(1).getPic(),tem2.get(1).x + 100,tem2.get(1).y );
					
				}
			if(tem2.size() > 2)
				if(tem2.get(2) != null)
				{
					batch.draw(tem2.get(2).getPic(),tem2.get(2).x + 200,tem2.get(2).y);
					
				}
			tem2.clear();
			tem2.addAll(tem);
			//================================================================//
			System.out.print(blood);
			System.out.print(Random_monster.size());
			System.out.println(Random_monster2.size());
			System.out.println(tem2.size());
			System.out.println(tem2);
			batch.draw(Cha.getPic(state) ,x ,y );
			
			//batch.draw(itemeiei,510,460);
		}
		
		if(scene == 4)
		{
				Bb = true;
				batch.draw(over.get((run/10)%6),0,0);
				if(Gdx.input.isTouched())
				{
					if(Gdx.input.getX() > 400 && Gdx.input.getX() < 500 )
					{
						if(Gdx.input.getY() > 350 && Gdx.input.getY() < 400)
						{
							 dan = 0;
							 state = 0;
							blood = 100;
							scene = 0;
							reload = 0;
							chacreate = 1 ;
							blood = 100;
							Bb = true;
							x = 0;
							y = 0;
							run = 0;
							
							
							delay = 0;
							
							Randomthing.clear();
							Randomthing2.clear();
							Random_monster.clear();
							Random_monster2.clear();
							power1.clear();
							power2.clear();
							tem2.clear();
							tem.clear();
						}
					}
					
					if(Gdx.input.getX() > 650 && Gdx.input.getX() < 720 )
					{
						if(Gdx.input.getY() > 350 && Gdx.input.getY() < 400)
						{
							Gdx.app.exit();
						}
					}
				}
			
		}
		if(scene == 5)
		{
			batch.draw(winner.get((run/10)%5),0,0);
		}
		batch.end();
		
	}

	@Override
	public void resize(int w, int h) {
		
		
	}

	@Override
	public void resume() {
		
		
	}
	
	
	
}
