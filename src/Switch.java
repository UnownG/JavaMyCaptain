import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        int choice;
        System.out.println("Pick one: 1 --> If there's no mickey, this ain't Disney\t2 --> Yare Yare Dawa\t3 --> Yare Yare Daze\t4 --> Gureto Daze");
        Scanner s = new Scanner(System.in);
        choice = s.nextInt();
        switch(choice)
        {
            case 1 : System.out.println("Anasui!!");
                break;
            case 2 : System.out.println("Jolyne!!");
                break;
            case 3 : System.out.println("Jotaro");
                break;
            case 4 : System.out.println("Josuke!!");
                break;
            default : System.out.println("Ariariariariariariariariari~~ ARRIVEDERCI");
        }
    }
}