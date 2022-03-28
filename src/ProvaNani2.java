public class ProvaNani2 {
    
    public static void main(String args[]){

        Thread thr1 =new ContaNani2("topolino");
        Thread thr2 =new ContaNani2("pippo");
        
        thr1.start();
        thr2.start();

    }

}
