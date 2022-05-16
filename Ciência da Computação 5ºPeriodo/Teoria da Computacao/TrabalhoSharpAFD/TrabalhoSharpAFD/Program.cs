using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TrabalhoSharpAFD
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int escolha = 1;
            Sistema sistema = Menu();

            do {
                Console.WriteLine("Digite...");
                string palavra = Console.ReadLine();

                if (sistema.IsValid(palavra, sistema))
                {
                    string palavraTest = "";
                    sistema.estadoATUAL = sistema.ListaTransicao[0].EstadoUm;
                    foreach (var letra in palavra)
                        foreach (var item in sistema.ListaTransicao)
                            if (item.EstadoUm.Equals(sistema.estadoATUAL) && item.NextItem.Equals(letra.ToString()))
                            {
                                sistema.estadoATUAL = item.EstadoDois;
                                Console.WriteLine("({0}) ----({1})---- ({2})", item.EstadoUm, item.NextItem, sistema.estadoATUAL);
                                palavraTest += letra;
                                break;
                            }
                    Console.WriteLine(sistema.IsValid(sistema,palavra,palavraTest) ? "Correto" : "Errado");
                }
                else
                    Console.WriteLine("Erro...");

                Console.WriteLine("Continuar....[1]Sim");
                escolha = int.Parse(Console.ReadLine());
            }while (escolha == 1) ;

            Console.ReadLine();
        }
        //Menu de Escolha Usuario
        public static Sistema Menu()
        {
            Console.WriteLine("--Bem Vindo--");
            Console.WriteLine("Deseja simular AFD ?");
            int opc = int.Parse(Console.ReadLine());
            if (opc == 1)
            {

                Console.WriteLine("Inserir AFD manualmente: [1]");
                Console.WriteLine("Inserir AFD por arquivo: [2]");
                int opc2 = int.Parse(Console.ReadLine());
                switch (opc2)
                {
                    case 1:
                        return new Sistema(GravarArquivo());
                    case 2:
                        return new Sistema();
                }
            }
            return null;
        }
        //Opcao de Inserir valores no arquivo Manualmente
        public static string GravarArquivo()
        {
            FileInfo aFile = new FileInfo(@"C:\Users\iagoa\source\repos\TrabalhoSharpAFD\TrabalhoSharpAFD\Dados3.txt");
            StreamWriter sw = new StreamWriter(@"C:\Users\iagoa\source\repos\TrabalhoSharpAFD\TrabalhoSharpAFD\Dados3.txt");

            Console.WriteLine("Numero de Estados:");
            int numEstados = int.Parse(Console.ReadLine());
            for (int i = 0; i < numEstados; i++)
            {
                sw.Write("S" + i.ToString() + " ");
            }
            sw.WriteLine();

            Console.WriteLine("Alfabeto:");
            string Alfabeto = Console.ReadLine();
            foreach(var letra in Alfabeto)
            {
                if(letra.Equals('d'))
                    for (int j = 0; j <= 9; j++)
                        if(j == 9)
                            sw.Write(j.ToString());
                        else
                            sw.Write(j.ToString() + " ");
                else
                    sw.Write(letra.ToString());
            }

            sw.WriteLine();

            Console.WriteLine("Estado Inicial:");
            var estadoIni = Console.ReadLine();
            sw.WriteLine(estadoIni.ToString());

            Console.WriteLine("Estado Final:");
            var estadoFim = Console.ReadLine();
            sw.WriteLine(estadoFim.ToString());

            Console.WriteLine("Transições:");
            while (true)
            {
                Console.WriteLine("Transicao: ");
                string tr = Console.ReadLine();
                if (tr == "-1")
                    break;
                sw.WriteLine(tr);
            }
            sw.Close();

            return aFile.DirectoryName + "\\Dados3.txt";
        }
    }
}
