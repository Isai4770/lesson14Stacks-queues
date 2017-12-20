
public class RadioCallinShow {

    
    public static void main(String[] args) {
      LinkedQueue phoneline = new LinkedQueue();
        System.out.println("our phone lines are open");
        System.out.println("We currently have " +phoneline.size() + "Callers.");
        phoneline.enqueue(new Caller("Nick"));
        phoneline.enqueue(new Caller("Scott"));
        phoneline.enqueue(new Caller("Alice"));
        System.out.println("The next caller will be " + phoneline.peekFront());
        System.out.println("Let's take our first call: hello, " + phoneline.dequeue());
        System.out.println("We currenly have " + phoneline.size() + " callers.");
        System.out.println("Two more callers are now on hold");
        Caller c1 = new Caller("Jill"), c2 = new Caller("Andy");
        phoneline.enqueue(c1);
        phoneline.enqueue(c2);
        Caller nextcaller =(Caller)phoneline.dequeue();
        System.out.println("");
    }
    
}
