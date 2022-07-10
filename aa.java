import java.util.*;
import java.lang.Math.*;
import java.util.Collections;
class aditya{
    public static void main(String[] args)
{       int i,b=0,a,n,sum=0,max=0,c=0,j,d,e,f,p,sum1=0,min=0,temp;
       String r;

        System.out.println("\n\n\t**************Top 100 Java Coding Questions**************************\n");
	System.out.println("\t*********************************************************************\n");
	System.out.println("1. positive or negative no.\n");
	System.out.println("2. even or odd number\n");
	System.out.println("3. sum of first N natural no.\n");
	System.out.println("4. sum of numbers in a given range\n");
	System.out.println("5. gretest in n numbers\n");
	System.out.println("6. leap year or not\n");
	System.out.println("7. prime number\n");
	System.out.println("8. prime no. with a given range\n");
	System.out.println("9. sum of digit of a number\n");
	System.out.println("10. reverse of a number\n");
	System.out.println("11. palindrome number\n");
	System.out.println("12. armstrong number\n");
	System.out.println("13. armstrong number in a given range\n");
	System.out.println("14. fibonacci series upto nth term\n");
	System.out.println("15. factorial of a number\n");
	System.out.println("16. power of a number\n");
	System.out.println("17. factor of a number\n");
	System.out.println("18. strong number\n");
	System.out.println("19. perfect number\n");
	System.out.println("20. automorphic number\n");
	System.out.println("21. harshad number\n");
	System.out.println("22. abundant number\n");
	System.out.println("23. friendly pair\n");
	System.out.println("24. HCF\n");
	System.out.println("25. LCM\n");
	System.out.println("26. greatest common divisor\n");
	System.out.println("27. binary to decimal conversion\n");
	System.out.println("28. decimal to binary conversion\n");
	System.out.println("29. decimal to octal conversion\n");
	System.out.println("30. octal to binary conversion\n");
	System.out.println("31. octal to decimal conversion\n");
	System.out.println("32. quadrents in which a given coordinate lies\n");
	System.out.println("33. permutation in which n people can occupy r seats in a classroom\n");
	System.out.println("34. maximum number of handshakes\n");
	System.out.println("35. addition of two fractions\n");
	System.out.println("36. replace all 0's with 1 in a given integer\n");
	System.out.println("37.** can a number be expressed as a sum of two prime numbers\n");
	System.out.println("38.** count possible decoding of a given digit sequence\n");
	System.out.println("39. check whether a charecter is vowel or consonant\n");
	System.out.println("40. check whether a charecter is alphabet or not\n");
	System.out.println("41. calculate the area of circle\n");
	System.out.println("42. find the ASCII value of charecter\n");
	System.out.println("43. find the prime no. between 1 to 100\n");
	System.out.println("44. calculate the number of digit in an integer\n");
	System.out.println("45.** convert digit/number into word\n");
	System.out.println("46. counting number of days in a given month of a year\n");
	System.out.println("47. find number of time x digit occurs in a given input\n");
	System.out.println("48. finding number of integers which has exactly x divisors\n");
	System.out.println("49. finding root of a quadretic equarion\n");
	System.out.println("50. find smallest element in the array\n");
	System.out.println("51. find second smallest element in the array\n");
	System.out.println("52. find largest element in an array\n");
	System.out.println("53. find smallest and largest element in an array\n");
	System.out.println("54. calculate the sum of elemnts in an array\n");
	System.out.println("55. reverse an array\n");
	System.out.println("56. sort first half in ascending order and second half in descending order\n");
	System.out.println("57. sort the elements of an array\n");
	System.out.println("58. finding the frequency of element in an array\n");
	System.out.println("59. finding the longest palindrome in an array\n");
	System.out.println("60. counting distinct element in an array\n");
	System.out.println("61. finding repeating element in an array\n");
	System.out.println("62. find non repeating element in an array\n");
	System.out.println("63. remove duplicate element from an array \n");
	System.out.println("64. finding minimum scaler product of two vectors\n");
	System.out.println("65. finding maximum scaler product of two vectors in an array\n ");
	System.out.println("66. counting the no. of even an odd element in an array\n");
	System.out.println("67. finding all symmetric pairs in an array \n");
	System.out.println("68. find maximum product sub-array in a give array\n");
	System.out.println("69. find array is disjoint or not\n");
	System.out.println("70. determine array is subset of another array or not \n");
	System.out.println("71. determine can all numbers of an array be made equal\n");
	System.out.println("72. finding minimum sum of absolute difference of given array\n");
	System.out.println("73. sorting element of an array by frequency\n");
	System.out.println("74. sort an array according to the order defined by another array\n");
	System.out.println("75. replace each element of the array by its rank in the array\n");
	System.out.println("76. finding equilibrium index of an array\n");
	System.out.println("77. rotation of element of array left and right\n");
	System.out.println("78. block swap algorithm of array rotation\n");
	System.out.println("79. juggling algorithm for array rotation\n");
	System.out.println("80. finding circular rotation of an array by k positions\n");
	System.out.println("81. length of string without using strlen() function\n");
	System.out.println("82. toggle each charecter in a string\n");
	System.out.println("83. count the number of vowel\n");
	System.out.println("84. remove the vowels from a string\n");
	System.out.println("85. check if the given string is palindrome or not\n");
	System.out.println("86. print the given string in reverse order\n");
	System.out.println("87. remove all charecters from string except alphabet\n");
	System.out.println("88. remove spaces from string\n");
	System.out.println("89. remove brackets from an algebric expression\n");
	System.out.println("90. count the sum of numbers in a string\n");
	System.out.println("91. capitalize the first and last charecters of each word of a string\n");
	System.out.println("92. calculate the frequency of charecter in a string\n");
	System.out.println("93. find non-repiting charecter in a string\n");
	System.out.println("94. check two string are anagram or not\n");
	System.out.println("95. replace a sub string in a string\n");
	System.out.println("96. count common sub-sequence in two strings\n");
	System.out.println("97. check if two strings match where one string contains wildcard charecters\n");
	System.out.println("98. star pattern first alphabet of our name\n");
	System.out.println("99. pyramid number pattern\n");
	System.out.println("100. pascal triangle\n");
	System.out.println("\n\n****************************************\n");
	System.out.println("****************************************\n");
	
             System.out.println("enter our choice\n");
              Scanner s=new Scanner(System.in);
                 n=s.nextInt();
              Scanner t=new Scanner(System.in);
      switch(n)
      {
///////////////////////////////////////////////////////////////////////////////
       case 1:
   System.out.println("enter a number");
          a=t.nextInt();
   if(a>0)
{
System.out.println("Positive number");
}
else if(a<0)
{
System.out.println("Negative number");
}
else 
{
System.out.println("Number is Zero");
}

break;
/////////////////////////////////////////////////////////////////////////////////
case 2:
System.out.println("enter the number");
a=t.nextInt();
if(a%2==0)
{
System.out.println("Even Number");
}
else
{
System.out.println("Odd number");
}
break;
/////////////////////////////////////////////////////////////////////////////////
case 3:
  System.out.println("enter the number");
    a=s.nextInt();
  for(i=a;i>=1;i--)
{
  sum=sum+i;
} 
System.out.println("Sum is "+sum);
break;
//////////////////////////////////////////////////////////////////////////////////

case 4:
System.out.println("enter the starting number\n");
a=s.nextInt();
System.out.println("enter the ending number\n");
b=s.nextInt();
if(a<b)
{
for(i=a;i<=b;i++)
{
sum=sum+i;
}
}
else
{
System.out.println("\nfirst number is small\n");
}

System.out.println("sum of number is "+ sum);
break;
//////////////////////////////////////////////////////////////////////////////////

case 5:
System.out.println("enter the number of elements");
a=s.nextInt();


System.out.println("enter the elements");
 int z[]=new int[a];
for(i=0;i<a;i++)
{
z[i]=s.nextInt();
 max=z[0];
b=Math.max(max,z[i]);
}
System.out.println("maximum number is "+b);
break;
////////////////////////////////////////////////////////////////////////////////////

case 6:
 System.out.println("enter the year");
 a=s.nextInt();
 if(a%4==0 && a%400==0)
{
System.out.println("Leap Year");
}
else
{
System.out.println("Not a leap yaer");
}
break;
///////////////////////////////////////////////////////////////////////////////////////

case 7:
System.out.println("enter the number");
a=s.nextInt();
for(i=2;i<=Math.sqrt(a);i++)
{
 if(a%i==0)
{
 c++;
}
}
if(c==0)
{
System.out.println("Prime number");
}
else
{
System.out.println("Not a prime number");
}
break;
/////////////////////////////////////////////////////////////////////////////////////////

case 8:
System.out.println("enter the range from which you want to find prime number");
a=s.nextInt();
for(i=1;i<=a;i++)
{
 c=0;
for(j=2;j<=Math.sqrt(i);j++)
{
  if(i%j==0)
  {
    c=c+1;
  }
}
 if(c==0)
{
 System.out.println(i +" Prime number");
}
else
{
System.out.println(i +" is Not prime");

}
}
break;

////////////////////////////////////////////////////////////////////////////////////////////

case 9:
System.out.println("enter the numbers");
a=s.nextInt();
while(a!=0)
{
b=a%10;
a=a/10;
sum=sum+b;
}
System.out.println("sum of digit is "+sum);
break;
/////////////////////////////////////////////////////////////////////////////////////////////

case 10:
System.out.println("enter the number");
a=s.nextInt();
while(a!=0)
{
b=a%10;
a=a/10;
sum=sum*10+b;
}
System.out.println("Reverse of a number is "+ sum);
break;

/////////////////////////////////////////////////////////////////////////////////////////////

case 11:
System.out.println("enter the number");
a=s.nextInt();
n=a;
while(a!=0)
{
b=a%10;
a=a/10;
sum=sum*10+b;
}
if(sum==n)
{
System.out.println("palindrome number");
}
else
{
System.out.println("not a palindrome number");
}
break;
//////////////////////////////////////////////////////////////////////////////////////////////

case 12:
System.out.println("enter the number");
a=s.nextInt();
b=n=a;
while(a!=0)
{
a=a/10;
c++;
}


while(n!=0)
{
i=n%10;
n=n/10;
sum=sum+(int)Math.pow(i,c);
}
if(sum==b)
{
System.out.println("Armstrong number");
}
else
{
System.out.println("Not a armstrong number");
}
break;

///////////////////////////////////////////////////////////////////////////////////////////////

case 13:
System.out.println("enter the starting range of armstrong number");
a=s.nextInt();
System.out.println("Enter the ending range of armstrong number");
b=s.nextInt();
for(i=a;i<=b;i++)
{ c=0;sum=0;
f=e=d=i;
while(f!=0)
{
   f=f/10;
   c++;
}
while(d!=0)
{
 j=d%10;
 d=d/10;
 sum=sum+(int)Math.pow(j,c);
}
if(sum==e)
{
System.out.println(e+" is armstrong");
}
else
{
System.out.println(e+" is not armstrong");
}
}
break;
/////////////////////////////////////////////////////////////////////////////////////////////////////

case 14:
System.out.println("enter the range of fibonacci series");
a=s.nextInt();
int y[];
y=new int[a];
for(i=2;i<a;i++)
{
y[0]=0;
y[1]=1;
y[i]=y[i-1]+y[i-2];
}

for(i=0;i<a;i++)
{
System.out.print(y[i]+" ");
}
break;
////////////////////////////////////////////////////////////////////////////////////////////////////////

case 15:
System.out.println("entre the number");
a=s.nextInt();
int f1=1;
for(i=a;i>=1;i--)
{
 f1=f1*i;
}
System.out.println("factorial of a number is "+ f1);

///////////////////////////////////////////////////////////////////////////////////////////////////////////

case 16:
System.out.println("Enter the number");
a=s.nextInt();
System.out.println("Enter the power");
b=s.nextInt();
 f1=1;
for(i=1;i<=b;i++)
{
f1=f1*a;
}
System.out.println("power of a numebr is "+ f1);
break;
//////////////////////////////////////////////////////////////////////////////////////////////////////////

case 17:
System.out.println("Enter the number");
a=s.nextInt();
for(i=1;i<=a;i++)
{
if(a%i==0)
{
System.out.print(i+" ");
}
}
break;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

case 18:
System.out.println("Enter the number");
a=s.nextInt();
b=a;
while(a!=0)
{
p=a%10;
a=a/10;
f1=1;
for(i=p;i>=1;i--)
{
 f1=f1*i;
}
sum=sum+f1;
}
if(sum==b)
{
System.out.println("Strong Number");
}
else
{
System.out.println("Not a Strong Number");
}
break;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////

case 19:
System.out.println("Enter the number");
a=s.nextInt();
for(i=1;i<a;i++)
{
 if(a%i==0)
 {
   sum=sum+i;
 }
}
if(sum==a)
{
System.out.println("Perfect number");
}
else
{
System.out.println("Not a perfect number");
}
break;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////

case 20:
System.out.println("Enter the number");
a=s.nextInt();
 b=a;
while(a!=0)
{
 a=a/10;
 c++;
}
p=(int)Math.pow(b,2);
c=p%(int)Math.pow(10,c);
if(b==c)
{
System.out.println("Automorphic Number");
}
else
{
System.out.println("Not a automorphic number");
}
break;

//////////////////////////////////////////////////////////////////////////

case 21:
System.out.println("Enter the number");
a=s.nextInt();
b=a;
while(a!=0)
{
n=a%10;
a=a/10;
sum=sum+n;
}
if(b%sum==0)
{
System.out.println("Harshad Number");
}
else
{
System.out.println("Not a Harshad number");
}
break;

/////////////////////////////////////////////////////////////////////////////

case 22:
System.out.println("Enter the  number");
a=s.nextInt();
for(i=1;i<a;i++)
{
 if(a%i==0)
{
 sum=sum+i;
}

}
if(sum>a)
{
System.out.println("Aboundant number");
}
else
{
System.out.println("Not a Aboundant Number");
}
break;

///////////////////////////////////////////////////////////////////

case 23:
System.out.println("Enter the 1st number");
a=s.nextInt();
System.out.println("Enter the second number");
b=s.nextInt();
for(i=1;i<a;i++)
{
if(a%i==0)
{
sum=sum+i;

}
}
for(i=1;i<b;i++)
{
if(b%i==0)
{

sum1=sum1+i;
}
}
if((sum/a)==(sum1/b))
{
System.out.println("Friendaly pair");
}
else
{
System.out.println("Not a friendaly pair");
}
break;

//////////////////////////////////////////////////////////////

case 24:
System.out.println("Enter the first number");
a=s.nextInt();
System.out.println("Enter the second number");
b=s.nextInt();
p=a>b?a:b;
for(i=p;i>=1;i--)
{
  if(a%i==0 && b%i==0)
  {
    break;
   }
}
System.out.println("HCF is "+ i);
break;
//////////////////////////////////////////////////////////////////////

case 25:
System.out.println("Enter the first number");
a=s.nextInt();
System.out.println("Enter the second number");
b=s.nextInt();
p=a>b?a:b;
while(a!=b)
{
if(p%a==0 && p%b==0)
{
 break;
} 
p++;
}
System.out.println("LCM is "+ p);
break;
///////////////////////////////////////////////////////////////////////

case 26:
System.out.println("Enter the first number");
a=s.nextInt();
System.out.println("Enter the second number");
b=s.nextInt();
p=a>b?a:b;
for(i=p;i>=1;i--)
{
if(a%i==0 && b%i==0)
{
  break;
}

}
System.out.println("GCD is "+ i);
break;
///////////////////////////////////////////////////////////////////////////

case 27:
System.out.println("Enter the number");
a=s.nextInt();
i=0;
while(a!=0)
{
p=a%10;
a=a/10;
sum=sum+p*(int)Math.pow(2,i);
i++;
}
System.out.println("Decimal number is "+ sum);
break;

////////////////////////////////////////////////////////////////////////////

case 28:
System.out.println("Enter the number");
a=s.nextInt();
i=1;
z=new int [100];
while(a!=0)
{
z[i]=a%2;
a=a/2;

i++;
}
for(j=i-1;j>=1;j--)
{
System.out.print(z[j]+" ");
}
break;
/////////////////////////////////////////////////////////////////////////

case 29:
System.out.println("Enter the number");
a=s.nextInt();
i=1;
z=new int[100];
while(a!=0)
{
z[i]=a%8;
a=a/8;
i++;
}
for(j=i-1;j>=1;j--)
{
System.out.print(z[j]+" ");
}
break;

/////////////////////////////////////////////////////////////////////////

case 30:
System.out.println("Enter the number");
a=s.nextInt();
i=1;
z=new int [100];
while(a!=0)
{
p=a%10;
while(p!=0)
{
z[i]=p%2;
p=p/2;
i++;
}
a=a/10;
}

for(j=i-1;j>=1;j--)
{
System.out.print(z[j]+" ");
}
break;
/////////////////////////////////////////////////////////////////////////

case 31:
System.out.println("Enter the number");
a=s.nextInt();
i=0;
while(a!=0)
{
p=a%10;
if(p==8 || p==9)
{
System.out.println("Octal number is beteween 0 to 8");
break;
}
a=a/10;
sum=sum+p*(int)Math.pow(8,i);
i++;
}
System.out.println("decimal no. is: "+ sum);

break;

/////////////////////////////////////////////////////////////////////////

case 32:
System.out.println("Enter the x cordinate");
a=s.nextInt();
System.out.println("Enter the second cordinate");
b=s.nextInt();

if((a>=0 && b>0) || (a>0 && b>=0) )
{
System.out.println("1 st quadrent");
}
else if((a<0 && b>=0) || (a<0 && b>0))
{
System.out.println("2nd quadrent");
}
else if(a<0 && b<0)
{
System.out.println("3rd quadrent");
}
else if((a>=0 && b<0) && (a>0 && b<0))
{
System.out.println("4th quadrent");
}
else
{
System.out.println("Origin");
}
break;

/////////////////////////////////////////////////////////////////////////

case 33:

System.out.println("Incomplete");
break;

/////////////////////////////////////////////////////////////////////////

case 34:
System.out.println("Incomplete");
break;

/////////////////////////////////////////////////////////////////////////

case 35:
System.out.println("Enter the first fraction numerator ");
a=s.nextInt();
System.out.println("Enter the first fraction denominator");
b=s.nextInt();
System.out.println("Enter the second fraction numerator ");
c=s.nextInt();
System.out.println("Enter the second fraction denominator");
d=s.nextInt();

e=a*d+b*c;
f=b*d;
p=e>f?f:e;
for(i=2;i<=p;i++)
{
if(e%i==0 && f%i==0)
{
   e=e/i;
   f=f/i;
   i--;
}
}
System.out.println("fraction of a number is: "+ e +"/"+ f);
break;

/////////////////////////////////////////////////////////////////////////
case 36:
System.out.println("Enter the number");

a=s.nextInt();
r=Integer.toString(a);
r=r.replace('0','1');
System.out.println(r);
break;
/////////////////////////////////////////////////////////////////////////

case 37:
/*System.out.println("Enter the number");
a=s.nextInt();
if(a%2==0)
{
   for(i=2;i>=(a-i)/2;i=nextprime(i))
     {
       if(isprime(a-i))
         {
          System.out.println(i +"  "+a-i);
          }
       }
}
else
{
System.out.println("Can't express a number into a sum of two prime numbers");
}

int nextprime(int n)
{
 for(j=n;j<=a;j++)
  {
    if(n%j==0)
    {
       c++;
      }
    }
   if(c==2)
   {
     return n;
    }
}

int isprime(int n)
{
  for(i=1;i<=n;i++)
   {
    if(n%i==0)
     {
    sum++;
     }
    }
    if(sum==0)
    {
      return 1; 
   }
    else 
    {
      return 0;
     }
}
*/
/////////////////////////////////////////////////////////////////////////////////
case 39:

System.out.println("Enter the charector");

char o=s.next().charAt(0);
if(o=='a'||o=='A'||o=='e'||o=='E'||o=='i'|o=='I'||o=='o'|o=='O'|o=='u'||o=='U')
{
System.out.println("Vowel");
}
else
{
System.out.println("Consonent");
}
break;
/////////////////////////////////////////////////////////////////////////////////

case 40:
System.out.println("Enter the charector");
 o= s.next().charAt(0);
if(Character.isAlphabetic(o))
{
System.out.println("Alphabet");
} 
else
{
System.out.println("Not a alphabet");
}
break;

/////////////////////////////////////////////////////////////////////////////////

case 41:
System.out.println("Enter the radius");
float radius=s.nextFloat();
System.out.println("Area of circle is "+ 3.14*radius*radius);
break;
///////////////////////////////////////////////////////////////////////////////

case 42:
System.out.println("Enter the charecter");
a=s.next().charAt(0);
System.out.println("ASCII code is "+ a);
break;

///////////////////////////////////////////////////////////////////////////////
case 43:
for(i=1;i<=100;i++)
{  c=0;
  for(j=i;j>=1;j--)
  {
     if(i%j==0)
   {
     c++;
   }
   }

if(c==2)
{
System.out.print(i+" ");
}
}
break;
///////////////////////////////////////////////////////////////////////////////

case 44:
System.out.println("Enter the number");
a=s.nextInt();
while(a!=0)
{
a=a/10;
c++;
}
System.out.println("Total digit is "+c);
break;
///////////////////////////////////////////////////////////////////////////////

case  46:
System.out.println("Entre the year");
int year=s.nextInt();
System.out.println("Entre the Month");
int month=s.nextInt();
if( (month==2) &&(year%4==0) && (year%400==0))
{
System.out.println("Number of days is 29");
}

else if(month==2)
{
System.out.println("Number of days is 28");
}
else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
{
System.out.println("Number of days is 31");
}
else
{
System.out.println("Number of days is 30");
}
break;
///////////////////////////////////////////////////////////////////////////////

case 47:
System.out.println("Enter the number");
a=s.nextInt();
System.out.println("find the digit in a number");
b=s.nextInt();
while(a!=0)
{
  p=a%10;
  if(b==p)
  {
   c++;
   }
  a=a/10;
}
System.out.println("Number of occurances of "+b +" is "+ c);
break;
///////////////////////////////////////////////////////////////////////////////

case 48:
System.out.println("enter the number");
a=s.nextInt();
System.out.println("Enter the divisor");
b=s.nextInt();
for(i=1;i<=a;i++)
{
 c=0;
for(j=i;j>=1;j--)
{
  if(i%j==0)
  { c++;}
  
}
 if(c==b)
 {
   sum=sum+1;
}
}
System.out.println("No. of divsors have "+sum);
break;

///////////////////////////////////////////////////////////////////////////////

case 49:
System.out.println("Enter the value od a,b,c");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
d=(b*b)-(4*a*c);

if(d==0)
{
System.out.println("Roots are real and same");
e= (-b)/2*a;
System.out.println("x= "+ e+" y= "+e);
}

else if(d>0)
{
System.out.println("roots are real and different");
e= (-b+d)/2*a;
f= (-b-d)/2*a;
System.out.println("x= "+e+" y= "+f);
}

else
{
System.out.println("no real roots");
}
break;

///////////////////////////////////////////////////////////////////////////////
case 50:
System.out.println("Enter the elements");
a=s.nextInt();
z=new int[a];
for(i=0;i<a;i++)
{
  z[i]=s.nextInt();
  
}

  Arrays.sort(z);
  System.out.println("Smallest element is "+ z[0]);
break;

///////////////////////////////////////////////////////////////////////////////

case 51:
System.out.println("Enter the number of elements");
a=s.nextInt();
z=new int[a];
for(i=0;i<a;i++)
{
z[i]=s.nextInt();
}
Arrays.sort(z);
System.out.println("Second smallest number is "+z[1]);
break;
///////////////////////////////////////////////////////////////////////////////

case 52:
System.out.println("Enter the number of elements");
a=s.nextInt();
z=new int[a];
for(i=0;i<a;i++)
{
z[i]=s.nextInt();
}
Arrays.sort(z);
System.out.println("Largest number is "+z[a-1]);
break;

///////////////////////////////////////////////////////////////////////////////

case 53:
System.out.println("Enter the number of elements");
a=s.nextInt();
z=new int[a];
for(i=0;i<a;i++)
{
z[i]=s.nextInt();
}
Arrays.sort(z);
System.out.println("Largest number is "+z[a-1]+" Smallest number is "+ z[0]);
break;

///////////////////////////////////////////////////////////////////////////////
case 54:

System.out.println("Enter the number of elements");
a=s.nextInt();
z=new int[a];
for(i=0;i<a;i++)
{
z[i]=s.nextInt();
sum=sum+z[i];
}

System.out.println("Sum of numbers is "+ sum);
break;

///////////////////////////////////////////////////////////////////////////////

case 55:
System.out.println("Enter the number of elements");
a=s.nextInt();
z=new int[a];
for(i=0;i<a;i++)
{
z[i]=s.nextInt();
}
System.out.println("Reverse of an array is: ");
for(i=a-1;i>=0;i--)
{
System.out.print(z[i]+" ");
}
break;

///////////////////////////////////////////////////////////////////////////////

case 56:

System.out.println("Enter the number of elements");
a=s.nextInt();

z=new int[a];
for(i=0;i<a;i++)
{
z[i]=s.nextInt();
}
for(i=0;i<a/2;i++)
{
 if(z[i]>z[i+1])
 {
   temp=z[i];
   z[i]=z[i+1];
   z[i+1]=temp;
 }

}
for(i=a/2;i<a-1;i++)
{
 if(z[i]<z[i+1])
 {
   temp=z[i];
   z[i]=z[i+1];
   z[i+1]=temp;
 }

}
for(i=0;i<a;i++)
{
System.out.print(z[i]+" ");
}
break;
///////////////////////////////////////////////////////////////////////////////

case 57:
System.out.print("Enter the number");
a=s.nextInt();
z=new int [a];
for(i=0;i<a;i++)
{
z[i]=s.nextInt();
}
Arrays.sort(z);
for(i=0;i<a;i++)
{
System.out.print(z[i]+" ");
}
break;
///////////////////////////////////////////////////////////////////////////////

case 58:

System.out.print("Enter the size of an array");
a=s.nextInt();
z=new int[a];
boolean bn[] =new boolean[a];
Arrays.fill(bn,false);

for(i=0;i<a;i++)
{
z[i]=s.nextInt();
}
for(i=0;i<a;i++)
{
c=0;
if(bn[i]==true)
{
continue;
}

for(j=i;j<a;j++)
{
if(z[i]==z[j])
{
c++;
bn[j]=true;
}
}
System.out.println("Frequency of "+z[i]+" is := "+c);
}
break;

///////////////////////////////////////////////////////////////////////////////
case 59:
System.out.println("Enter the size of an array");
a=s.nextInt();
z=new int[a];

int pd[]=new int[a];

for(i=0;i<a;i++)
{
z[i]=s.nextInt();
}
for(i=0;i<a;i++)
{
b=z[i];
sum=0;
while(z[i]!=0)
{
p=z[i]%10;
z[i]=z[i]/10;
sum=sum*10+p;
}
if(b==sum)
{
pd[i]=sum;
}
}
Arrays.sort(pd);
e=pd.length;
System.out.println("Longest palindrome is "+pd[e-1] );
break;
///////////////////////////////////////////////////////////////////////////////

case 60:
System.out.println("enter the size of an array");
a=s.nextInt();
z=new int[a];
bn=new boolean[a];
Arrays.fill(bn, false);
for(i=0;i<a;i++)
{
 z[i]=s.nextInt();
}
for(i=0;i<a;i++)
{  c=0;
	if(bn[i]==true)
	{
         continue;

	}
	for(j=i;j<a;j++)
	{
        if(z[i]==z[j])
		{
			c++;
                        bn[j]=true;
		}
	}
	if(c==1)
	{
		b++;
		
	}
}
System.out.println("total number of distinct elements is "+ b);
break;
///////////////////////////////////////////////////////////////////////////////

case 61:

System.out.println("enter the size of an array");
a=s.nextInt();
z=new int[a];
bn=new boolean[a];
Arrays.fill(bn, false);
for(i=0;i<a;i++)
{
 z[i]=s.nextInt();
}
for(i=0;i<a;i++)
{  c=0;
	if(bn[i]==true)
	{
         continue;

	}
	for(j=i+1;j<a;j++)
	{
        if(z[i]==z[j])
		{
			c++;
            bn[j]=true;
		}
	}
	if(c>=1)
	{
		System.out.println("Repeting elements are "+ z[i]);
		
	}
}
break;

////////////////////////////////////////////////////////////////

case 62:
System.out.println("enter the size of an array");
a=s.nextInt();
z=new int[a];
bn=new boolean[a];
Arrays.fill(bn, false);
for(i=0;i<a;i++)
{
 z[i]=s.nextInt();
}
for(i=0;i<a;i++)
{  c=0;
	if(bn[i]==true)
	{
         continue;

	}
	for(j=i+1;j<a;j++)
	{
        if(z[i]==z[j])
		{
			c++;
            bn[j]=true;
		}
	}
	if(c==0)
	{
		System.out.println("NonRepeting elements are "+ z[i]);
		
	}
}
break;

////////////////////////////////////////////////////////////////////////////////

case 63:
System.out.println("enter the numnber");
a=s.nextInt();
z=new int[a];
HashSet<Integer> hs=new HashSet<>(a);
for(i=0;i<a;i++)
{
   z[i]=s.nextInt();
  hs.add(z[i]);
  
}
System.out.println(hs);
break;
////////////////////////////////////////////////////////////////////////////////

case 64:
System.out.println("Enter the size of an array1");
a=s.nextInt();
System.out.println("Enter the size of an array1");
b=s.nextInt();
Integer []arr1=new Integer [a];
Integer [] arr2= new Integer[b];
if(a==b)
{
for(i=0;i<a;i++)
{
arr1[i]=s.nextInt();
}
for(i=0;i<b;i++)
{
arr2[i]=s.nextInt();
}
Arrays.sort(arr1);
Arrays.sort(arr2, Collections.reverseOrder());
for(i=0;i<a;i++)
{
sum=sum+arr1[i]*arr2[i];
}
}

else
{
System.out.println("Scaler product is not possible");
}
System.out.println("Sum of product is "+ sum);
break;

////////////////////////////////////////////////////////////////////////////////

case 65:

System.out.println("Enter the size of an array1");
a=s.nextInt();
System.out.println("Enter the size of an array1");
b=s.nextInt();
arr1=new Integer [a];
arr2= new Integer[b];
if(a==b)
{
for(i=0;i<a;i++)
{
arr1[i]=s.nextInt();
}
for(i=0;i<b;i++)
{
arr2[i]=s.nextInt();
}
Arrays.sort(arr1);
Arrays.sort(arr2);
for(i=0;i<a;i++)
{
sum=sum+arr1[i]*arr2[i];
}
}

else
{
System.out.println("Scaler product is not possible");
}
System.out.println("Sum of product is "+ sum);
break;

////////////////////////////////////////////////////////////////////////////////

case 66:

System.out.println("enter the size of an array");
a=s.nextInt();
z=new int[a];

for(i=0;i<a;i++)
{
z[i]=s.nextInt();
if(z[i]%2==0)
{
c++;
}
else
{
b++;
}
}
System.out.println("Even = "+c +"\n"+"Odd= "+b);
break;

////////////////////////////////////////////////////////////////////////////////

case 67:
System.out.println("Enter the size of an 2d array base size and next Dimension size");
a=s.nextInt();
b=s.nextInt();
int [][] a2= new int[a][b];
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
a2[i][j]=s.nextInt();
}
}

for(i=0;i<a;i++)
{
for(j=i+1;j<a;j++)
{
if(a2[i][0]==a2[j][1] && a2[i][1]==a2[j][0])
{
System.out.println(a2[i][0]+" "+ a2[i][1]);
}
}
}
break;

////////////////////////////////////////////////////////////////////////////////

case 68:

System.out.println("Enter the size of an array");
a=s.nextInt();
z=new int[a];
for(i=0;i<a;i++)
{
z[i]=s.nextInt();
}

for(i=0;i<(a-2);i++)
{f1=1;
for(j=i;j<(i+3);j++)
{
 f1=f1*z[j];
}
 if(max<f1)
 {
  max=f1;
  }
}

System.out.println(max);
break;

////////////////////////////////////////////////////////////////////////////////

case 69:

System.out.println("Enter the size of an array1");
a=s.nextInt();
System.out.println("Enter the size of array2");
b=s.nextInt();
z=new int[a];
int [] y2=new int[b];
for(i=0;i<a;i++)
{
z[i]=s.nextInt();
}
for(i=0;i<b;i++)
{
y2[i]=s.nextInt();
}
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
if(z[i]==y2[j])
{
c++;
}
}
if(c>=1)
{
System.out.println("Array is not disjoint");
break;
}
}
if(c==0)
{
System.out.println("Array is disjoint");
}
break;

