package Puerto;
public class Puerto {
    private Hub[] hub;
    public Puerto()
    {
        hub = new Hub[3];
        for (int i = 0; i < 3; i++) {
            hub[i] = new Hub();
        }
    }

    public boolean ApilarContenedor(Contenedor cont)
    {
        boolean apilado = false;

        for (int i = 0; i < 3; i++) {

            apilado = this.hub[i].apilar(cont);

            if (apilado)
            {
                break;
            }
        }

        return apilado;
    }

    public boolean DesapilarContenedor(int numHub, int numColumna)
    {
        return this.hub[numHub].desapilar(numColumna);
    }

    public Contenedor BuscarContenedor(int idContenedor)
    {
        Contenedor aux = null;
        for (int i = 0; i < 3; i++) {

            aux = this.hub[i].datosContenedor(idContenedor);

            if (aux != null)
            {
                break;
            }
        }
        return aux;
    }

    public int BuscarContenedoresPorPais(String pais)
    {
        int contador = 0;

        for (int i = 0; i < 3; i++) {

            contador += this.hub[i].cantidadContPais(pais);
        }

        return contador;
    }

    public String toString()
    {
        String mapa = "";

        for (int i = 0; i < 3; i++) {

            mapa += "Hub Nº " + (i + 1) + ":\n" + this.hub[i].toString() + "\n";

        }

        return mapa;
    }





    //Pedro Sola Ruiz Examen Trabajo Grupo A
    public Contenedor BuscarContenedor (int idContenedor){
        contenedor aux = null;
        for (int i = 0; i < 14; i++){
            aux = this.hub[i].datosContenedor(idContenedor);
            if (aux!=null){
                break
            }
        }
        return aux;
    }
    private int id;
    private int empresa;
    private int peso;
    private int inspeccionado;

    public boolean BuscarContenedor (int id; int empresa, String peso, int Inspeccionado){
        this.contenedor=contenedor;
        this.empresa=empresa;
        this.peso=peso;
        this.inspeccionado=inspeccionado;
    }
    public int getid() {
        return contenedor;
    }

    public void setid(String contenedor) {
        this.contenedor = contenedor;
    }

    public int getEmpresa() {
        return empresa;
    }

    public void setEmpresa(int empresa) {
        this.empresa= empresa;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getinspeccionado() {
        return inspeccinado;
    }

    public void setinspeccionado(int inspeccioando) {
        this.inspeccionado= inspeccioando;
    }

    public String toString(){
        String str = "ID" + id + ", Peso" + peso + ",Empresa" + empresa;
        if(inspeccionado) str += ", Ya ha sido inspeccionado";
        if(!inspeccionado) str += ", En espera de inspeccion";
    }
    public String toString(){
        String mapa = "";

        for (int i = 0; i < 3; i++) {

            mapa += "Hub Nº " + (i + 1) + ":\n" + this.hub[i].toString() + "\n";

        }

        return mapa;
    }


}
