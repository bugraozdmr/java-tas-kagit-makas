import java.util.Scanner;
import java.util.Random;

public class oyun {
    //biri bizim tahmin diğeri bilgisayar olcak
    private String a,b;
    //bunu herkes görsede olur
    public String[] y={"taş","kağıt","makas"};

    public oyun() {

        int randomInt;


        Scanner scanner=new Scanner(System.in);


        while (true){
            System.out.print("Tahmin :");
            String u=scanner.nextLine();
            if (u.equalsIgnoreCase("taş") || u.equalsIgnoreCase("kağıt") || u.equalsIgnoreCase("makas")){
                this.a=u;
                break;
            }
            else System.out.println("Taş/kağıt/makas ...");
        }
        Random random = new Random();
        // Define the range for the random number (0 to 3 inclusive)
        int min = 0;
        int max = 2;

        // Generate a random integer between 'min' and 'max' (inclusive)
        randomInt = random.nextInt((max - min) + 1) + min;

        this.b=y[randomInt];
    }

    //tek fonsiyon
    public int karsila(){
        switch (a){
            case "taş":
                if(b.equalsIgnoreCase("kağıt")){
                    return 0;
                }
                else if(b.equalsIgnoreCase("makas")){
                    return 1;
                }
                //berabere iki
                else return 2;
            case "kağıt":
                if(b.equalsIgnoreCase("taş")){
                    return 1;
                }
                else if(b.equalsIgnoreCase("makas")){
                    return 0;
                }
                //berabere iki
                else return 2;
            case "makas":
                if(b.equalsIgnoreCase("kağıt")){
                    return 1;
                }
                else if(b.equalsIgnoreCase("taş")){
                    return 0;
                }
                //berabere iki
                else return 2;
            default:        //bu olmazsa return ister
                return -1; // Invalid input, you can choose another value or handle it differently
        }
    }


    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}