////////////////////////////////////////////////////////////////////////////////


case 70:

System.out.println("Enter the size of an array1");
a=s.nextInt();
System.out.println("Enter the size of an array2");
b=s.nextInt();
z=new int[a];
y2=new int[b];
System.out.println("Enter the elements of an array1");
for(i=0;i<a;i++)
{
z[i]=s.nextInt();
}

System.out.println("Enter the elements of an array2");
for(j=0;j<b;j++)
{
y2[j]=s.nextInt();
}

for(i=0;i<a;i++)
   {
    for(j=0;j<b;j++)
   {
   if(z[i]==y2[j])
    {
      c++;
     break;
      }
  }
}
if(c==b)
{
System.out.println("array is subset of another array");
}
else
{
System.out.println("array is not subset of another array");
}

break;
////////////////////////////////////////////////////////////////////////////////

case 71:
System.out.println("Enetr the size of an array");
a=s.nextInt();
z=new int[a];
for(i=0;i<a;i++)
{
z[i]=s.nextInt();
}
for(i=0;i<a;i++)
{
 while(z[i]%2==0)
 {
  z[i]=z[i]/2;
 }
 while(z[i]%3==0)
 {
  z[i]=z[i]/3;
 }
}
for(i=0;i<a-1;i++)
{
if(z[i]==z[i+1])
{
c++;
}
}
if(c==(a-1))
{
System.out.println("yes");
}
 
