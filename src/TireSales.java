
public class TireSales {

    
    public static void main(String[] args) {
        ArrayStack pole= new ArrayStack();
        System.out.println("Adding 10 tire to the stack:");
        Tire t;
        for (int i = 0; i < 10; i++) {
            t =new Tire("Goodyear");
            pole.push(t);
            
        }
        System.out.println("Sell 4 tires to a customer");
        for (int i = 0; i < 4; i++) {
            t =(Tire)pole.pop();
            System.out.println(t);
            
        }
         System.out.println("Buying 2 new cooper tires to sell later");
         for (int i = 0; i < 2; i++) {
             pole.push(new Tire("Cooper"));
            
        }
         System.out.println("Sell another 4 tires to customer 2");
         for (int i = 0; i < 4; i++) {
             System.out.println(pole.pop());
            
        }
         System.out.println("There are " + pole.size() + " tires left on stack.");
         System.out.println("The next tire to sell is " + pole.peekTop());
    }
    
}
