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

}
