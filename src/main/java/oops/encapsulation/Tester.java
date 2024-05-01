package oops.encapsulation;

public class Tester {
    public static void main(String[] args) {
        //creating instance of Account class
        Account acc=new Account();
        //setting values through setter methods
        acc.setAcc_no(7310805450L);
        acc.setName("MD FAIZ");
        acc.setEmail("mdfaiz689@gmail.com");
        acc.setAmount(100000f);
        //getting values through getter methods
        System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
    }
}
