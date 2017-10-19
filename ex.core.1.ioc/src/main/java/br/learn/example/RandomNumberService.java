package br.learn.example;

import java.util.Random;

public class RandomNumberService {

	private Random random;

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	public long getNextRandomNumber() {
		return random.nextLong();
	}
}
