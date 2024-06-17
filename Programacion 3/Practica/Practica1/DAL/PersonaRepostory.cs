using Entity;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DAL
{
    public class PersonaRepostory
    {
        string ruta = "Personas.txt";
        List<Persona> listaPersona;
        public void Guardar(Persona persona)
        {
            FileStream file = new FileStream(ruta, FileMode.Append);
            StreamWriter escritor = new StreamWriter(file);
            escritor.WriteLine($"{persona.Identificacion};{persona.Nombre};{persona.Telefono}");
            escritor.Close();
            file.Close();
        }

    }
}
