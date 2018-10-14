/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoder;



/**
 *
 * @author Jean
 */
public interface IDecoder  extends Convertidor  {
    
    public void run();
    default String decoder_header(String s){
        return hex2decimal(s.substring(0,14))+""; 
    }
    
    default String decoder_param(String s){
        return hex2decimal(s.substring(15,26))+""; 
    };
    default String decoder_deviceId(String s){
            return hex2decimal(s.substring(27,93))+""; 
    }
    default String decoder_analog1(String s){
            return hex2decimal(s.substring(94,99))+""; 
    }
    default String decoder_analog2(String s){
            return hex2decimal(s.substring(100,105))+""; 
    }
    default String decoder_fecha(String s){
  
            return hex2decimal(s.substring(105,107))+" "+hex2decimal(s.substring(108,110))+" "+hex2decimal(s.substring(111,113))+" ";         
    }
    
    default String decoder_estado(String s){
            return hex2decimal(s.substring(114,116))+""; 
    }
    default Double decoder_latitud(String s){
        //
            double x=Double.parseDouble(hex2decimal("FF FF FF FF")+"");
            return (x-Double.parseDouble(hex2decimal(s.substring(117, 128))+""))/1000000; 
    }   
    default Double decoder_longitud(String s){
        double x=Double.parseDouble(hex2decimal("FF FF FF FF")+"");
                    return (x-Double.parseDouble(hex2decimal(s.substring(129, 140))+""))/1000000; 
    }
    
    default double decoder_velocidad(String s){
        return Double.parseDouble(hex2decimal(s.substring(141,146))+"");
    }
    default String decoder_rumbo(String s){
        return hex2decimal(s.substring(147,152))+"";  
    }
    default String decoder_hora(String s){
       
       // System.err.println(s.substring(153,162));
            return hex2decimal(s.substring(153,155))+" "+hex2decimal(s.substring(156,158))+" "+hex2decimal(s.substring(159,161))+" ";         
   
            }
    default double decoder_altitud(String s){
        double x=Double.parseDouble(hex2decimal("FF FF FF FF")+"");
       return (x-Double.parseDouble(hex2decimal(s.substring(163, 171))+""))/1000000; 
    } 
    
    
        
}