else
{
System.out.println("No");
}

////////////////////////////////////////////////////////////////////////////////

case 72:
System.out.println("Enter the size of an array");
a=s.nextInt();
z=new int[a];
sum=0;
p=0;
for(i=0;i<a;i++)
{
z[i]=s.nextInt();
}
Arrays.sort(z);

for(i=0;i<a;i++)
{
p=z[a-1];

for(j=0;j<a;j++)
{

if(i==j)
{
continue;
}
 else if(p>=Math.abs(z[i]-z[j]))
  { 
    p=Math.abs(z[i]-z[j]);

   }
}

sum=sum+p;
}
System.out.println(sum);
break;

////////////////////////////////////////////////////////////////////////////////

case 73:
System.out.println("Try later");
break;

case  74:
System.out.println("Enter the size of first array");
a=s.nextInt();
System.out.println("Enter the size of 2nd array");
b=s.nextInt();
z=new int[a];
int z1[]=new int[a];
y2=new int[b];
for(i=0;i<a;i++)
{
z[i]=s.nextInt();
}
for(i=0;i<b;i++)
{
y2[i]=s.nextInt();
}
c=0;p=1;
for(i=0;i<b;i++)
{ 
for(j=0;j<a;j++)
{
  if(y2[i]==z[j])
  {
   z1[c]=z[j];
    c++;
  }
}
}
for(i=0;i<a;i++)
{ sum=0;
for(j=0;j<b;j++)
{ 
  if(z[i]==y2[j])
   {
     sum++;
    }
}
if(sum==0)
{
z1[a-p]=z[i];
p++;
}
} 


