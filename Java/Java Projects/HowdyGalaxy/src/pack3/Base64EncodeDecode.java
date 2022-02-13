package pack3;

import java.util.Base64;

public class Base64EncodeDecode {
	public static void main(String[] args) {
		// Getting encoder
		Base64.Encoder encoder = Base64.getEncoder();
		// Encoding string
		String eStr = encoder.encodeToString("JavaTpoint".getBytes());
		System.out.println("Encoded string: " + eStr);
		// Getting decoder
		Base64.Decoder decoder = Base64.getDecoder();
		// Decoding string
		String dStr = new String(decoder.decode(eStr));
		System.out.println("Decoded string: " + dStr);

		// Getting encoder
		Base64.Encoder encoder1 = Base64.getUrlEncoder();
		// Encoding URL
		String eStr1 = encoder1.encodeToString("http://www.javatpoint.com/java-tutorial/".getBytes());
		System.out.println("Encoded URL: " + eStr1);
		// Getting decoder
		Base64.Decoder decoder1 = Base64.getUrlDecoder();
		// Decoding URl
		String dStr1 = new String(decoder1.decode(eStr1));
		System.out.println("Decoded URL: " + dStr1);
	}

}
//Base64
//This class consists exclusively of static methods for obtaining encoders and decoders for the Base64 