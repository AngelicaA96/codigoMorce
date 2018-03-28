package modelo;
//ANGELICA ARIADNA ESPINOSA ROY
//ING. EN INFORMATICA 
//INSTITUTO TECNOLOGICO DE ZITACUARO
import javax.swing.JOptionPane;

public class CodigoMorse {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "1.- Español a Morse\n"
				+ "2.-Morse a Español");
		int n = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Digita la opcion escogida"));
		switch (n) {
		case 1:
			String cadena = JOptionPane.showInputDialog(null,
					"Ingresa una cadena");
			char c;
			String cad = " ";
			for (int i = 0; i < cadena.length(); i++) {
				c = cadena.charAt(i);
				if (c == 'a' || c == 'A') {
					cad = cad + ".-";
				}
				if (c == 'b' || c == 'B') {
					cad = cad + "-...";
				}
				if (c == 'c' || c == 'C') {
					cad = cad + "-.-.";
				}
				if (c == 'd' || c == 'D') {
					cad = cad + "-..";
				}
				if (c == 'e' || c == 'E') {
					cad = cad + ".";
				}
				if (c == ' ') {
					cad = cad + "   ";
				}
				if (c == 'f' || c == 'F') {
					cad = cad + "..-.";
				}
				if (c == 'g' || c == 'G') {
					cad = cad + "--.";
				}
				if (c == 'h' || c == 'H') {
					cad = cad + "....";
				}
				if (c == 'i' || c == 'I') {
					cad = cad + "..";
				}
				if (c == 'j' || c == 'J') {
					cad = cad + ".---";
				}
				if (c == 'k' || c == 'K') {
					cad = cad + "-.-";
				}
				if (c == 'l' || c == 'L') {
					cad = cad + ".-..";
				}
				if (c == 'm' || c == 'M') {
					cad = cad + "--";
				}
				if(c=='n'||c=='N'){
					cad =cad+"-.";
				}
				if (c == 'o' || c == 'O') {
					cad = cad + "---";
				}
				if (c == 'p' || c == 'P') {
					cad = cad + ".--.";
				}
				if (c == 'q' || c == 'Q') {
					cad = cad + "--.-";
				}
				if (c == 'r' || c == 'r') {
					cad = cad + ".-.";
				}
				if (c == 's' || c == 'S') {
					cad = cad + "...";
				}
				if (c == 't' || c == 'T') {
					cad = cad + "-";
				}
				if (c == 'u' || c == 'U') {
					cad = cad + "..-";
				}
				if (c == 'v' || c == 'V') {
					cad = cad + "...-";
				}
				if (c == 'w' || c == 'W') {
					cad = cad + ".--";
				}
				if (c == 'x' || c == 'X') {
					cad = cad + "-..-";
				}
				if (c == 'y' || c == 'Y') {
					cad = cad + "-.--";
				}
				if (c == 'z' || c == 'Z') {
					cad = cad + "--..";
				}
				if (c == '1') {
					cad = cad + ".----";
				}
				if (c == '2') {
					cad = cad + "..---";
				}
				if (c == '3') {
					cad = cad + "...--";
				}
				if (c == '4') {
					cad = cad + "....-";
				}
				if (c == '5') {
					cad = cad + ".....";
				}
				if (c == '6') {
					cad = cad + "-....";
				}
				if (c == '7') {
					cad = cad + "--...";
				}
				if (c == '8') {
					cad = cad + "---..";
				}
				if (c == '9') {
					cad = cad + "----.";
				}
				if (c == '0') {
					cad = cad + "-----";
				}
			}
			System.out.println(""+cadena + " = " + cad);

			break;
		case 2:
			String cadena1;
			cadena1 = JOptionPane.showInputDialog(null, "Ingresa codigo Morse");
			String letra="abcdefjhijklmnopqrstuvwxyz1234567890";
			
			String codigo[]=new String[60];
			String morse=" ";//separacion enttre simbolos
			codigo[0]=".-";//letra A	
			codigo[1]="-..";//letra B
			codigo[2]="-.-.";//letra C
			codigo[3]="-..";//letra D
			codigo[4]=".";//letra E
			codigo[5]="..-.";//letra F
			codigo[6]="--.";//letra G
			codigo[7]="....";//letra H
			codigo[8]="..";//letra I
			codigo[9]=".---";//letra J
			codigo[10]="-.-";//letra K
			codigo[11]=".-..";//letra L
			codigo[12]="--";//letra M
			codigo[13]="-.";//letra N
			codigo[14]="---";//letra O
			codigo[15]=".--.";//letra P
			codigo[16]="--.-";//letra Q
			codigo[17]=".--.";//letra R
			codigo[18]="-..";//letra S
			codigo[19]="-";//letra T
			codigo[20]="..-";//letra U
			codigo[21]="...-";//letra V
			codigo[22]=".--";//letra W
			codigo[23]="-..-";//letra X
			codigo[24]="-.--";//letra Y
			codigo[25]="--..";//letra Z
			codigo[26]=".----";//numero 1
			codigo[27]="..---";//numero 2
			codigo[28]="...--";//numero 3
			codigo[29]="....-";//numero 4
			codigo[30]=".....";//numero 5
			codigo[31]="-....";//numero 6
			codigo[32]="--...";//numero 7
			codigo[33]="---..";//numero 8
			codigo[34]="----.";//numero 9
			codigo[35]="-----";//numero 0
			codigo[36]="  ";//espacio
			String oracion[]=cadena1.split(" ");
			int max=oracion.length;		
			for(int i=0;i<max;i++){
				for(int j=0;j<60;j++)
					if(oracion[i].equals(codigo[j])){
						morse=morse+letra.charAt(j);
						break;
					}
					
			}
			//morse=morse.substring(1,morse.length());
			System.out.println(cadena1+"="+morse);	
		}
	}	
}
