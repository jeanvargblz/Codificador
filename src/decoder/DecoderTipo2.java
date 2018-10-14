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
public class DecoderTipo2 implements IDecoder{
    
    private MensajeTipo2 m;
    private String trama;
    public DecoderTipo2(){
        
    }
    public DecoderTipo2(String s){
        
        this.trama= s;
        run();
        
    }
    @Override
    public  void run(){
        DecoderTipo2 deco= new DecoderTipo2();
        m=new MensajeTipo2();
        System.out.println(deco.decoder_hora(trama).substring(0,7));
        if(deco.decoder_hora(trama)!=null && Integer.parseInt(deco.decoder_hora(trama).substring(0,1))>=0 && Integer.parseInt(deco.decoder_hora(trama).substring(2,3))>=0 && Integer.parseInt(deco.decoder_hora(trama).substring(4,6))>=0 ){
        System.out.println("HORA CORRECTA");
        
        m.setAnalog1(deco.decoder_analog1(trama));
        m.setAnalog2(deco.decoder_analog2(trama));
        m.setDeviceId(deco.decoder_deviceId(trama));
        m.setEstado(deco.decoder_estado(trama));
        m.setFecha(deco.decoder_fecha(trama));
        m.setHeader(deco.decoder_header(trama));
        m.setHora(deco.decoder_hora(trama));
        m.setParam(deco.decoder_param(trama));
        m.setRumbo(deco.decoder_rumbo(trama));
        }
        else{
            System.out.println("HORA INCORRECTA");
        }
        
    }
    
    public void Mostrar(){
        System.out.println(m);
        
    }

}
