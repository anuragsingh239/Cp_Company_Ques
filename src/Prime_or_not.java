import java.util.Scanner;
public class Prime_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check : ");
        int n = sc.nextInt();
        int i,count=0;
        for(i=2;i<n;i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("It is prime ");
        }
        else{
            System.out.println("It is Not Prime");
        }
    }
}
