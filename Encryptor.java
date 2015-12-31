

public class Encryptor
{
    // instance variables - replace the example below with your own
    private Message msg;
    private Key key;
    
    //Message and Key the int, String or double 
    //the type is "Key"
    //get these from the constructors that im not working on 
    public Encryptor(){
    }
   
    public Encryptor(Message m, Key k)
    {
       msg = m;
       key = k;
    }
    
    public String encrypt()
    //no parameters if everything is inside message and key
    {
        
        //temporary variable
        if (msg.getEncrypt())
         //the method from the Message class thats a "get" method
         //encryting is jumbling it up,so dont jumble it up again
        {
           System.out.println("You can't do this. Sorry :/");
           return "error";
        }
        //returning returns to the computer
        //printing shows it to the user
        String jumbled = "";
        String text = msg.getMessage();
      
        String cipher = key.getCipher();
      
        
        for(int i = 0; i < text.length(); i++){
            //first, creates the counter value and sets it to the initial value
            //second i, tells you when to stop, so compare this to text.length
            //third tells it what to do after each loop
           String letter = text.substring(i,i+1);
           int number = letter.compareTo("a");
           jumbled += cipher.substring(number,number + 1);
        }
        
        return jumbled;
        //put it in a variable, catching it somewhere so we can use it
        //^method Nivi is gonna write
    }
    
    public String decrypt()
    {
         if (!msg.getEncrypt())
         //the method from the Message class thats a "get" method
         //encryting is jumbling it up,so dont jumble it up again
        {
           System.out.println("You can't do this. Sorry :/");
           return "error";
        }
        
        String unjumbled = "";
        String text = msg.getMessage();
        String cipher = key.getCipher();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        for(int i = 0; i < text.length(); i++){
            //first, creates the counter value and sets it to the initial value
            //second i, tells you when to stop, so compare this to text.length
            //third tells it what to do after each loop
           String letter = text.substring(i,i+1);
           int number = cipher.indexOf(letter);
           //searching in cipher, searching for letter
           unjumbled += alphabet.substring(number,number + 1);
        }
        
        return unjumbled;
    }
}
