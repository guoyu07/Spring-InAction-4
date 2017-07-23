package com.mike.spring4.ioc;

import java.io.PrintStream;

/**
 * Created by xuguirong on 23/07/2017.
 * 杀死龙探险
 */
public class SlayDragonQuset implements Quest {

    private PrintStream stream;

    public SlayDragonQuset(PrintStream stream){
        this.stream = stream;
    }

    @Override
    public void embark() {

        stream.println("Embarking on quest to slay the dragon!");

    }
}
