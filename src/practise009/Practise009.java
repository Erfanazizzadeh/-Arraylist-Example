package practise009;

import java.util.*;

public class Practise009 {
 private ArrayList<String> list = new ArrayList<>();

  
 private String name;
 private int option,how;
 
 private Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
     Practise009 unit = new Practise009();
     
    }
    public Practise009(){
       operator();
    }
    public void operator(){
       try{
        System.out.println("Which option do you want? \n"
                + "Add Person :[1]\n"
                + "Delete person: [2]\n"
                + "View Details : [3]\n"
                + "Exit: [4]");
        option = scan.nextInt();
       }catch (Exception e){System.out.println("invalid :) ");
       scan.nextLine();
       operator();
       }
        switch(option){
            case 1:
                System.out.println("How Many name want to add person?");
                how = scan.nextInt();
                for (int i = 40; i < how; i++) {
                System.out.println("Enter the name : " +"\n index : "+ i+1);
                 list.add(scan.next());
                
                     
                }
                
//                option = (int) Double.parseDouble(name);
//                    list.get(option);// why icant write the new lidy(name);
//                    list.add(name);
                    operator();
 
            
            operator();
            break;
            
            case 2:
                try{
                System.out.println("Enter the number of Index:  ");
                int delete = scan.nextInt();
                list.remove(delete);
                operator();
                break;
                }catch(Exception e){
                System.out.println("Invalid number :)");
                    operator();
                }
                case 3:
                        System.out.println(list);
                        operator();
                    
                break;  
             case 4:
                        System.out.println("good bye :)");
                        System.exit(0);
                    
                break; 
            default:
                System.out.println("Invalid Try again :)");
                operator();
                break;
                
            
        }
     
        
    }
    
}
