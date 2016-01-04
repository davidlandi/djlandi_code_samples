package mmoFramework;

import java.util.Observable;
import java.util.Observer;

public class DataServer extends Observable {
	private Hero dbrHero;
	private Villain dbrVillain;
	private Boss dbrBoss;
	private Bot dbrBot;
	private FirstEnv dbrFirstEnv;
	
	public DataServer(){}
	
	public Hero getDbrHero(){return this.dbrHero;}
	public Villain getDbrVillain(){return this.dbrVillain;}
	public Boss getDbrBoss(){return this.dbrBoss;}
	public Bot getDbrBot(){return this.dbrBot;}
	public FirstEnv getDbrFirstEnv(){return this.dbrFirstEnv;}
	
	public void statsChanged(){
		setChanged();
		notifyObservers();
	}
	
	public void setDataBaseRecords(Hero dbrHero, Villain dbrVillain, Boss dbrBoss, 
			Bot dbrBot, FirstEnv dbrFirstEnv){
		this.dbrHero = dbrHero;
		this.dbrVillain = dbrVillain;
		this.dbrBoss = dbrBoss;
		this.dbrBot = dbrBot;
		this.dbrFirstEnv = dbrFirstEnv;
		statsChanged();
	}
}
