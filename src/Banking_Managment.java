public class Banking_Managment {

    public static void main(String[] args) {
        Account ac1 = new Account(123451,"ash kutchem", 152222);
        System.out.println("before ->"+ac1.getBalance());
        ac1.deposit(20000);
        System.out.println("after->"+ac1.getBalance());
    }
}
