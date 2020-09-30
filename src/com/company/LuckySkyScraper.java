package com.company;

public class LuckySkyScraper {
    static private boolean showTiming = true;

    static public int toRealFloor(int fakeFloorGoal){
        var startTime = System.nanoTime();
        var fakeFloor = 1;
        for(var realFloor = 1; realFloor <= fakeFloorGoal; realFloor++){
            if(fakeFloorGoal == fakeFloor) {
                var endTime = System.nanoTime();
                var timeTaken = endTime - startTime;
                if(showTiming){
                    System.out.println("toRealFloor took (ns): " + timeTaken);
                }
                return realFloor; // this ends the loop and the method
            }
            do {
                fakeFloor++;
            } while(fakeFloor % 10 == 4 || fakeFloor % 100 == 13);
        }
        return -1; // could not find real floor number
    }

    static public int toFakeFloor(int realFloorGoal){
        var startTime = System.nanoTime();
        var fakeFloor = 1;
        for(var realFloor = 1; realFloor < realFloorGoal; realFloor++){
            do {
                fakeFloor++;
            } while(fakeFloor % 10 == 4 || fakeFloor % 100 == 13);
        }
        var endTime = System.nanoTime();
        var timeTaken = endTime - startTime;
        if(showTiming) {
            System.out.println("toFakeFloor took (ns): " + timeTaken);
        }
        return fakeFloor;
    }


}
