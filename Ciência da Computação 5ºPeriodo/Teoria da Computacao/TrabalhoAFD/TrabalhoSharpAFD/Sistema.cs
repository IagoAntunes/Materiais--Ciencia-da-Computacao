using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TrabalhoSharpAFD
{
    public class Sistema : IValidacao
    {

        #region Caracteristicas AFD
        public int nEstados { get; set; }
        public List<String> ListEstados { get; set; }
        public List<String> Alfabeto { get; set; }
        public string Iestado { get; set; }
        public List<string> Festado { get; set; }

        public string estadoATUAL { get; set; }


        public List<List<String>> Transicao = new List<List<string>>();
        public List<Transicao> ListaTransicao = new List<Transicao>();
        #endregion

        private string[] file { get; set; }

        public Sistema(string caminho = "C:\\Users\\iagoa\\source\\repos\\TrabalhoSharpAFD\\TrabalhoSharpAFD\\Dados.txt")
        {
            file = System.IO.File.ReadAllLines(caminho);
            RecebeDados(file);
            SeparaLista();
        }

        private void RecebeDados(string[] file)
        {
            nEstados = file[0].Split(' ').Count();
            ListEstados = file[0].Split(' ').ToList();
            Alfabeto = file[1].Split(' ').ToList();
            Iestado = file[2].ToUpper();
            Festado = file[3].ToUpper().Split(' ').ToList();
            for (int i = 4; i < file.Length; i++)
            {
                Transicao.Add(file[i].ToUpper().Split(' ').ToList());
            }
        }
        private void SeparaLista()
        {
            foreach (var item in Transicao)
            {
                ListaTransicao.Add(new Transicao { EstadoUm = item[0], EstadoDois = item[1], NextItem = item[2] });
            }

        }
        
        //Validacao Inicial
        public bool IsValid(string palavra, Sistema sistema)
        {
            //Verifica se a palavra esta de acordo com o alfabet
            //Verifica se a palavra esta de acordo com o alfabet
            //Verifica se a palavra esta de acordo com o alfabet
            //Verifica se a palavra esta de acordo com o alfabet
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
        //Validacao Final
        public bool IsValid(Sistema sistema)
        {
            //Verifica se o estadoAtual é o final
            if (true)
                if (!Festado.Contains(estadoATUAL))
                    return false;

            return true;
        }

    }
}
