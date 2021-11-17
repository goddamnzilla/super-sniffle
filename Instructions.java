import java.io.*;
class Instructions
{
public static void main()throws IOException,InterruptedException
{
int ch1;String ch2="";
BufferedReader ary = new BufferedReader(new InputStreamReader(System.in));
while(true)
{
try{
System.out.println("\fIn this section, you will find information on the two animations.\n1.Traffic Light\n2.School Bus\n3.Exit to Main Menu");
ch1=Integer.parseInt(ary.readLine());
}
catch(NumberFormatException nfe)
{ch1 = 0;}
if(ch1==1)
{
System.out.println("\fThe car starts off on a road. Once the traffic light turns yellow, the speed of the car gradually decreases.\nThe car comes to a halt completely once the light turns red. After a while, when it turns green, the car zooms ahead with a much greater speed.");
ch2=ary.readLine();
if(ch2!="\t")
{}
}
else if(ch1==3)
{Menu.main();
break;}
else if(ch1==2)
{
System.out.println("\fThe schoobus is supposed to drop the students (f,e,d,c and b) to their respective homes. A is the bus driver.\nThe animation starts off as the bus leaves from Hiranandani Foundation School. Once the bus reaches the end of the screen,\nit reaches the neighbourhood of the students and drops them at their houses.");
ch2=ary.readLine();
if(ch2!="\t")
{}
}
else
{System.out.println("\fPlease enter either 1, 2 or 3 only!");
Thread.sleep(3000);
}
}
}
}