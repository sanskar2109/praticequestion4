import static java.lang.Thread.*;

class Account{
    int balance;
    public Account()
    {
        balance=10000;
    }

    public void withdraw(int val) {
            try
            {
                Thread.sleep(500);

            }
            catch (InterruptedException obj)
            {
                System.out.println(obj);
            }
            balance =balance-val;
            System.out.println(balance);

    }

}
class Mythread extends Thread
{
    Account obj;
    public Mythread(Account tobj)
    {
        obj=tobj;
    }
    public void run()
    {
        obj.withdraw(500);
    }
}
class test {
    public static void main(String[] args) {
        Account obj=new Account();
        Mythread obj1= new Mythread(obj);
        Mythread obj2=new Mythread(obj);
        obj1.start();
        obj2.start();
    }
}
