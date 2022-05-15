using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TrabalhoSharpAFD
{
    public class Transicao
    {
        public static int id { get; set; }
        public string EstadoUm { get; set; }
        public string EstadoDois { get; set; }
        public string NextItem { get; set; }

        public string nextEstado { get; set; }

        public Transicao()
        {
            id++;
            if (EstadoDois != null)
                if (!EstadoUm.Equals(EstadoDois))
                {
                    nextEstado = EstadoDois;
                }
        }
    }
}
