public class Main {
    public static void main (String[] args)
    {
        boolean[][] schedule = new boolean[8][60];
        AppointmentBook a = new AppointmentBook(schedule);
        for (int i = 10; i < 15; i++) schedule [1][i] = true;
        for (int i = 30; i < 45; i++) schedule [2][i] = true;
        for (int i = 50; i < 60; i++) schedule [2][i] = true;
        for (int i = 50; i < 60; i++) schedule [3][i] = true;
        for (int i = 44; i < 60; i++) schedule [3][i] = true;
        //a.printPeriod(2);
        //a.findFreeBlock(2, 13);
        System.out.println(a.findFreeBlock(2, 15));
        
    }
}