for(i=0;i<a;i++)
{
System.out.print(z1[i]+" ");
}

break;

case 75:
System.out.println("Enter the size of an array");
a=s.nextInt();
z=new int[a];
y2=new int[a];
for(i=0;i<a;i++)
{
z[i]=s.nextInt();
y2[i]=z[i];
}
Arrays.sort(y2);
p=1;
for(i=0;i<a;i++)
{
for(j=0;j<a;j++)
{
if(y2[i]==z[j])
{
z[j]=p;
p++;
break;
}
}
}
for(j=0;j<a;j++)
{
System.out.print(z[j]+" ");
}

break;

////////////////////////////////////////////////////////////////////

case 76:

System.out.print("Solve later");
break;

////////////////////////////////////////////////////////////////////

case 77:

System.out.println("Enter the size of an array");
a=s.nextInt();
System.out.println("Enetr the numebr of rotations");
b=s.nextInt();
z=new int[a];
for(i=0;i<a;i++)
{
z[i]=s.nextInt();
}
for(j=0;j<b;j++)
{  sum=z[0];
  for(i=0;i<a-1;i++)
 {
   z[i]=z[i+1];
 }
 z[i]=sum;
}
for(i=0;i<a;i++)
{
System.out.print(z[i]+" ");
}
break;

