public class Clock {
    private int hour;
    private int minute;
    private int second;
    
    public Clock() {
        setTime(12, 0, 0);
    }
    
    public Clock(int h, int m, int s) {
        setTime(h, m, s);
    }
    
    public Clock(Clock other){
        setTime(other.hour, other.minute, other.second);
    }
    
    public void setTime(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    
    public void printTime() {
        System.out.println(this.hour + ":" + this.minute + ":" + this.second);
    }
    
    public void setHour(int h) {
        if (h > 0 && h < 24)
            this.hour = h;
        else
            this.hour = 0;
    }
    
    public int getHour() {
        
        return this.hour;
    }
    
    public void setMinute(int m) {
        if (m > 0 && m < 59)
            this.minute = m;
        else
            this.minute = 0;
    }
    
    public int getMinute() {
        return this.minute;
    }
    
    public void setSecond(int s) {
        if (s > 0 && s < 59)
            this.second = s;
        else
            this.second = 0;
    }
    
    public int getSecond() {
        return this.second;
    }
    
    public void incrementHour() {
        this.hour++;
        
        if (this.hour > 23)
            this.hour = 0;
        
    }
    
    public String toString() {
        String time = "";
        if (this.hour < 10)
            time = "0";
        time += this.hour + ":";
        
        if (this.minute < 10)
            time += "0";
        time += this.minute + ":";
        
        if (this.second < 10)
            time += "0";
        time += this.second;
        return time;
    }
    
}