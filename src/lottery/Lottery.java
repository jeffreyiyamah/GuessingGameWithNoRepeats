package lottery;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
public class Lottery {

   
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         ArrayList<Integer> list = new ArrayList<>();
         ArrayList<Integer> Wronglist = new ArrayList<>();
        String o = "";
        int randomNumberSelector = 0;
        int number = 5;
        int guess = 0;
       
        
         
        
// TODO code application logic here5
        
       
        
        
        System.out.println("Level of Difficulty: Easy, Medium or Hard?");
        o = input.nextLine();
        if(o.equals("Easy")){
         randomNumberSelector = 2;   
        }
        if(o.equals("Medium")){
         randomNumberSelector = 5;   
        }
        if(o.equals("Hard")){
         randomNumberSelector = 9;   
        
       }
        else{
            randomNumberSelector = 5;
        }
       Random random = new Random();
        Set<Integer> set = new HashSet<>();
        while (set.size() < randomNumberSelector){
        int n = (int)(Math.random() * randomNumberSelector);
        set.add(n);
        n++;
       //Integer [] value = (Integer[]) set.toArray();
        
        }
       Integer[] value = set.toArray(new Integer[0]);
       shuffleArray(value);
        System.out.println("------------------------------------------------------------------------" + "\n");
       System.out.println("Welcome to the Game of Lottery, you have six random numbers to guess in five tries, If you guess all the numbers within the amount of tries you win the game");
        System.out.println("At the end of the Game you will be given the solution as well as the numbers you chose");
        System.out.println("You can get a Hint by pressing -1, you only get 1 hint per 5 items");
        System.out.println("\n");
        System.out.println("Do you agree with the rules before we start?:");
        
        String agree = input.next();
        
 

        
        System.out.println("\n");
        if(agree.equals("Yes")|| agree.equals("yes")|| agree.equals("Y")|| agree.equals("y")){
         
            
        
           
        while(guess < value.length){
            System.out.println("Pick: a number: ");
            String red = input.next();
            int redd = Integer.valueOf(red);
            System.out.println("\n");
            if(red.equals("-1")){
                System.out.println("Do you want a Hint? [You will lose a try if you do!]");
                String blue = input.next();
                if(blue.equals("Yes")|| blue.equals("yes")|| blue.equals("Y")|| blue.equals("y")){
                    list.add(value[guess]);
                    System.out.println(list);
                    number = number - 1;
                }
                
            }
            
            if(!(value[guess] == redd)){
                Wronglist.add(redd);
                number = number - 1;
                System.out.println("You have " + number + " tries left");
                System.out.println("\n");
                
            }
            
            else{    
             
                list.add(redd);
                System.out.println("\n");
                System.out.println("Correct " + list + "\n");
                guess = guess + 1;   
            
            } 
            
            Integer [] array = list.toArray(new Integer[0]);
              
            if(Arrays.equals(array, value)){
                System.out.println("\n");
               System.out.println("Game Over, You Win");
                System.out.println("\n");
                System.out.println("\n");
                System.out.println("Results: " + list);
            
                System.out.println("Solution: " + Arrays.toString(value));
                break;
                }
               
                else if(number <= 0 || guess >= value.length ){
                
                  System.out.println("Game Over, Try Again Next Time");
                  System.out.println("\n");
                  System.out.println("Results: " + "(Wrong Answers)" + Wronglist + "(Answred Correctly)" + list);
                  System.out.println("Solution: " + Arrays.toString(value));
                  break;
            
              }
                
              
            }
        }
        else{
        System.out.println("Ok, Thank You for Participating");
        System.out.println("\n");
        System.out.println("Goodbye");    
        }
        
                       
            
            
        } 

 private static void shuffleArray(Integer[] value) {        
    
    for (int i = value.length - 1; i > 0; i--)
    {
        Random random = new Random();
       int index = random.nextInt(i + 1);
       int temp = value[index];
        value[index] = value[i];
        value[i] = temp;
    }
  
 } 
}
 
