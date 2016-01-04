package mmoFramework;

public interface Observer {
	public void update(Hero dbrHero, Villain dbrVillain, Boss dbrBoss, 
			Bot dbrBot, FirstEnv dbrFirstEnv);
}
