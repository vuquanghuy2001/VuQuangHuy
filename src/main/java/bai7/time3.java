package bai7;

public class time3 {
    private int second, minute, hour;

    public void setSecond(int second) {

        if (second >= 0 && second < 59) {
            this.second = second;
        } else {
          throw new IllegalArgumentException("Invaild second!");
        }
    }

    public void setMinute(int minute) {

        if (minute >= 0 && minute < 59) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Invaild minute!");
        }
    }

    public void setHour(int hour) {

        if (hour >= 0 && hour < 23) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Invaild hour!");
        }
    }

    public void setTime3  (int second,int minute,int hour){
        this.setSecond((second));
        this.setMinute(minute);
        this.setHour(hour);
    }

    public time3(int second,int minute,int hour) {
        this.setTime3(second,minute,hour);
    }

    public time3(){
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
    public time3 nextSecond(){
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
