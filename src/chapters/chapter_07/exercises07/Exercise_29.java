package chapters.chapter_07.exercises07;

public class Exercise_29 {
    public static void main(String[] args) {
        int[] deck = getDeck();
        shuffle(deck);
        int[] picks = pickFourCardFromDeck(deck);
        int sum = sumCard(picks);


        System.out.println("Sum of cards is " + sum);

        if (sum == 24) {
            display(picks);
        }
    }

    public static int[] getDeck() {
        int[] deck = new int[52];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        return deck;
    }

    public static void shuffle(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
    }

    public static int[] pickFourCardFromDeck(int[] deck) {
        int[] result = new int[4];
        for (int i = 0; i < result.length; i++) {
            result[i] = deck[(int) (Math.random() * deck.length)];
        }
        return result;
    }

    public static int sumCard(int[] picks) {
        int sum = 0;
        for (int i = 0; i < picks.length; i++) {
            sum += picks[i] % 13 + 1;
        }
        return sum;
    }

    public static void display(int[] picks) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (int i = 0; i < picks.length; i++) {
            System.out.println(ranks[picks[i] % 13] + " of " + suits[picks[i] / 13]);
        }
    }


}
