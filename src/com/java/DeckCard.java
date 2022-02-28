package com.java;

import java.util.Random;

public class DeckCard {
	int suit;
	int rank;
	int playerNum;
	int[][] cards = new int[4][13]; // 2d array to store player's Suit rank

	void OneCardDistribute() {
		Random random = new Random(); // Random Function

		int suit = random.nextInt(4);
		int rank = random.nextInt(13);

		if (cards[suit][rank] != 0) {
			OneCardDistribute();
		} else {
			cards[suit][rank] = playerNum;
		}
	}

	void distributeAllCards(int playerNumber) {
		for (int i = 0; i <= 9; i++) {
			OneCardDistribute();

		}

	}

	String getRank(int rank) {
		switch (rank) {
		case 1:
			return "2";
		case 2:
			return "3";
		case 3:
			return "4";
		case 4:
			return "5";
		case 5:
			return "6";
		case 6:
			return "7";
		case 7:
			return "8";
		case 8:
			return "9";
		case 9:
			return "10";
		case 10:
			return "Jack";
		case 11:
			return "Queen";
		case 12:
			return "King";
		case 13:
			return "Ace";
		default:
			return "";
		}
	}

	String getSuit(int suit) {
		switch (suit) {
		case 1:
			return "Clubs";
		case 2:
			return "Diamonds";
		case 3:
			return "Hearts";
		case 4:
			return "Spades";
		default:
			return "";
		}
	}

	void showCards() {
		for (suit = 0; suit < 4; suit++) {
			for (rank = 0; rank < 13; rank++) {
				if (cards[suit][rank] == playerNum) {
					System.out.println(getRank(rank) + " " + getSuit(suit) + "\t");
				}
			}
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DeckCard dc = new DeckCard();
		for (int playerNum = 1; playerNum <= 4; playerNum++) {
			dc.distributeAllCards(playerNum);
			System.out.println("Player " + playerNum + "'s card :-");
			dc.showCards();
		}
	}

}
