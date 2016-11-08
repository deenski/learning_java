public class TestClock {
    public static void main(String[] args) {
        Clock myClock  = new Clock();
        myClock.setTime(3,42,15);
        myClock.printTime();
        myClock.setSecond(30);
        myClock.printTime();
        myClock.setHour(4);
        System.out.println("Hour = " + myClock.getHour());
        
        myClock.setHour(-123);
        System.out.println("Hour = " + myClock.getHour());
        
        myClock.setMinute(55);
        System.out.println("Minute = " + myClock.getMinute());
        
        myClock.setMinute(-234234);
        System.out.println("Minute = " + myClock.getMinute());
        
        myClock.setSecond(18);
        System.out.println("Second = " + myClock.getSecond());
        
        myClock.setSecond(-3453);
        System.out.println("Second = " + myClock.getSecond());
        
        myClock.setTime(-235, 434, 35);
        myClock.printTime();
        
        myClock.setTime(12, 24, 58);
        myClock.printTime();
        
        Clock c2 = new Clock();
        System.out.print("Clock 2 = ");
        c2.printTime();
        
        Clock c3 = new Clock(8, 34, 42);
        System.out.print("Clock 3 = ");
        c3.printTime();
        
        System.out.println("Time of myClock = " + myClock);
        System.out.println("Time of c2 = " + c2);
        System.out.println("Time of c3 = " + c3);
        
        Clock c5 = new Clock(7, 30, 12);
        System.out.println(c5);
        
        Clock c6 = new Clock(c5);
        c6.setSecond(13);
        System.out.println(c6);
        System.out.println("Clock 5 = " + c5);
        c5.incrementHour();
        System.out.println(c5);
    }
    
}