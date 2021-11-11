public class Lampada{

    private boolean situacaoLampada;

    public boolean issituacaoLampada(){
        return situacaoLampada;
    }

    public void setSituacaoLampada(boolean situacaoLampada) {
        this.situacaoLampada = situacaoLampada;
    }
  
     public boolean ligar(){
           return situacaoLampada=true;
    }
    public void desligar(){
           situacaoLampada=false;
    }

    public boolean isSituacaoLampada() {
        return false;
    }
}
