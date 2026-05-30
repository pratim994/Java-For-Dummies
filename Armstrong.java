import java.util.*;


public class Armstrong {
    
    public static void main(String args[]){
        
        Scanner scanner = new Scanner(System.in);
        int armStrong = scanner.nextInt();
        
        int sum =0, Am = armStrong;
        
        while(armStrong > 0){
            
            sum += (Math.pow((armStrong%10), 3));
            
            armStrong /= 10;
            
        }
         
        return   (sum == Am) ? System.out.println("Yes it's an arstrong number") : System.out.println("Nope not an armstrong number");
    }
    
}
        
        
