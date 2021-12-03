package ExerciciosInterface;
import java.util.ArrayList;

public class Cliente extends Pessoa implements IPrioridade{
//Iago Antunes Ferreira
    private ArrayList<Produto> produtos;
    private boolean ativo;
    public Cliente(String nome, String endereco) {
        super(nome, endereco);
        this.ativo = true;
        produtos = new ArrayList<Produto>();
    }
    public void AdicionaProdutos(Produto nomeProduto){
        if(nomeProduto != null)
            produtos.add(nomeProduto);
    }
    public void RemoveProduto(int index){
        if(index >= 0 || index < produtos.size())
            produtos.remove(index);
    }
    public void funcAtivareDesativar(){
        this.ativo = this.ativo ? false: true;
    }
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    @Override
    public boolean autentica() {
        if(ativo){
            return true;
        }
        return false;
    }

    @Override
    public String Escrever() {
        return "Nome:"+nome+"\nEndereco:"+endereco;
    }

    @Override
    public String mostraTipo() {
        return "Cliente";
    }
}
