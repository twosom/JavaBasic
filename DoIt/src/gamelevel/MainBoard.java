package gamelevel;

public class MainBoard
{
	public static void main(String [] args)
	{
		Player player = new Player();
		player.play(1);
		
		
		AdvancedLevel level = new AdvancedLevel();
		
		player.upgradeLevel(level);
		player.play(2);
		
		SuperLevel sLevel= new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}
}
