public class ContaNani1 extends Thread{
    
    public void run(){

        setName("settenani");
        System.out.println(Thread.currentThread().getName());

        for(int i =0;i<7;i++){

            System.out.println((i+1) + " ");

        }


    }

}
