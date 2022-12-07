using Patrones.Chain.Core;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TD.Patrones.Chain;

namespace Patrones.Chain.UI
{
    class Program
    {
        static void Main(string[] args)
        {
            var comprador = new Comprador();
            var gerente = new Gerente();
            var director = new Director();
            var directorGeneral = new DirectorGeneral();

            director.AgregarSiguiente(directorGeneral);
            gerente.AgregarSiguiente(director);
            comprador.AgregarSiguiente(gerente);

            var c = new Compra();
            double importe = 1;
            while (importe != 0)
            {
                Console.WriteLine("Ingrese el importe de la compra (0 para terminar)");
                importe = double.Parse(Console.ReadLine());
                c.Importe = importe;
                comprador.Procesar(c);
            }
        }
    }
}
