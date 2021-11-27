package ClassesMetodosAbstratos.Exercicio02;

import java.util.ArrayList;

public class main {
    public static void main(String args[]) {

        var colecao = new ArrayList<professor>();//Iago Antunes Ferreira
        
        colecao.add(new professorDedicacaoExclusiva(123, "Joao", "M", "1955/02/23", "1970/03/20"));
        colecao.add(new professorHorista(234, "Maria", "F", "1970/06/30", "1990/01/12", 220, 8));
        colecao.add(new professorVisitante(567, "Luiz", "M", "1990/08/28", "2010/04/16", 100, 9, "UFRJ"));
        
        for (professor p : colecao) {
            System.out.println("Nome..."+p.getNome() + "\nSalario..."+p.retornaSalario());
            System.out.println(p.anosAposentar());
            System.out.println();
        }
    }
}
