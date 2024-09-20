import java.util.Scanner;
class GradeCalculator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int cl,eng,sci,maths,ss,second,avg;
        char grade;
        String name;
        System.out.println("Enter the name of the Student:");
        name=sc.nextLine();
        System.out.println("Enter the class:");
        cl=sc.nextInt();
        System.out.println("Enter the marks in English: ");
        eng=sc.nextInt();
        System.out.println("Enter the marks in Science: ");
        sci=sc.nextInt();
        System.out.println("Enter the marks in Maths: ");
        maths=sc.nextInt();
        System.out.println("Enter the marks in Social Studies: ");
        ss=sc.nextInt();
        System.out.println("Enter the marks in second language: ");
        second=sc.nextInt();
        avg=(eng+maths+sci+ss+second)/5;
        if(avg>90 && avg<=100)
        grade='A';
        else if(avg>70)
        grade='B';
        else if(avg>60)
        grade='C';
        else if(avg>50)
        grade='D';
        else if(avg>40)
        grade='E';
        else
        grade='F';
        System.out.println("\t Annual Report Card \t \t");
        System.out.println("Name - "+name);
        System.out.println("Class - "+cl);
        System.out.println("Average percentage obtained - "+avg+"%");
        System.out.println("Grade - "+grade);
        sc.close();
    }
} 