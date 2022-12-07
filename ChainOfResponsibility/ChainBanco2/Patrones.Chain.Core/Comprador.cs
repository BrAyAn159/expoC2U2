using System;

namespace TD.Patrones.Chain
{
    public class Comprador : Aprobador
    {
        public override void Procesar(Compra c)
        {
            if (c.Importe < 100)
            {
                Console.WriteLine(string.Format("Compra aprobada por el {0}", this.GetType().Name));
            }
            else
            {
                _siguiente.Procesar(c);
            }
        }
    }
}