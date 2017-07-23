package com.mike.spring4.ioc;

/**
 * Created by xuguirong on 23/07/2017.
 * 勇敢的骑士
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {

    }
}
