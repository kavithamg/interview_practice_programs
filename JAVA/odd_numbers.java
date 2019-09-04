import java.util.Scanner;


class odd_numbers{
    public static void main(String args[]){

        int start, end;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the starting range number");
        start = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the ending range number");
        end = sc2.nextInt();

        for(int i = start; i <= end; i++){
            if(i % 2 !=0){
                System.out.println(i +" is an odd number");
            }
            else{
                System.out.println(i +" is not an odd number");
            }
        }
    }
}