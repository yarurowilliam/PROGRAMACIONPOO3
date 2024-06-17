using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Entity
{
    public class DetalleFactura : Factura
    {
        public string IdDetalleFactura { get; set; }
        public string IdProducto { get; set; }
        public string NombreProducto { get; set; }
        public int CantidadProductos { get; set; }
        public double PrecioUnitario { get; set; }
        public double PrecioTotal { get; set; }
    }
}
