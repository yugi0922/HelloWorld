package strategy;

import java.util.Random;

public class WinningStrategy implements Strategy {

	private Random random;
	private boolean won = false;
	private Hand plavHand;

	public WinningStrategy(int seed){
		random = new Random(seed);
	}

	@Override
	public Hand nextHand() {
		if(!won){
			plavHand = Hand.getHand(random.nextInt(3));
		}
		return plavHand;
	}

	@Override
	public void study(boolean win) {
		won = win;

	}

}
