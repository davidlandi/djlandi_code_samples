package mmoFramework;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestApp {

	@Test
	public void testGetHeroHealth() {
		DataServer ds = new DataServer();
		Hero hero = new Hero(ds);
		hero.setHealth(100);
		float act = hero.getHealth();
		float exp = 100;
		assertTrue(act == exp);
	}
	
	@Test
	public void testGetHeroHealthFalse() {
		DataServer ds = new DataServer();
		Hero hero = new Hero(ds);
		hero.setHealth(100);
		float act = hero.getHealth();
		float exp = 100;
		assertFalse(act != exp);
	}
	
	@Test
	public void testGetBotHealth() {
		DataServer ds = new DataServer();
		Bot bot = new Bot(ds);
		bot.setHealth(100);
		float act = bot.getHealth();
		float exp = 100;
		assertTrue(act == exp);
	}
	
	@Test
	public void testGetBotHealthFalse() {
		DataServer ds = new DataServer();
		Bot bot = new Bot(ds);
		bot.setHealth(100);
		float act = bot.getHealth();
		float exp = 100;
		assertFalse(act != exp);
	}
	
	@Test
	public void testGetBossHealth() {
		DataServer ds = new DataServer();
		Boss boss = new Boss(ds);
		boss.setHealth(100);
		float act = boss.getHealth();
		float exp = 100;
		assertTrue(act == exp);
	}

}
