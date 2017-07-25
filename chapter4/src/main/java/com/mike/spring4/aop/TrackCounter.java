package com.mike.spring4.aop;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xuguirong on 24/07/2017.
 */
public class TrackCounter {

    private Map<Integer,Integer> trackCounts = new HashMap();

    @Pointcut("execution(* com.mike.spring4.aop.CompactDisc.playTrack(int)) && args(trackNumber)")
    public void trackPlayed(int trackNumber){};

    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber){
        int currentCount = getPlayCount(trackNumber);
        trackCounts.put(trackNumber,currentCount+1);
    }

    public int getPlayCount(int trackNumber){
        return trackCounts.containsKey(trackNumber)?trackCounts.get(trackNumber):0;
    }
}
