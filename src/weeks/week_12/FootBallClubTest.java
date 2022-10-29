package week_12;

public class FootBallClubTest {
    public static void main(String[] args) {
        Player messi = new Player("Messi", 20_000_000);
        Player ronaldo = new Player("Ronaldo", 4_000_000);
        Player maguire = new Player("Maguire", 12_000);
        Player neymar = new Player("Neymar", 8_000_000);
        Player mbappe = new Player("Mbappe", 15_000_000);
        Player haaland = new Player("Haaland", 18_000_000);
        Player veli = new Player("Veli Kavlak", 100);
        Player olcay = new Player("Olcay Sahan", 50);

        FootballClub dallas_spor = new FootballClub("Dallasspor", 10, 40_000_000l, "Mavericks Stadium", 47856,new Player[5]);
        dallas_spor.buyPlayer(messi);
        dallas_spor.buyPlayer(mbappe);
        dallas_spor.buyPlayer(haaland);
        dallas_spor.buyPlayer(neymar);
        dallas_spor.buyPlayer(ronaldo);

        dallas_spor.sellPlayer(messi);

        dallas_spor.buyPlayer(olcay);
        dallas_spor.buyPlayer(veli);
        dallas_spor.buyPlayer(maguire);
        dallas_spor.buyPlayer(neymar);

        System.out.println(dallas_spor.getBalance());

    }
}
