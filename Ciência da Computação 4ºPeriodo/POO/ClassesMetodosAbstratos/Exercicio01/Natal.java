package ClassesMetodosAbstratos.Exercicio01;

public class Natal extends CartaoWeb {
    public Natal(String nome) {//Iago Antunes Ferreira
        super(nome);
    }
    @Override
    public void showMessage() {
        System.out.println("\nPara..."+super.destinatario+"\nFeliz Natal!");
    }
}
