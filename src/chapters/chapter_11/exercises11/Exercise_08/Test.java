package chapters.chapter_11.exercises11.Exercise_08;

public class Test {
    public static void main(String[] args) {
        Account myAccount = new Account(4232,"safa",50000);

        myAccount.setAnnualInterestRate(1.5);

        myAccount.deposit(30);
        myAccount.deposit(40);
        myAccount.deposit(50);


        myAccount.withdraw(5);
        myAccount.withdraw(4);
        myAccount.withdraw(2);

        System.out.println("Name: " + myAccount.getName());
        System.out.println("Annual interest rate: " + myAccount.getAnnualInterestRate());
        System.out.println("Balance: " + myAccount.getBalance());

        for (int i = 0; i <myAccount.getTransactions().size() ; i++) {
            System.out.println("Date: " +
                    (myAccount.getTransactions()).get(i).getDate());
            System.out.println("Type: " +
                    (myAccount.getTransactions()).get(i).getType());
            System.out.println("Amount: " +
                    (myAccount.getTransactions()).get(i).getAmount());
            System.out.println("Balance: " +
                    (myAccount.getTransactions()).get(i).getBalance());

        }









    }

}
