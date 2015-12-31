public class BackupCipher
{
	private String cipher;
	private String pAlphabet;
	
	public BackupCipher(String alphabet, int shift)
	{
		cipher = this.createKey(alphabet, shift);
		pAlphabet = alphabet;
	}
	
    private String createKey(String alphabet, int shift)
	{
		String before = "";
		String after = "";
		before = alphabet.substring(0, shift);
		after = alphabet.substring(shift);
		cipher = after + before;
		return cipher;
	}
    
    public String getConversion(String c, boolean encrypt) throws InvalidFormatException
    {
    	if (cipher.indexOf(c) < 0 || pAlphabet.indexOf(c) < 0)
    	{
    		throw new InvalidFormatException("Character not in alphabet");
    	}
    	else if (encrypt)
	{
		return pAlphabet.substring(cipher.indexOf(c), cipher.indexOf(c) + 1);
	}
	else
	{
		return cipher.substring(pAlphabet.indexOf(c), pAlphabet.indexOf(c) + 1);
	}
    }

}
