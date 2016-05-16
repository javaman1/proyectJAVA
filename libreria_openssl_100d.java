import java.util.*;
import java.io.*;






// crear_firma( "cacert.p12",  "caminero", "req.pem", "cert_user.pem");
//convertir_p12( "cert_user.pem", "privkey_user.pem", "ppppp", "cert_user.p12");
//crear_peticion();



public class libreria_openssl_100d
{
	



public native void convertir_p12(String certpem, String priveypem, String clave, String certp12);
static
	{
	System.loadLibrary("libreria_openssl_100d");

        }



public native void crear_firma(String namep12, String claveca,String nameReq, String certuser);
static
	{
	System.loadLibrary("libreria_openssl_100d");
	}







public native void crear_peticion( String key_length, String common_name, String mail_user, String countryName, String stateOrProvinceName, String localityName, String organizationName, String orgUnitName     );


static
	{
	System.loadLibrary("libreria_openssl_100d");
	}










public static void main(String[] args)
	{
		
		try{	


		InputStreamReader Flujo = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(Flujo);

		
		System.out.print("longitud Clave (1024, 2048, 4096): " );
		String key_length=teclado.readLine();
		
		System.out.print("common_name: " );
		String common_name=teclado.readLine();
	
		System.out.print("mail_user " );
		String mail_user=teclado.readLine();
	
		System.out.print("countryName: " );
		String countryName=teclado.readLine();
					
		System.out.print("stateOrProvinceName: " );
		String stateOrProvinceName=teclado.readLine();
						
		System.out.print("localityName: " );
		String localityName=teclado.readLine();
						
		System.out.print("organizationName: " );
		String organizationName=teclado.readLine();
						
		System.out.print("organizationalUnitName: " );
		String organizationalUnitName=teclado.readLine();
	
		
	

		libreria_openssl_100d una_libreria_openssl_100d = new libreria_openssl_100d();

		una_libreria_openssl_100d.crear_peticion(  key_length,   common_name,  mail_user,  countryName,  stateOrProvinceName,  localityName,  organizationName,  organizationalUnitName     );

	}


	catch(Exception e) {
	  System.out.println("Se produjo un error inesperado: "+e.getMessage());
	  }


		

		
	}
		
	}

