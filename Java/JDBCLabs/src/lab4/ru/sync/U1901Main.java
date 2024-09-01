package lab4.ru.sync;

public class U1901Main {

    public static void main(String[] args) {
        lab4.ru.sync.U1901Bank bankMain = new lab4.ru.sync.U1901Bank();

        lab4.ru.sync.U1901Thread threadOne = new lab4.ru.sync.U1901Thread(bankMain, 100, 2000);
        threadOne.setName("THREAD ONE");
        threadOne.setPriority(Thread.MAX_PRIORITY);
        threadOne.start();

        lab4.ru.sync.U1901Thread threadTwo = new lab4.ru.sync.U1901Thread(bankMain, 50, 300);
        threadTwo.setName("THREAD TWO");
        threadTwo.setPriority(Thread.MAX_PRIORITY);
        threadTwo.start();

        System.out.println(Thread.currentThread().getName());
    }
}
