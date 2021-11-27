package ClassesMetodosAbstratos.Exercicio01;

public class DiaDosNamorados extends CartaoWeb {
    public DiaDosNamorados(String nome) {//Iago Antunes Ferreira
        super(nome);
    }
    @Override
    public void showMessage() {
        System.out.println("\nPara..."+super.destinatario+"\nFeliz dia dos Namorados!");   
    }
}
