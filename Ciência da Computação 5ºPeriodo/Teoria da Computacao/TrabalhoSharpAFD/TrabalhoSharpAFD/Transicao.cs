using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TrabalhoSharpAFD
{
    public class Transicao
    {
        public string EstadoUm { get; set; }
        public string EstadoDois { get; set; }
        public string NextItem { get; set; }

        public Transicao()
        {

        }
    }
}
