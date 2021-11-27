package ClassesMetodosAbstratos.Exercicio01;

public class Aniversario extends CartaoWeb{
    public Aniversario(String nome) {//Iago Antunes Ferreira
        super(nome);
    }
    @Override
    public void showMessage() {
        System.out.println("\nPara..."+super.destinatario+"\nFeliz Aniversario!");     
    }
}
