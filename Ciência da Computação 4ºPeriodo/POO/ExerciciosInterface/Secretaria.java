package ExerciciosInterface;

public class Secretaria extends Funcionario implements IPrioridade{
    
    private String idioma;
    public Secretaria(String nome,String endereco,String codigo,Double salario,String idioma) {
        super(nome,endereco,codigo,salario);
        setIdioma(idioma);
    }//Iago Antunes Ferreira
    public String getIdioma() {
        return idioma;
    }
    private void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    @Override
    public boolean autentica() {
        return idioma.equalsIgnoreCase("INGLES")? true:false;

    }
    @Override
    public String Escrever(){
        return super.Escrever() + "\nIdioma:"+idioma;
    }
}
