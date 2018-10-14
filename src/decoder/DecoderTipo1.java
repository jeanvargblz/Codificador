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
public class DecoderTipo1 implements IDecoder{ 
    
    private MensajeTipo1 m;
    private String trama;
    public DecoderTipo1(){
        
    }
    public DecoderTipo1(String s){
        
        this.trama= s;
        run();
        
    }
    @Override
    public  void run(){
        DecoderTipo1 deco= new DecoderTipo1();
        m=new MensajeTipo1();
        System.out.println(deco.decoder_fecha(trama).substring(0,8));
        if(deco.decoder_fecha(trama)!=null && Integer.parseInt(deco.decoder_fecha(trama).substring(5,7))>=12){
        m.setLatitud(deco.decoder_latitud(trama));
        m.setAltitud(deco.decoder_altitud(trama));
        m.setAnalog1(deco.decoder_analog1(trama));
        m.setAnalog2(deco.decoder_analog2(trama));
        m.setDeviceId(deco.decoder_deviceId(trama));
        m.setEstado(deco.decoder_estado(trama));
        m.setFecha(deco.decoder_fecha(trama));
        m.setHeader(deco.decoder_header(trama));
        m.setHora(deco.decoder_hora(trama));
        m.setLongitud(deco.decoder_longitud(trama));
        m.setParam(deco.decoder_param(trama));
        m.setRumbo(deco.decoder_rumbo(trama));
        m.setVelocidad(deco.decoder_velocidad(trama));

           }else{
            System.out.println("No es una fecha valida");
        }
    }
    
    public void Mostrar(){
        System.out.println(m);
        
    }
    
       

        
    
    
    
}
