import java.util.*;
class TrafficLight
{
    public static void animate()throws InterruptedException
    {
        Scanner sc = new Scanner(System.in);
        int i=0,j,k=0,m=1;
        String s1="      _______      ",s2="  ___/_______\\___ ",s3=" |___|_______|____|",s4="     O       O      ";
        String road1="====================================================================================================";
        String tlight="========================================================================[o]\n\t\t\t\t\t\t\t\t\t[0]\n\t\t\t\t\t\t\t\t\t[O]";
        while(m<=3)
        {
            k=0;
            s1="      _______      ";
            s2="  ___/_______\\___ ";
            s3=" |___|_______|____|";
            s4="     O       O      ";
            i=0;
            for(j=1;j<=66;j++)
            {
                if(j==55)
                {
                    tlight=tlight.replace("o","R");
                    tlight=tlight.replace('G','O');
                    tlight=tlight.replace('Y','0');
                }
                if(j==56)
                {Thread.sleep(5000);}
                else if(j>=40&&j<55)
                {
                    Thread.sleep(50+k);
                    System.out.println("\f");
                    System.out.println(tlight);
                    System.out.println(s1+"\n"+s2+"\n"+s3+"\n"+s4);
                    System.out.println(road1);
                    s1=" ".concat(s1);
                    s2=" ".concat(s2);
                    s3=" ".concat(s3);
                    s4=" ".concat(s4);
                    i++;k+=20;
                    tlight=tlight.replace("R","o");
                    tlight=tlight.replace('G','O');
                    tlight=tlight.replace('0','Y');

                    if(i==road1.length()-9)
                    {
                        s1="      _______      ";
                        s2="  ___/_______\\___ ";
                        s3=" |___|_______|____|";
                        s4="     O       O      ";
                        i=0;
                    }
                }
                else
                {
                    Thread.sleep(50);
                    System.out.println("\f");
                    System.out.println(tlight);
                    System.out.println(s1+"\n"+s2+"\n"+s3+"\n"+s4);
                    System.out.println(road1);
                    s1=" ".concat(s1);
                    s2=" ".concat(s2);
                    s3=" ".concat(s3);
                    s4=" ".concat(s4);
                    i++;
                    tlight=tlight.replace("R","o");
                    tlight=tlight.replace('O','G');
                    tlight=tlight.replace('Y','0');
                    if(i==road1.length()-9)
                    {
                        s1="      _______      ";
                        s2="  ___/_______\\___ ";
                        s3=" |___|_______|____|";
                        s4="     O       O      ";
                        i=0;
                    }
                }
            }
            m++;
            if(m==4)
            {System.out.println("\fPress any key to exit");
                if(sc.next()!="$")
                {break;
                }}

        }
    }
}