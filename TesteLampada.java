public class TesteLampada {
    
    public static void main(String[]args){
        Lampada 1 =new Lampada();

        1.ligar();

        if(1.isSituacaoLampada){
            System.out.println("Lampada ligada");
        }
        else{
            System.out.println("Lampada desligada");
        }
    }
}
