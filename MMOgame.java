package mmoFramework;

public class MMOgame {
	public static void main(String[] args){
		DataServer ds = new DataServer();
		Hero hero = new Hero(ds);
		Villain villain = new Villain(ds);
		Bot bot = new Bot(ds);
		Boss boss = new Boss(ds);
		FirstEnv firstEnv = new FirstEnv(ds);
		
		System.out.println("Round 1");
		hero.setHealth(100);
		hero.setDesc("Hero Health: ");
		villain.setHealth(100);
		villain.setDesc("Villain Health: ");
		bot.setHealth(100);
		bot.setDesc("Bot Health: ");
		boss.setHealth(100);
		boss.setDesc("Boss Health: ");
		firstEnv.setStructureStrength(100);
		firstEnv.setDesc("Enviroment Strength: ");
		ds.setDataBaseRecords(hero, villain, boss, bot, firstEnv);
		displayTurn(ds);
		
		System.out.println("\n");
		
		System.out.println("Round 2");
		hero.setHealth(85);
		villain.setHealth(15);
		bot.setHealth(20);
		boss.setHealth(75);
		firstEnv.setStructureStrength(50);
		ds.setDataBaseRecords(hero, villain, boss, bot, firstEnv);
		displayTurn(ds);
		
		System.out.println("\n");
		
		System.out.println("Round 3");
		boss.setHealth(0);
		firstEnv.setStructureStrength(5);
		ds.setDataBaseRecords(hero, villain, boss, bot, firstEnv);
		displayTurn(ds);
		
	}
	
	public static void displayTurn(DataServer dsArg){
		System.out.println(dsArg.getDbrHero().getDesc() + dsArg.getDbrHero().getHealth());
		System.out.println(dsArg.getDbrVillain().getDesc() + dsArg.getDbrVillain().getHealth());
		System.out.println(dsArg.getDbrBot().getDesc() + dsArg.getDbrBot().getHealth());
		System.out.println(dsArg.getDbrBoss().getDesc() + dsArg.getDbrBoss().getHealth());
		System.out.println(dsArg.getDbrFirstEnv().getDesc() + dsArg.getDbrFirstEnv().getStructureStrength());
	}
}
