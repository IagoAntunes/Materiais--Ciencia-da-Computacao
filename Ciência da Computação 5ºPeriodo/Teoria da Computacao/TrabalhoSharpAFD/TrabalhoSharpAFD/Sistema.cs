using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TrabalhoSharpAFD
{
    public class Sistema : IValidacao
    {

        #region Caracteristicas AFD
        public int nEstados { get; set; }
        public string Iestado { get; set; }
        public string estadoATUAL { get; set; }
        public List<String> ListEstados { get; set; }
        public List<String> Alfabeto { get; set; }
        public List<string> Festado { get; set; }
        #endregion

        public List<List<String>> Transicao = new List<List<string>>();
        public List<Transicao> ListaTransicao = new List<Transicao>();

        private string[] file { get; set; }
        /// <summary>
        /// Construtor com Parametro Õpcional
        /// </summary>
        /// <param name="caminho"></param>
        public Sistema(string caminho = "C:\\Users\\iagoa\\source\\repos\\TrabalhoSharpAFD\\TrabalhoSharpAFD\\Dados.txt")
        {
            file = System.IO.File.ReadAllLines(caminho);
            RecebeDados(file);
            SeparaLista();
        }
        /// <summary>
        /// Recebe dados do arquivo e transforma em Objetos
        /// </summary>
        /// <param name="file"></param>
        private void RecebeDados(string[] file)
        {
            nEstados = file[0].Split(' ').Count();
            ListEstados = file[0].Split(' ').ToList();
            Alfabeto = file[1].ToLower().Split(' ').ToList();
            if (Alfabeto.Contains("d"))
                Alfabeto = AlteraAlfabeto(Alfabeto);
            Iestado = file[2].ToUpper();
            Festado = file[3].ToUpper().Split(' ').ToList();
            for (int i = 4; i < file.Length; i++)
                Transicao.Add(file[i].ToLower().Split(' ').ToList());
            //aaaa
        }
        /// <summary>
        /// Adiciona uma transição para cada numero inteiro
        /// </summary>
        private void SeparaLista()
        {
            foreach (var item in Transicao)
            {
                if(item[2] == "d")
                    for (int i = 0; i <= 9; i++)
                        ListaTransicao.Add(new Transicao { EstadoUm = item[0], EstadoDois = item[1], NextItem = i.ToString() });
                else
                    ListaTransicao.Add(new Transicao { EstadoUm = item[0], EstadoDois = item[1], NextItem = item[2] });
            }
        }
        /// <summary>
        /// Retorna uma nova lista com alfabeto de numeros inteiros
        /// </summary>
        /// <param name="Alfabeto"></param>
        /// <returns></returns>
        private List<string> AlteraAlfabeto(List<String> Alfabeto)
        {
            List<string> listaAlfabeto2 = new List<string>();
            foreach(var item in Alfabeto)
            {
                if(item != "d")
                    listaAlfabeto2.Add(item);
                else
                    for(int i = 0; i <= 9; i++)
                        listaAlfabeto2.Add(i.ToString());
            }
            return listaAlfabeto2;
        }
        /// <summary>
        /// Validação para Inicio do AFD
        /// </summary>
        /// <param name="palavra"></param>
        /// <param name="sistema"></param>
        /// <returns></returns>
        public bool IsValid(string palavra, Sistema sistema)
        {
            //Verifica se a palavra esta de acordo com o alfabet
            if (true)
            {
                int count = 0;
                foreach (var letra in palavra)
                {
                    if (Alfabeto.Contains(letra.ToString()))
                        count++;
                }
                if (palavra.Length != count)
                    return false;
            }
            //Verifica se o estado Inicial e Final esta na lista de estados
            if (true)
            {
                if (!ListEstados.Contains(Iestado))
                    return false;

                int count= (Festado.Where(item => ListEstados.Contains(item))).Count();
                if (count != Festado.Count)
                {
                    return false;
                }
            }
            //Verifica se o valor das transições esta no alfabeto
            if (true)
            {
                foreach (var item in ListaTransicao)
                {
                    if (!Alfabeto.Contains(item.NextItem))
                        return false;
                }
            }

            return true;
        }
        /// <summary>
        /// Validação Fim do AFD
        /// </summary>
        /// <param name="sistema"></param>
        /// <returns></returns>
        public bool IsValid(Sistema sistema,string palavra,string palavraTest)
        {
            //Verifica se o estadoAtual é o final
            if (!Festado.Contains(estadoATUAL.ToUpper()))
                return false;

            if (!palavra.Equals(palavraTest))
                return false;


            return true;
        }

    }
}
