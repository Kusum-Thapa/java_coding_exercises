package com.techreturners.kataexe;
import static org.junit.Assert.assertEquals;
import org.junit.Ignore;
import org.junit.Test;

import jdk.jfr.Timestamp;

public class KataExeTest {

    @Test
    public void checkisRemovedVowel(){
        KataExe kataExe = new KataExe();
        assertEquals("Ths wbst s fr lsrs LL!",kataExe.disemvowel("This website is for losers LOL!") );
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", kataExe.disemvowel(
            "No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals( "Wht r y,  cmmnst?", kataExe.disemvowel("What are you, a communist?"));
    }
    
    
}

