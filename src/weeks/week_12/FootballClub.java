package week_12;

public class FootballClub {
    private String clubName;
    private double ticketFee;
    private long balance;
    private String stadium;
    private int stadiumCapacity;
    private Player[] team;

    public FootballClub() {
        this("default",0,0,"default stadium",0,new Player[25]);
    }

    public FootballClub(String clubName, double ticketFee, long balance, String stadium, int stadiumCapacity) {
        this(clubName,ticketFee,balance,stadium,stadiumCapacity, new Player[25]);
    }

    public FootballClub(String clubName, String stadium){
        this(clubName,0,0,stadium,0,new Player[25]);



    }

    public FootballClub(String clubName, double ticketFee, long balance, String stadium, int stadiumCapacity, Player[] players) {
        this.clubName = clubName;
        this.ticketFee = ticketFee;
        this.balance = balance;
        this.stadium = stadium;
        this.stadiumCapacity = stadiumCapacity;
        this.team = players;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public double getTicketFee() {
        return ticketFee;
    }

    public void setTicketFee(double ticketFee) {
        this.ticketFee = ticketFee;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public int getStadiumCapacity() {
        return stadiumCapacity;
    }

    public void setStadiumCapacity(int stadiumCapacity) {
        this.stadiumCapacity = stadiumCapacity;
    }

    public Player[] getTeam() {
        return team;
    }

    public void setTeam(Player[] team) {
        this.team = team;
    }

    public void sellTicket(int soldTicketNumber){
        soldTicketNumber = soldTicketNumber > this.stadiumCapacity ? this.stadiumCapacity : soldTicketNumber;
        this.balance += (int) (soldTicketNumber * this.ticketFee);
    }

    public void sellPlayer(Player p){
        if(doPlayerExistInMyTeam(p)){
            this.balance = this.balance + p.getFee();
            removePlayer(p);
            System.out.println("You sold " + p.getName().toUpperCase());
            printBalance();
        }else{
            System.out.println(p.getName() + " does not exist in this team.");
        }
    }

    private void printBalance() {
        System.out.println("BALANCE :" + this.balance);
        System.out.println("--------");
    }

    public void buyPlayer(Player p){
        if(doWeHaveEnoughSpaceForNewPlayer()){
            if(this.balance < p.getFee()){
                System.out.println("Balace is only " + this.balance);
                System.out.println(p.getName() + " costs " + p.getFee());
                System.out.println("TOO BROKE!!! YOU CAN'T BUY");
                return;
            }
            this.balance = this.balance - p.getFee();
            System.out.println("You bought " + p.getName().toUpperCase());
            addPlayer(p);
            printBalance();
        }else{
            System.out.println("Your team is full. You can't buy a new player");
        }
    }

    private void addPlayer(Player p) {
        for (int i = 0; i < this.team.length; i++) {
            Player myPlayer = team[i];
            if(myPlayer == null){
                team[i] = p;
                break;
            }
        }
    }

    private boolean doWeHaveEnoughSpaceForNewPlayer() {
        for (int i = 0; i < this.team.length; i++) {
            Player myPlayer = team[i];
            if(myPlayer == null){
                return true;
            }
        }
        return false;
    }

    private boolean doPlayerExistInMyTeam(Player p) {
        for (int i = 0; i < this.team.length; i++) {
            Player myPlayer = team[i];
            if(myPlayer == null){
                continue;
            }
            if(myPlayer.getName().equals(p.getName())){
                return true;
            }
        }
        return false;
    }


    private void removePlayer(Player p) {
        for (int i = 0; i < this.team.length; i++) {
            Player myPlayer = team[i];
            if(myPlayer.getName().equals(p.getName())){
                team[i] = null;
                break;
            }
        }
    }
}
