package mmoFramework;

import java.util.Observable;
import java.util.Observer;

public class Villain implements Observer, CharacterElement {
	Observable observable;
	private String desc;
	private float health;
	private Hero dbrHero;
	private Villain dbrVillain;
	private Boss dbrBoss;
	private Bot dbrBot;
	private FirstEnv dbrFirstEnv;
	
	public Villain(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public float getHealth(){return this.health;}
	public void setHealth(float arg){this.health = arg;}
	public String getDesc(){return this.desc;}
	public void setDesc(String arg){this.desc = arg;}
	
	public void update(Observable obs, Object arg){
		if(obs instanceof DataServer){
			DataServer ds = (DataServer)obs;
			this.dbrHero = ds.getDbrHero();
			this.dbrVillain = ds.getDbrVillain();
			this.dbrBoss = ds.getDbrBoss();
			this.dbrBot = ds.getDbrBot();
			this.dbrFirstEnv = ds.getDbrFirstEnv();
			
		}
	}
}
