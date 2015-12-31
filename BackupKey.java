import java.util.HashMap;

public class BackupKey
{
	private String alphabet;
	private int shift;
	private String cipher;
	
	public BackupKey(String nAlphabet, int nShift)
	{
		alphabet = nAlphabet;
		shift = nShift;
	}
	
	public String createCipher()
	{
			String before = "";
			String after = "";
			before = alphabet.substring(0, shift);
			after = alphabet.substring(shift);
			cipher = after + before;
			return cipher;
	}
	
	public String removeDuplicates()
	{
		HashMap<Character, Integer> mapping = new HashMap<Character, Integer>();
		for (int i = 0; i < alphabet.length(); i++)
		{
			mapping.put(Character.valueOf(alphabet.charAt(i)), Integer.valueOf(0));
		}
		for (int i = alphabet.length() - 1; i >= 0; i--)
		{
			if (!mapping.containsKey(Character.valueOf(alphabet.charAt(i))))
			{
				return "Contains non-letter characters";
			}
			else
			{
				int intConversion = mapping.get(Character.valueOf(alphabet.charAt(i))).intValue();
				intConversion ++;
				Integer newValue = Integer.valueOf(intConversion);
				mapping.put(Character.valueOf(alphabet.charAt(i)), newValue);
			}
		}
		for (int i = alphabet.length() - 1; i >= 0; i--)
		{
			if(mapping.get(Character.valueOf(alphabet.charAt(i))).intValue() > 1)
			{
				int intConversion = mapping.get(Character.valueOf(alphabet.charAt(i))).intValue();
				intConversion--;
				Integer newValue = Integer.valueOf(intConversion);
				mapping.put(Character.valueOf(alphabet.charAt(i)), newValue);
				alphabet = alphabet.substring(0, i) + alphabet.substring(i + 1);
			}
		}
		
		alphabet.toString();
		return alphabet;
		}
		
	}
	
	public String toString()
	{
		return this.alphabet;
	}
}
