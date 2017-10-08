package dicegame;

public class DiceRoller {
	//will return an integer from 1 to diceSize
	public int rollDice(int diceSize)
	{
		return (int) (Math.random() * diceSize) + 1;
	}
}