////////////////////////////////////////////////////////////////////

case 78:

System.out.println("Enter the size of an array");
a=s.nextInt();
System.out.println("Enetr the numebr of rotations");
b=s.nextInt();
z=new int[a];
for(i=0;i<a;i++)
{
z[i]=s.nextInt();
}
for(j=0;j<b;j++)
{  sum=z[0];
  for(i=0;i<a-1;i++)
 {
   z[i]=z[i+1];
 }
 z[i]=sum;
}
for(i=0;i<a;i++)
{
System.out.print(z[i]+" ");
}
break;

////////////////////////////////////////////////////////////////////

case 79:
System.out.println("Enter the size of an array");
a=s.nextInt();
System.out.println("Enter the number of rotations");
b=s.nextInt();
p=0;
for(i=b;i>1;i--)
{
 if(b%i==0 && a%i==0)
{
   p=i;
   break;
}
}
z=new int[a];
for(i=0;i<a;i++)
{
z[i]=s.nextInt();
}

for(i=0;i<b;i++)
{  sum=z[i];
    j=i;
  while(true)
  { 
   c=(j+b)%a;
   if(c==i)
  {
    break;
   }
     z[j]=z[c];
      j=c;
  }
  z[j]=sum;
}
for(i=0;i<a;i++)
{
System.out.print(z[i]+" ");
}


