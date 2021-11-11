public class TesteLampada {
    
    public static void main(String[]args){
        Lampada l =new Lampada();

        l.ligar();

        if(l.issituacaoLampada()){
            System.out.println("Lampada ligada");
        }
        else{
            System.out.println("Lampada desligada");
        }
    }
}
