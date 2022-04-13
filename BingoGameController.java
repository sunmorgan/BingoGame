import java.util.*;

public class BingoGameController {
	private Stack<Integer> cards = new Stack<>();
	
	public void addCardNumbers(int n)
	{
		cards.push(n);
	}
	
	public void checkBoard(int n)
	{
		cards.contains(n);
	}
}
