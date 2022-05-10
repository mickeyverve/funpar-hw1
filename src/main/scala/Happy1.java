import java.util.Scanner;
public class Happy1 {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        int  rangenumber, num = 1, c = 0, letest = 0;
        System.out.println("Enter Nth number:");
        rangenumber=cs.nextInt();

        while (c != rangenumber)
        {
            int num1=num,sum=0,rem;
            while(sum!=1 && sum!=4)
            {
                sum=0;
                while(num1!=0)
                {
                    rem=num1%10;
                    sum+=(rem*rem);
                    num1/=10;
                }
                num1=sum;
            }
            if(sum==1)
            {
                c++;
                letest=num;
            }
            num = num + 1;
        }
        System.out.println(rangenumber+"th Happy number is "+letest);
        cs.close();
    }}