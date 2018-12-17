package thread_print_a_or_b;

class divide_5 extends Thread
{
    public void run(){
    for(int x=1;x<100;x++){
    if(x%5==0){
        System.out.println(x+" is divisible by 5= b");
    }
    }
    }
}

class divide_3 extends Thread
{
    public void run(){
    for(int x=1;x<100;x++){
    if(x%3==0){
        System.out.println(x+" is divisible by 3= a" );
    }
    }
    }
}
public class Thread_print_a_or_b {

    public static void main(String[] args) {

        divide_3 t1=new divide_3();
        divide_5 t2=new divide_5();
        t1.start();
        t2.start();
       
    }
    
}
