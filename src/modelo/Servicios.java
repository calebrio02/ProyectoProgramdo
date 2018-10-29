package modelo;

public abstract class Servicios {
	
	Administrativos clienteAd = new Administrativos();
	Docentes clienteDo = new Docentes();
	Pensionados clientePe = new Pensionados();


public Administrativos getClienteAd() {
		return clienteAd;
	}


public void setClienteAd(Administrativos clienteAd) {
		this.clienteAd = clienteAd;
	}


public Docentes getClienteDo() {
		return clienteDo;
	}

public void setClienteDo(Docentes clienteDo) {
		this.clienteDo = clienteDo;
	}


public Pensionados getClientePe() {
		return clientePe;
	}


public void setClientePe(Pensionados clientePe) {
		this.clientePe = clientePe;
	}
public void EstableceDatosAdministrativos() {
	clienteAd.ingresarAdministrativos();
}
public void EstableceDatosDocente() {
	clienteDo.IngresaDocente();
}
public void EstableceDatosPensionado() {
	clientePe.IngresaPensionado();
}
public String MuestraDatosAdministrativos() {
	return clienteAd.RespuestaAdministrativos();
}
public String MuestraDatosDocentes() {
	return clienteDo.RespuestaDocente();
}
public String MuestraDatosPensionados() {
	return clientePe.RespuestaPensionado();
}
public abstract String toString();//metodo abstracto para correr en el arreglo

public abstract String Total();//metodo abstracto para mostrar el total que debe pagar el cliente de todos los servicios 

public abstract void Ingresar();//metodo abstracto para ingresar datos

public abstract String SoloNombre() ;//metodo abstracto para mostrar solo el nombre del cliente
}
