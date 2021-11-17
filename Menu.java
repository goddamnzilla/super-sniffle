import java.io.*;
class Menu
{
public static void main()throws InterruptedException, IOException
{
int choice; 
BufferedReader ary = new BufferedReader(new InputStreamReader(System.in));
while(true)
{
try{
System.out.println("\fWelcome to Animation Arena!\nEnter\n1.Traffic Light\n2.School Bus\n3.Instructions\n4.Exit");
choice = Integer.parseInt(ary.readLine());
}
catch(NumberFormatException nfe)
{choice = 0;}
if(choice==1)
{
TrafficLight.animate();
}
else if(choice==4)
{
exit();
break;
}
else if(choice==2)
{SchoolBus.animation();}
else if(choice==3)
{Instructions.main();
}
else
{System.out.println("\fPlease enter 1, 2, 3 or 4 only!");
Thread.sleep(3000);
}
}
}
public static void exit()
{
System.out.println("\fNow Exitting.");
}
}