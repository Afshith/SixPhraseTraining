public class Day_5_TimeDifference {
    public static void main(String[] args) {
        int hour1 = 10,hour2=7,min1=26,min2=45,sec1=56,sec2=59;
        int totalSecondsOne =  ( hour1 * 3600) + (min1 * 60) + sec1;
        int totalSecondsTwo =  ( hour2 * 3600) + (min2 * 60) + sec2;
        System.out.println(totalSecondsOne + " " + totalSecondsTwo);
        int answer;
        if(totalSecondsOne > totalSecondsTwo){
            answer = totalSecondsOne-totalSecondsTwo;
        }
        else{
            answer = totalSecondsTwo-totalSecondsOne;
        }//
        int resultHour = answer / 3600;
        int resultMinutes = (answer % 3600)/60;
        int resultSeconds = (answer / 3600)%60;
        System.out.println("Hour:" + resultHour + " Minutes:" + resultMinutes + "Seconds:" + resultSeconds);


    }
}
