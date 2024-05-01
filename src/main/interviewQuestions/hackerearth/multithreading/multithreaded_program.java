package hackerearth.multithreading;

public class multithreaded_program {
    public static void main(String args[]){
        NewThread obj1 = new NewThread("one");
        NewThread obj2 = new NewThread("two");
        try{
            obj1.t.wait();
            System.out.println(obj1.t.isAlive());

        }
        catch (Exception e){
            System.out.println("main thread interrupted");
        }
    }
}


// op - main thread interrupted