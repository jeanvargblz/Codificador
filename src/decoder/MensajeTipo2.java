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
public class MensajeTipo2 {
    private String header;
    private String param;
    private String deviceId;
    private String analog1;
    private String analog2;
    private String fecha;
    private String estado;
    private String rumbo;
    private String hora;
    
    public MensajeTipo2(){
        
    }

    @Override
    public String toString() {
        return "MensajeTipo2{" + "header=" + header + ", param=" + param + ", deviceId=" + deviceId + ", analog1=" + analog1 + ", analog2=" + analog2 + ", fecha=" + fecha + ", estado=" + estado + ", rumbo=" + rumbo + ", hora=" + hora + '}';
    }
    

    public MensajeTipo2(String header, String param, String deviceId, String analog1, String analog2, String fecha, String estado, String rumbo, String hora) {
        this.header = header;
        this.param = param;
        this.deviceId = deviceId;
        this.analog1 = analog1;
        this.analog2 = analog2;
        this.fecha = fecha;
        this.estado = estado;
        this.rumbo = rumbo;
        this.hora = hora;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public void setAnalog1(String analog1) {
        this.analog1 = analog1;
    }

    public void setAnalog2(String analog2) {
        this.analog2 = analog2;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setRumbo(String rumbo) {
        this.rumbo = rumbo;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getHeader() {
        return header;
    }

    public String getParam() {
        return param;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getAnalog1() {
        return analog1;
    }

    public String getAnalog2() {
        return analog2;
    }

    public String getFecha() {
        return fecha;
    }

    public String getEstado() {
        return estado;
    }

    public String getRumbo() {
        return rumbo;
    }

    public String getHora() {
        return hora;
    }
    

    
}
