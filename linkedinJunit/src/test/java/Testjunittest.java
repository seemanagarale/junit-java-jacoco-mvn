import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Testjunittest {

//    @Test
//    public void Testhello(){
//        Testjunit t=new Testjunit();
//        assertEquals("hello world",t.Test());
//    }

    @Test
    public void Testint(){
        Testjunit t1=new Testjunit();
        assertEquals(10, t1.Test1());
    }

    @Test
    public void testbool(){
        Testjunit t2=new Testjunit();
        assertEquals(true,t2.Test2());
    }
}
