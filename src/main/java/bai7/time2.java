package bai7;

public class time2 {
    private int second, minute, hour;

    public void setSecond(int second) {

        if (second >= 0 && second < 59) {
            this.second = second;
        } else {
            this.second = 0;
            System.out.println("error:invaild second");
        }
    }

    public void setMinute(int minute) {

        if (minute >= 0 && minute < 59) {
            this.minute = minute;
        } else {
            this.minute = 0;
            System.out.println("error:invaild minute");
        }
    }

    public void setHour(int hour) {

        if (hour >= 0 && hour < 23) {
            this.hour = hour;
        } else {
            this.hour = 0;
            System.out.println("error:invaild hour");
        }
    }

    public void setTime2  (int second,int minute,int hour){
        this.setSecond((second));
        this.setMinute(minute);
        this.setHour(hour);
    }

    public time2(int second,int minute,int hour) {
        this.setTime2(second,minute,hour);
    }

    public time2(){
        this.second=0;
        this.minute=0;
        this.hour=0;
    }

    public int getSecond() {
        return this.second;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getHour() {
        return this.hour;
    }

    public String toString(){
        return String.format("%2d:%2d:%2d",hour,minute,second);
    }
    public time2 nextSecond(){
        ++second;
        if (second==60){
            second=0;
            ++minute;
            if (minute==60){
                minute=0;
                ++hour;
                if (hour==24){
                    hour=0;
                }
            }
        }
        return this;
    }
}

