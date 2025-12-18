import java.util.Scanner;
class Even{
    void show(int i){
        if(i%2==0){
            System.out.println("Even no is:"+i);
        }
        else{
            System.out.println("Odd no is:"+i);
        }
    };
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        int i=sc.nextInt();
        System.out.println("Enter the no:");
        Even n =new Even();
        n.show(i);
        sc.close();
    }
}