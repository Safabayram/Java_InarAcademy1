package chapters.chapter11.exercises11.Exercise_03;



public class Test  {
    public static void main(String[] args) {
        CheckingAccount myAccount = new CheckingAccount(1,5000,10);
        SavingsAccount myAccount1 = new SavingsAccount(2,6000,8);

        myAccount.withdraw(4800);
        System.out.println();
        System.out.println(myAccount.toString());
        myAccount1.withdraw(7000);
        System.out.println(myAccount1);
        System.out.println();
        myAccount.deposit(5000);
        System.out.println(myAccount);
        System.out.println();
        myAccount1.withdraw(2000);
        System.out.println(myAccount1);





    }



}
