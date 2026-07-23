import java.util.Scanner;

class Driving{
    Scanner sc=new Scanner(System.in);

    void drive(){
        int a;

        System.out.println("Enter Driver's Age");
        a=sc.nextInt();

        if(a>=18){
            System.out.println("Eligible to Drive");
        }
        else{
            System.out.println("Not Eligible to drive");
        }

    }
}
class movie{
    Scanner sc=new Scanner(System.in);

    void mov(){
        int choice;

        System.out.println("Enter Genre Code :");
        choice=sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Genre: Action");
                break;
            case 2:
                System.out.println("Genre: Comedy");
                break;
            case 3:
                System.out.println("Genre: Drama");
                break;
            default:
                System.out.println("Invalid Genre Code");
        }
    }

}


class shopping{
    Scanner sc=new Scanner(System.in);
int spend;
    void store(){
        System.out.println("Enter Amount Spent:");
        spend=sc.nextInt();

        if(spend>=100){
            System.out.println("Shipping is Free");

             if(spend>=50 && spend<=99){
                System.out.println("Shipping cost is $5");
            }
        }
        else{
            System.out.println("Shipping cost is $10");
        }
    }
}





public class Ifelse{
    public static void main(String[] args){

        Driving dr=new Driving();
        dr.drive();

        movie mv=new movie();
        mv.mov();

        shopping $=new shopping();
        $.store();
    }
}