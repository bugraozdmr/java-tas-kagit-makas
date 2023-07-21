public class Main {
    public static void main(String[] args) {
        System.out.println("---Taş/kağıt/makas oyunu---");

        int y=0,w=0;
        while (true){
            if(y==3){
                System.out.println("3 kere yenildin kaybettin");
                break;
            }
            if (w==3){
                System.out.println("3 kere kazandın victory");
                break;
            }
            oyun oyun1=new oyun();      //cons çalışacak sürekli

            if(oyun1.karsila()==1) {
                System.out.println("Kazandın..."+oyun1.getA()+" "+oyun1.getB()+" ı yener.");
                w++;
            }
            if(oyun1.karsila()==0) {
                System.out.println("Yenildin..."+oyun1.getA()+" "+oyun1.getB()+" ı yenemez.");
                y++;
            }
            else if(oyun1.karsila()==2) System.out.println("Berabere..."+oyun1.getA()+" "+oyun1.getB()+" aynılar.");


            System.out.println("**************\nMakine :"+y+"\tSen :"+w+"\n**************");
        }
    }
}
