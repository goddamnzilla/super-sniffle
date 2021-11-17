import java.util.*;
class SchoolBus
{
static void animation()throws InterruptedException
{
int i=0,tot=0,j=0;boolean flag=true,flag1=false;
Scanner sc=new Scanner(System.in);
String b1="________________________",
       b2="|_f_|_e_|_d_|_c_|_b_|_A_|__",
       b3="|__________________________|",
       b4="   O                  0",
       sc1="__________H_F_S___________",
       sc2="|                        |",
       sc3="| ____              ____ |",
       sc4="| |__|              |__| |",
       sc5="|         _____          |",
       sc6="|_________|___|__________|",
       h1=" __________________",
       h2="/__________________\\",
       h3="|  ___        ___  |",
       h4="|  |_|        |_|  |",
       h5="|       ____       |",
       h6="|_______|__|_______|";
       
       String road1="______________________________________________________________________________________________________________________________________________________",
       road2="=================================================================================================================================================",
       road3="______________________________________________________________________________________________________________________________________________________________";
       while(tot<6)
       {
if(flag)           
{
Thread.sleep(50);
System.out.println("\f");
System.out.println(sc1+"\n"+sc2+"\n"+sc3+"\n"+sc4+"\n"+sc5+"\n"+sc6+road1);
System.out.println(b1+"\n"+b2+"\n"+b3+"\n"+b4);
System.out.println(road2);
System.out.println("\n\n\n\n\n"+road1);
b1=" ".concat(b1);
b2=" ".concat(b2);
b3=" ".concat(b3);
b4=" ".concat(b4);
i++;
if(i==road2.length()-9)
{
       b1="________________________";
       b2="|_f_|_e_|_d_|_c_|_b_|_A_|__";
       b3="|__________________________|";
       b4="  O                  O";
       flag=false;
i=0;
}}
else
{
Thread.sleep(50);
System.out.println("\f");
System.out.println(h1+"\n"+h2+"\n"+h3+"\n"+h4+"\n"+h5+"\n"+h6+road1);
System.out.println(b1+"\n"+b2+"\n"+b3+"\n"+b4);
System.out.println(road2);
System.out.println("\n\n\n\n\n"+road1);
b1=" ".concat(b1);
b2=" ".concat(b2);
b3=" ".concat(b3);
b4=" ".concat(b4);
i++;
if(i==road2.length()-9)
{
       b1="________________________";
       b2="|_f_|_e_|_d_|_c_|_b_|_A_|__";
       b3="|__________________________|";
       b4="  O                  O";
       i=0;flag1=true;
       
j=j+16;
if(tot==0)
{if(flag1)
{
h1="\t\t".concat(h1);
h2="\t\t".concat(h2);
h3="\t\t".concat(h3);
h4="\t\t".concat(h4);
h5="\t\t".concat(h5);
h6="________________".concat(h6);

}
}
     else if(tot==1)
{
b2=b2.replace('f','_');
if(flag1)
{
h1="\t\t".concat(h1);
h2="\t\t".concat(h2);
h3="\t\t".concat(h3);
h4="\t\t".concat(h4);
h5="\t\t".concat(h5);
h6="________________".concat(h6);

}

}
else if(tot==2)
{
b2=b2.replace('f','_');
b2=b2.replace('e','_');
if(flag1)
{
h1="\t\t".concat(h1);
h2="\t\t".concat(h2);
h3="\t\t".concat(h3);
h4="\t\t".concat(h4);
h5="\t\t".concat(h5);
h6="________________".concat(h6);

}
}
else if(tot==3)
{
b2=b2.replace('f','_');
b2=b2.replace('e','_');
b2=b2.replace('d','_');
if(flag1)
{
h1="\t\t".concat(h1);
h2="\t\t".concat(h2);
h3="\t\t".concat(h3);
h4="\t\t".concat(h4);
h5="\t\t".concat(h5);
h6="________________".concat(h6);

}
}
else if(tot==4)
{
b2=b2.replace('f','_');
b2=b2.replace('e','_');
b2=b2.replace('d','_');
b2=b2.replace('c','_');
if(flag1)
{
h1="\t\t".concat(h1);
h2="\t\t".concat(h2);
h3="\t\t".concat(h3);
h4="\t\t".concat(h4);
h5="\t\t".concat(h5);
h6="________________".concat(h6);

}}
else if(tot==4)
{
b2=b2.replace('f','_');
b2=b2.replace('e','_');
b2=b2.replace('d','_');
b2=b2.replace('c','_');
b2=b2.replace('b','_');
if(flag1)
{
h1="\t\t".concat(h1);
h2="\t\t".concat(h2);
h3="\t\t".concat(h3);
h4="\t\t".concat(h4);
h5="\t\t".concat(h5);
h6="________________".concat(h6);

}
}}
   
if(i==j)
{
if(tot==0)
{
b2=b2.replace('f','_');
tot++;
Thread.sleep(4000);
}
else if(tot==1)
{
b2=b2.replace('f','_');
b2=b2.replace('e','_');
tot++;
Thread.sleep(4000);
}
else if(tot==2)
{
b2=b2.replace('f','_');
b2=b2.replace('e','_');
b2=b2.replace('d','_');
tot++;
Thread.sleep(4000);}
else if(tot==3)
{
b2=b2.replace('f','_');
b2=b2.replace('e','_');
b2=b2.replace('d','_');
b2=b2.replace('c','_');
tot++;
Thread.sleep(4000);
}
else if(tot==4)
{
b2=b2.replace('f','_');
b2=b2.replace('e','_');
b2=b2.replace('d','_');
b2=b2.replace('c','_');
b2=b2.replace('b','_');
tot++;
Thread.sleep(4000);
}
}

if(tot==5)
{
System.out.println("\fPress any key to exit");
if(sc.next()!="")
break;}
}
}
}
}
