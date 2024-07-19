import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("person can vote");
        }
        else{
            System.out.println("person cannot vote");
        }
        sc.close(); //scanner object should release the obect here by this.......
    }
}
