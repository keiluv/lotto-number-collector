import java.lang.*;
import java.util.*;
import java.time.*;

 
class Main{
	public static void main(String args[]){
        iNumber rich=new iNumber();
        System.out.println("      로또 당첨 번호 추천      ");
        System.out.println("===============================");
        for(int i=0;i<10;i++){
            Thread.sleep(1000);
            rich.lotto();
        }
        System.out.println("===============================");
 
	}


    public void lotto() throws Exception{
        int[] number=new int[45];
        int rnd,temp;
        LocalDateTime now=LocalDateTime.now();
        Random random=new Random((long)now.getSecond());
 
        /*
        for(int i=0;i<6;i++){
            number[i]=random.nextInt(45)+1;
            Thread.sleep(1000);
            for(int k=i;k>0;k--){
                if(number[k]==number[i])
                    number[i]=random.nextInt(45)+1;
             }
             System.out.printf("%2d",number[i]);
             System.out.print(" ");
        }
        */
        for(int i=0;i<45;i++)
            number[i]=i+1;
 
        for(int i=0;i<45;i++){
            do{
                rnd=random.nextInt(45);
 
            }while(rnd==i);
            temp=number[rnd];
            number[rnd]=number[i];
            number[i]=temp;
        }
 
        for(int i=0;i<6;i++)
            System.out.printf("%2d ",number[i]);
 
        System.out.println();
 
    }
}