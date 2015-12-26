public class Key
{
    private String keyphrase;
    private boolean reverseAlpha;
    private String cipher;

    public Key(String keyphrase, boolean reverseAlpha)
    {
        this.keyphrase = keyphrase.toLowerCase();
        this.reverseAlpha = reverseAlpha;
    }
    
    public void scanKeyphrase()
    {
    	int[] hash = new int[26];
    	for(int i = 0; i < keyphrase.length(); i++)
    	{
    		hash[keyphrase.charAt(i) - 'a'] ++;
    		
    	}
    	for(int i = keyphrase.length(); i < 0; i--)
    	{
    		if(hash[keyphrase.charAt(i) - 'a'] > 1)
    		{
    			keyphrase = keyphrase.substring(0, i) + keyphrase.substring(i+1);
    			hash[keyphrase.charAt(i) - 'a'] --;
    		}    		
    	}
    }
    
    public void scanAlpha()
    {
    	String alphabet;
    	
    	if (reverseAlpha == true)
    	{
    		alphabet = "zyxwvutsrqponmlkjihgfedcba";
    	}
    	else
    	{
    		alphabet = "abcdefghijklmnopqrstuvwxyz";
    	}
    	for (int i = 0; i < alphabet.length(); i++)
    	{
    		
    	}
    }

    public void createKey()
    {
        String before ="";
    	String isolate = "";
        String rest = "";
        int location;
        for (int i = 0; i < keyphrase.length(); i++)
        {
            isolate = keyphrase.substring(i, i+1);
            rest = keyphrase.substring(i+1, keyphrase.length());
            location = keyphrase.indexOf(isolate);
            if (location > -1)
            {
                //String repeat = keyphrase.substring(location, location + 1);
                keyphrase = keyphrase.substring(0, location) + keyphrase.substring(location + 1);
            }
        }
        if (reverseAlpha == true)
        {
        	String after = "";
        	String isoLetter = "";
        	String alphabet = "zyxwvutsrqponmlkjihgfedcba";
        	for (int i = 0; i < keyphrase.length(); i++)
        	{
        		isoLetter = alphabet.substring(i, i+1);
        		if (isoLetter.indexOf(keyphrase) > -1)
        		{
        			int dupLocation = alphabet.indexOf(isoLetter);
        			before = alphabet.substring(0, dupLocation);
        			after = alphabet.substring(dupLocation + 1);
        			cipher = before + after;
        		}
        	}
        }
        else
        {
        	//String before = "";
        	String after = "";
        	String isoLetter = "";
        	String alphabet = "abcdefghijklmnopqrstuvwxyz";
        	for (int i = 0; i < keyphrase.length(); i++)
        	{
        		isoLetter = alphabet.substring(i, i+1);
        		if (isoLetter.indexOf(keyphrase) > -1)
        		{
        			int dupLocation = alphabet.indexOf(isoLetter);
        			before = alphabet.substring(i, dupLocation);
        			after = alphabet.substring(dupLocation + 1);
        			cipher = before + after;
        		}
        	}
        }
        
        cipher = cipher + keyphrase;
        
    }
}
