import java.io.*;
class Test{
public static void main(String args[]) throws Exception{
	
     int timeToWait = 13; //second
     int endTime = 0;
     System.out.println("\n");
     String color[] = {"a","b","c","d","e","f","1","2","3","4","5","6"};
       String ar[] = {
       "kkk    kkk  hhh     hhh uuu     uuu rrrrrrrrr  rrrrrrrrr    aaaaa   mmmm    mmmm",
       "kkk kkk     hhh     hhh uuu     uuu rrr     rr rrr     rr aa     aa mm mm  mm mm",
       "kkk k       hhhhhhhhhhh uuu     uuu rrrrrrrrrr rrrrrrrrrr aaaaaaaaa mm   mm   mm",
       "kkk kkk     hhh     hhh uuu     uuu rrrrrrr    rrrrrrr    aa     aa mm        mm",
       "kkk    kkk  hhh     hhh   uuuuuuu   rrr    rr  rrr    rr  aa     aa mm        mm",
       "                                                                                ",
       "                                                                                ",
       "                                                                                ",
       "rrrrrrrrr   iiiiiiiiiii zzzzzzzzz  vvv      vvv iiiiiiiiiii",
       "rrr     rr      iii           zz    vv      vv      iii    ",
       "rrrrrrrrrr      iii         zz       vv    vv       iii    ",
       "rrrrrrr         iii       zz          vv  vv        iii    ",
       "rrr    rr   iiiiiiiiiii zzzzzzzzz       vv      iiiiiiiiiii"};
        try {
            for (int i=0; i<timeToWait ; i++) {
                Thread.sleep(1000);
                System.out.println(ar[i]);
                Runtime.getRuntime().exec("cmd /c dir /s"+"color b"+"C:\\WINDOWS\\system32");
            }


        } catch (InterruptedException ie)
        {
            Thread.currentThread().interrupt();
        }
   }
}