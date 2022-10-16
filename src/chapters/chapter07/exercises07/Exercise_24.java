package chapters.chapter07.exercises07;

public class Exercise_24 {
    public static void main(String[] args) {
        int[] deck = new int[52];
        initiliaze(deck);
        shuffle(deck);

        int[] picks = new int[4];
        int numberOfPicks = pickCards(deck, picks);

        display(picks);

        System.out.println("Number of picks:" + numberOfPicks);
    }

    public static void initiliaze(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
    }

    public static void shuffle(int[] deck) {

        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);

            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;

        }
    }

    public static int pickCards(int[] deck, int[] picks) {
        int countPicks = 0;


        while (!hasOneOfEachSuit(picks)) {
            countPicks++;

            for (int i = 0; i < 4; i++) {
                picks[i] = (int) (Math.random() * 52);
            }
        }

        return countPicks;
    }



    public static boolean hasOneOfEachSuit(int[] pick) {
        for (int i = 0; i < pick.length - 1; i++) {
            for (int j = i + 1; j < pick.length; j++) {

                int suit1 = pick[i] / 13;
                int suit2 =pick[j] / 13;

                if (suit1 == suit2) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void display(int[] pick) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (int i = 0; i < pick.length; i++) {
            int suitIndex = pick[i] / 13;
            int rankIndex = pick[i] % 13;
            System.out.println(ranks[rankIndex] + " of " + suits[suitIndex]);

        }

    }
}
