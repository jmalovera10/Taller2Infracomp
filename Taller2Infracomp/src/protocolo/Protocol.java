package protocolo;

public class Protocol {
	
	//---------------------------------------
	//Comandos del protocolo
	//---------------------------------------
	
	public static final String HOLA = "HOLA";
	
	public static final String ACK = "ACK";
	
	public static final String ALGORITMOS = "ALGORITMOS";
	
	public static final String STATUS = "STATUS";
	
	public static final String OK = "OK";
	
	public static final String ERROR = "ERROR";
	
	public static final String CERTSRV = "CERTSRV";
	
	public static final String CERTCLNT = "CERTCLNT";
	
	public static final String INIT = "INIT";
	
	public static final String INFO = "INFO";
	
	//---------------------------------------
	//Cadenas de caracteres para algoritmos
	//---------------------------------------
	
	public static final String[] ALG_SIMETRICOS = {"DES","AES","Blowfish","RC4"};
	
	public static final String[] ALG_ASIMETRICOS = {"RSA"};
	
	public static final String[] ALG_HMAC = {"HMACMD5","HMACSHA1","HMACSHA256"};
}
