package bai7;

public class time {
    private int second,minute,hour;
    public time(int second,int minute,int hour){
        this.second=second;
        this.minute=minute;
        this.hour=hour;
    }
    public time(){
        this.second=0;
        this.minute=0;
        this.hour=0;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String toString(){
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }

    public void settime(int second,int minute,int hour){
        this.second=second;
        this.second=second;
        this.hour=hour;
    }
    public time nextSecond(){
        ++second;
        if (second>=60){
            second=0;
            ++minute;
            if (minute>=60){
                minute=0;
                ++hour;
                if (hour>=24){
                    hour=0;
                }
            }
        }
        return  this;
    }
}
