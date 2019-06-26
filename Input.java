import java.util.*;
public class Input {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        System.out.println("Enter integer");
        int value=sc.nextInt();
        repeat(str,value);
        }
        public static void repeat(String str,int value)
        {
            int i,count=0,len;
            len=str.length();
            System.out.print(str);
            while(count!=value)
            {
                for(i=len-value;i<len;i++)
                {
                    char c=str.charAt(i);
                    System.out.print(c);
                }
                count++;
            }
        }
}