////////////////////////////////////////////////////////////////////

case 80:

System.out.println("Enter the size of an array");
a=s.nextInt();
System.out.println("Enetr the numebr of rotations");
b=s.nextInt();
z=new int[a];
for(i=0;i<a;i++)
{
z[i]=s.nextInt();
}
for(j=0;j<b;j++)
{  sum=z[0];
  for(i=0;i<a-1;i++)
 {
   z[i]=z[i+1];
 }
 z[i]=sum;
}
for(i=0;i<a;i++)
{
System.out.print(z[i]+" ");
}
break;

////////////////////////////////////////////////////////////////////

case 81:
{
Scanner scc=new Scanner(System.in);
System.out.println("Enter the String");
String str=scc.nextLine();
for(char ch: str.toCharArray())
{
 c++;
}
System.out.println(c);
}
break;

////////////////////////////////////////////////////////////////////

case 82:
{
Scanner scc=new Scanner(System.in);
System.out.println("Enter the String");
String str=scc.nextLine();
char str1[]=str.toCharArray();
for(i=0;i<str.length();i++)
{
 if(str1[i]>=65 && str1[i]<=90)
 {
   str1[i]=(char)(str1[i]+32);
 }
 else 
 {
  str1[i]=(char)(str1[i]-32);
 }
}
for(i=0;i<str.length();i++)
System.out.print(str1[i]+" ");

}
break;
////////////////////////////////////////////////////////////////////

