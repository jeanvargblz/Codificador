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
public class DecoderTipo3 implements IDecoder{
 private MensajeTipo3 m;
    private String trama;
    public DecoderTipo3(){
    }
    public DecoderTipo3(String s){
        this.trama= s;
        run();
    }
    @Override
    public  void run(){
        DecoderTipo3 deco= new DecoderTipo3();
        m=new MensajeTipo3();
        m.setLatitud(deco.decoder_latitud(trama));
        m.setAltitud(deco.decoder_altitud(trama));
        m.setLongitud(deco.decoder_longitud(trama));
        m.setVelocidad(deco.decoder_velocidad(trama));
    }    
    public void Mostrar(){
        System.out.println(m);
        
    }   
}
