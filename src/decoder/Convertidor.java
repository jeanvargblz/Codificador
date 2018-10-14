/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoder;

public interface Convertidor {
	
    default  int hex2decimal(String s) {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
	/*
	public  String decimal2hex(int d) {
	    String digits = "0123456789ABCDEF";
	    if (d <= 0) return "0";
	    int base = 16;   // flexible to change in any base under 16
	    String hex = "";
	    while (d > 0) {
	        int digit = d % base;              // rightmost digit
	        hex = digits.charAt(digit) + hex;  // string concatenation
	        d = d / base;
	    }
	    return hex;
	}
	
	public  String getStringOfArray(byte[] data, int inicio, int fin) {
		StringBuilder sb = new StringBuilder();
		for(int i = inicio; i <=fin ; i++){
			sb.append(String.format("%02X", data[i]));
		}
	    return sb.toString();
	}

*/
}
