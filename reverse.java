import javax.sound.sampled.SourceDataLine;
import javax.sql.rowset.spi.SyncResolver;

class rev{
    public static void main(String[] agrs){
        int num=1234;
        int rever=0;
        while(num>0)
           {
            int rem=num%10;
            rever=rever*10+rem;
            num=num/10;
           }
           System.out.println(rever);
    }
   
}