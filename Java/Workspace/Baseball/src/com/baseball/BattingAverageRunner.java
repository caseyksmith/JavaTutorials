package com.baseball;

import java.util.Scanner;

public class BattingAverageRunner {

	public static void main(String[] args) {
		String player;
		long hits;
		long atBats;
		long walks;

		Scanner in = new Scanner(System.in);

		System.out.println("Who is batting? ");
		player = in.nextLine();
		System.out.println("How many hits? ");
		hits = in.nextInt();
		System.out.println("How many at bats? ");
		atBats = in.nextInt();


		// Batting Average = Hits/At-Bats (Walk is not an at-bat, Sacrifice is not an
		// at-bat)

		System.out.printf("%s - Batting Avg: %f", player, ((float) hits / atBats));

		// System.out.printf("Player: %s\nBatting Average: ", player, battingAverage);

	}

}