case 83:
{
System.out.println("Enter the string");
Scanner scc=new Scanner(System.in);
String str=scc.nextLine();
char ch[]=str.toCharArray();
for(i=0;i<str.length();i++)
{
  if(ch[i]=='a'||ch[i]=='A'||ch[i]=='e'||ch[i]=='E'||ch[i]=='i'||ch[i]=='I'||ch[i]=='o'||ch[i]=='O'||ch[i]=='u'||ch[i]=='U')
  {
  c++;
  }
}
System.out.print(c);
}
break;

////////////////////////////////////////////////////////////////////
case 84:
{
System.out.println("Enter the String");
Scanner scc=new Scanner(System.in);
String str=scc.nextLine();
str=str.replaceAll("[aeiou]","");
System.out.println(str);
}
break;

////////////////////////////////////////////////////////////////////

case 85:
/*{
System.out.println("Enter the String");
Scanner scc=new Scanner(System.in);
String str=scc.nextLine();
StringBuffer sb=new StringBuffer(str);
String rev=sb.toString(); 
if(str.equals(rev))
{
System.out.println("Palindrome");
}
else
{
System.out.println("not a palindrome");
}
}
break;*/

////////////////////////////////////////////////////////////////////

case 86:
{
System.out.println("Enter the String");
Scanner scc=new Scanner(System.in);
String str=scc.nextLine();
StringBuffer sb=new StringBuffer(str);
sb.reverse();
System.out.println(sb);

}
break;
////////////////////////////////////////////////////////////////////

