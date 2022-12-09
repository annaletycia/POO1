package pratica3;

public class Tempo {
private int hora, minuto, segundo;
    
    public Tempo(int h, int m, int s){
        this.setHora(h);
        this.setMin(m);
        this.setSeg(s);
    }
    public Tempo(int h, int m){
        this.setHora(h);
        this.setMin(m);
        this.setSeg(00);
    }
    public Tempo(int h){
        this.setHora(h);
        this.setMin(00);
        this.setSeg(00);
    }

    public String mostrarTempo(){
    	return this.hora+ ":"+this.minuto+":"+this.segundo;
    }

    public void incMin(){
        if(this.minuto == 59){
             this.minuto = 00;
             if(this.hora == 23) {
            	 this.hora = 00;
             }else {
             this.hora++;
             }
         }else{
          this.minuto++;
         }
     }
     
    public void decMin(){
        if(this.minuto == 00){
             this.minuto = 59;
             this.hora--;
         }else{
          this.minuto--;
         }
     }

    public void setHora(int h){
    	if(h<0 || h>23)
    		this.hora = 0;
    	else
    		this.hora = h;
    }
    public void setMin(int m){
    	if(m<0 || m>59)
    		this.minuto = 0;
    	else
    		this.minuto = m;
    }
    public void setSeg(int s){
    	if(s<0 || s>59)
    		this.segundo = 0;
    	else
    		this.segundo = s;
    }
    public int getHora(){
      return this.hora;
    }
    public int getMin(){
      return this.minuto;
    }
    public int getSeg(){
      return this.segundo;
    }
}
