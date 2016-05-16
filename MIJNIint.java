
import java.util.*;
import java.io.*;


public class MIJNIint
{

	public native int getIncremento(int num);

	static
	{
		System.loadLibrary("MIJNIint");
	}



	public static void main(String[] args) throws IOException 
	{
        	int resultado;
		String key_length; 
		String common_name; 
		String mail_user;
		String countryName; 
		String stateOrProvinceName;
		String localityName;
		String organizationName;
		String orgUnitName;



			System.out.print("Introducir :" );
			Scanner sc =new Scanner(System.in);
			String strnum= sc.nextLine();
			int mynum=Integer.parseInt(strnum);
			System.out.print("key_length :" );
			key_length= sc.nextLine();
			System.out.print("common_name :" );
			common_name= sc.nextLine();
			System.out.print("mail_user :" );
			mail_user= sc.nextLine();
			System.out.print("countryName :" );
			countryName= sc.nextLine();
			System.out.print("stateOrProvinceName :" );
			stateOrProvinceName= sc.nextLine();
			System.out.print("localityName :" );
			localityName= sc.nextLine();
			System.out.print("organizationName :" );
			organizationName= sc.nextLine();
			System.out.print("orgUnitName :" );
			orgUnitName= sc.nextLine();






		//int mynum= 3;

		MIJNIint  oneint = new MIJNIint();
		resultado=oneint.getIncremento(mynum);
          	System.out.print(resultado);
		
		System.out.println("\n\n");
		System.out.print(key_length);

			InputStreamReader Flujo = new InputStreamReader(System.in);
			BufferedReader teclado = new BufferedReader(Flujo);
			System.out.print("Para salir Introducir una tecla: " );
			String NameFile4=teclado.readLine();
			System.exit(0);






  	}




}