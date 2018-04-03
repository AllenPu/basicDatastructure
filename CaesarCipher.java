//class for doing encryption and decryption using the Caesar Cipher
public class CaesarCipher {
	//encryption array
	protected char[] encoder = new char[26];
	//decryption array
	protected char[] decoder = new char[26];
	//constructor that initializes the encryption and decryption arrays
	public CaesarCipher(int rotation){
		for(int k=0;k<26;k++){
			encoder[k] = (char)('A'+(k+rotation)%26);
			decoder[k] = (char)('A'+(k-rotation+26)%26);			
		}
	}
	//return string representing encrypted message
	public String encrypt(String message){
		//use encoder array
		return transform(message,encoder);
	}
	//return decrypted message given encrypted secret
	public String decrypt(String secret){
		return transform(secret,decoder);
	}
	//return transformation of original string using given code
	private String transform(String original,char[] code){
		char[] msg=original.toCharArray();
		for(int k=0;k<msg.length;k++)
			if (Character.isUpperCase(msg[k])){		//we have a letter to change
				int j=msg[k]-'A';					//will be value from 0 to 25
				msg[k]=code[j];						//replace the characyer
			}
		return new String(msg);
		
	}
	
	public static void main(String[] args){
		CaesarCipher cipher = new CaesarCipher(3);
		System.out.println("encryption code = "+new String(cipher.encoder));
		System.out.println("decryption code = "+new String(cipher.decoder));
		String message="THE EAGLE IS IN PLAY;MEET AT JOE'S.";
		String coded=cipher.encrypt(message);
		System.out.println("secret:"+coded);
		String answer=cipher.decrypt(coded);
		System.out.println("Message:"+answer); 		//should be plaintext again
	}


}
