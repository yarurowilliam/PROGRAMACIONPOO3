using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Entity
{
    public class Factura
    {
        public string IdFactura { get; set; }
        public string IdCliente { get; set; }
        public DateTime Fecha { get; set; }
        public double Total { get; set; }
    }
}
