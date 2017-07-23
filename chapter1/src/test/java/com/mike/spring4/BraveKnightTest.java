package com.mike.spring4;

import org.junit.Test;
import com.mike.spring4.ioc.BraveKnight;
import com.mike.spring4.ioc.Quest;

import static org.mockito.Mockito.*;


/**
 * Created by xuguirong on 23/07/2017.
 */
public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest(){
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
    }

}
