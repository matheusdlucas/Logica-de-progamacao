import java.util.Scanner;
public class questão1 {
public static void main(String[]args){
    Scanner scr = new Scanner(System.in);
    int a = scr.nextInt();
    int b = scr.nextInt();
    
    if(a > b){
        System.out.println(a+"é o maior");
    } else if (a < b){
        System.out.print(b+"é o maior");
    } else{
        System.out.println("São iguas");
    }
    }
            
}
        
    

