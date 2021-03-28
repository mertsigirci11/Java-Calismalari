public class Main
{

    public static void main(String[] args)
    {
        Robot robot = new Robot();
        robot.work();

        Worker worker = new Worker();
        worker.eat();
        worker.work();
        worker.pay();

        OutSourceWorker outSourceWorker = new OutSourceWorker();
        outSourceWorker.work();
    }
}
