public class ContaNani2 extends Thread{
    
    public ContaNani2(String nome){
        super();
        setName(nome);

    }

    public void run(){

        for(int i=0;i<7;i++){

            System.out.println((i+1) + "" +getName());

        }

    }

}