case 87:
{
System.out.println("Enter the String");
Scanner scc=new Scanner(System.in);
String str=scc.nextLine();
str=str.replaceAll("[^a-zA-Z]","");
 System.out.println(str);
}
break;

////////////////////////////////////////////////////////////////////

case 88:
{
System.out.println("Enter the String");
Scanner scc=new Scanner(System.in);
String str=scc.nextLine();
str=str.replaceAll(" ","");
 System.out.println(str);
}
break;

////////////////////////////////////////////////////////////////////

case 89:
{
System.out.println("Enter the String");
Scanner scc=new Scanner(System.in);
String str=scc.nextLine();
str=str.replaceAll("[{()}]","");
 System.out.println(str);
}
break;

////////////////////////////////////////////////////////////////////

case 90:
{
System.out.println("Enter the String");
Scanner scc =new Scanner(System.in);
String str=scc.nextLine();
for(i=0;i<str.length();i++)
{
if(Character.isDigit(str.charAt(i)))
{
sum=sum+(str.charAt(i)-'0');
}
}
System.out.println("Sum is :-"+sum);
}
break;

////////////////////////////////////////////////////////////////////

case 91:
{
System.out.println("Enter the String");
Scanner scc =new Scanner(System.in);
String str=scc.nextLine();
char ch[]=str.toCharArray();

for(i=0;i<str.length();i++)
{
 if(ch[i]==32)
 {
  
ch[i-1]=Character.toUpperCase(ch[i-1]);
  ch[i+1]=Character.toUpperCase(ch[i+1]);
 }
}
ch[0]=Character.toUpperCase(ch[0]);
ch[str.length()-1]=Character.toUpperCase(ch[str.length()-1]);
for(i=0;i<str.length();i++)
System.out.print(ch[i]);
}

break;
////////////////////////////////////////////////////////////////////

case 92:
{
System.out.println("Enter the String");
Scanner scc =new Scanner(System.in);
String str=scc.nextLine();
char ch[]=str.toCharArray();
bn=new boolean[str.length()];
Arrays.fill(bn,true);
for(i=0;i<str.length();i++)
{ c=0;
 for(j=i;j<str.length();j++)
{ 
  if(bn[j]==false || ch[j]==32)
   {
    continue;
    }
  if(ch[i]==ch[j])
   {
     c++;
    bn[j]=false;
    }
 }
if(c>=1)
System.out.println(ch[i]+" --> "+c);
}
}
break;
////////////////////////////////////////////////////////////////////

case 93:
{
System.out.println("Enter the String");
Scanner scc =new Scanner(System.in);
String str=scc.nextLine();
char ch[]=str.toCharArray();
bn=new boolean[str.length()];
Arrays.fill(bn,true);
for(i=0;i<str.length();i++)
{ c=0;
 for(j=i;j<str.length();j++)
{ 
  if(bn[j]==false || ch[j]==32)
   {
    continue;
    }
  if(ch[i]==ch[j])
   {
     c++;
    bn[j]=false;
    }
 }
if(c==1)
System.out.println(ch[i]+" --> "+c);
}
}
break;

////////////////////////////////////////////////////////////////////

case 94:
{
System.out.println("Enter the 1st String");
Scanner scc =new Scanner(System.in);
String str=scc.nextLine();
System.out.println("Enter the 1st String");
String str2=scc.nextLine();

char ch[]=str.toCharArray();
char ch2[]=str2.toCharArray();
if(str.length()==str2.length())
{
for(i=0;i<str.length();i++)
{
 for(j=0;j<str2.length();j++)
  {
     if(ch[i]==ch2[j])
    {
     c++;
   }
  }
}
}
if(c==str.length())
{
System.out.println("argram string");
}
else
{
System.out.println("Not a argram string");
}
}
break;
////////////////////////////////////////////////////////////////////

case 95:
{
System.out.println("Enter the string");
Scanner scc =new Scanner(System.in);
String str=scc.nextLine();
System.out.println("Enter the sub string to be replaced");
String str1=scc.nextLine();
System.out.println("Enter the replaced string");
String str2=scc.nextLine();

str=str.replace(str1,str2);
System.out.println(str);

}
break;
////////////////////////////////////////////////////////////////////

case 96:
System.out.println("incomplete");

////////////////////////////////////////////////////////////////////

case 97:
System.out.println("incomplete");

////////////////////////////////////////////////////////////////////

case 98:
System.out.println("Print Alphabet A");

for(i=1;i<=4;i++)
{
for(j=1;j<=7;j++)
{
if((i==3 && (j>1&&j<7)||j-i==3||i+j==5))
{
System.out.print("*");
 }
 else
 System.out.print(" ");  
  }
System.out.print("\n");
}
break;

////////////////////////////////////////////////////////////////////

case 99:
System.out.println("Pyramid pattern");
System.out.println("Enter the number of rows");
a=s.nextInt();
for(i=1;i<=a;i++)
{
for(j=a-i;j>=1;j--)
{
 System.out.print(" ");
}
for(p=1;p<=2*i-1;p++)
{
System.out.print("*");
}
System.out.print("\n");
}
break;

////////////////////////////////////////////////////////////////////

case 100:
System.out.println("Pyramid pattern");
System.out.println("Enter the number of rows");
a=s.nextInt();
for(i=0;i<=a-1;i++)
{
p=(int)Math.pow(11,i);
System.out.print(p);
System.out.print("\n");
 }
break;

default:
System.out.println("wrong input");
break;   
///////////////////////===========================================================================////////////////////  

}
}
}