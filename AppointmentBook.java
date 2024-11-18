public class AppointmentBook {
    private boolean[][] schedule;

    public AppointmentBook(boolean[][] schedule) 
    {
        this.schedule = schedule;
    }
    /**
     * Returns true if minute in period is available for an appointment and returns
     * false otherwise
     * Preconditions: 1 <= period <= 8; 0 <= minute <= 59
     */
    private boolean isMinuteFree(int period, int minute) 
    {
        return schedule[period - 1][minute];
    }


    private void reserveBlock(int period, int startMinute, int duration) {
    }

    public int findFreeBlock(int period, int duration) {
        int block = 0;
        for (int i = 0; i < 60; i++)
        if (isMinuteFree(period, i))
        {
            block++;
            if (block == duration) return i - duration + i;
            else block = 0;
        }
        return -1;
    }

    public boolean makeAppointment(int startPeriod, int endPeriod, int duration){
        return false;
    }
    public void printPeriod(int period) 
    {
        for(int i = 0; i < schedule[period - 1].length; i++)
        System.out.println(i + " " + schedule[period - 1][i]);
    }

}
