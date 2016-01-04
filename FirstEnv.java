package mmoFramework;

import java.util.Observable;
import java.util.Observer;

public class FirstEnv implements Observer, EnviromentElement {
	Observable observable;
	private float structureStrength;
	private String desc;
	private Hero dbrHero;
	private Villain dbrVillain;
	private Boss dbrBoss;
	private Bot dbrBot;
	private FirstEnv dbrFirstEnv;
	
	public FirstEnv(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public float getStructureStrength(){return this.structureStrength;}
	public void setStructureStrength(float arg){this.structureStrength = arg;}
	public void setDesc(String arg){this.desc = arg;}
	public String getDesc(){return this.desc;}
	
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
