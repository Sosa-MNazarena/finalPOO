package pooFinal;

import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		//grupoA
		Equipo qatar = new Equipo("Qatar", null);
		Equipo ecuador = new Equipo("Ecuador", null);
		Equipo paisesbajos = new Equipo("Paises Bajos", null);
		Equipo senegal = new Equipo("Senegal", null);
		//grupoB
		Equipo inglaterra = new Equipo("Inglaterra", null);
		Equipo estadosunidos = new Equipo("Estados Unidos", null);
		Equipo gales = new Equipo("Gales", null);
		Equipo iran = new Equipo("Iran", null);
		//grupoC
		Equipo argentina = new Equipo("Argentina", null);
		Equipo polonia = new Equipo("Polonia", null);
		Equipo mexico = new Equipo("Mexico", null);
		Equipo arabiasaudita = new Equipo("Arabia Saudita", null);
		//grupoD
		Equipo francia = new Equipo("Francia", null);
		Equipo dinamarca = new Equipo("Dinamarca", null);
		Equipo australia = new Equipo("Australia", null);
		Equipo tunez = new Equipo("Tunez", null);
		//grupoE
		Equipo espana = new Equipo("España", null);
		Equipo costarica = new Equipo("Costa Rica", null);
		Equipo alemania = new Equipo("Alemania", null);
		Equipo japon = new Equipo("Japón", null);
		//grupoF
		Equipo belgica = new Equipo("Bélgica", null);
		Equipo canada = new Equipo("Cánada", null);
		Equipo marruecos = new Equipo("Marruecos", null);
		Equipo croacia = new Equipo("Croacia", null);
		//grupoG
		Equipo brasil = new Equipo("Brasil", null);
		Equipo serbia = new Equipo("Serbia", null);
		Equipo suiza = new Equipo("Suiza", null);
		Equipo camerun = new Equipo("Camerún", null);
		//grupoH
		Equipo portugal = new Equipo("Portugal", null);
		Equipo ghana = new Equipo("Ghana", null);
		Equipo uruguay = new Equipo("Uruguay", null);
		Equipo coreasur = new Equipo("Corea del Sur", null);
		
		Grupo a = new Grupo("Grupo A", null, null, null);
		Grupo b = new Grupo("Grupo B", null, null, null);
		Grupo c = new Grupo("Grupo C", null, null, null);
		Grupo d = new Grupo("Grupo D", null, null, null);
		Grupo e = new Grupo("Grupo E", null, null, null);
		Grupo f = new Grupo("Grupo F", null, null, null);
		Grupo g = new Grupo("Grupo G", null, null, null);
		Grupo h = new Grupo("Grupo H", null, null, null);
		
		a.addEquipo(qatar);
		a.addEquipo(ecuador);
		a.addEquipo(paisesbajos);
		a.addEquipo(senegal);
		
		b.addEquipo(inglaterra);
		b.addEquipo(estadosunidos);
		b.addEquipo(gales);
		b.addEquipo(iran);
		
		c.addEquipo(argentina);
		c.addEquipo(polonia);
		c.addEquipo(mexico);
		c.addEquipo(arabiasaudita);
		
		d.addEquipo(francia);
		d.addEquipo(dinamarca);
		d.addEquipo(australia);
		d.addEquipo(tunez);
		
		e.addEquipo(espana);
		e.addEquipo(alemania);
		e.addEquipo(japon);
		e.addEquipo(costarica);
		
		f.addEquipo(belgica);
		f.addEquipo(croacia);
		f.addEquipo(marruecos);
		f.addEquipo(canada);
		
		g.addEquipo(brasil);
		g.addEquipo(serbia);
		g.addEquipo(suiza);
		g.addEquipo(camerun);
		
		h.addEquipo(portugal);
		h.addEquipo(uruguay);
		h.addEquipo(coreasur);
		h.addEquipo(ghana);
		
		crearPartidos(a);
	    crearPartidos(b);
	    crearPartidos(c);
	    crearPartidos(d);
	    crearPartidos(e);
	    crearPartidos(f);
	    crearPartidos(g);
	    crearPartidos(h);
	    
	    imprimirPartidos(a);
	    imprimirPartidos(b);
	    imprimirPartidos(c);
	    imprimirPartidos(d);
	    imprimirPartidos(e);
	    imprimirPartidos(f);
	    imprimirPartidos(g);
	    imprimirPartidos(h);
		
	}

		
	


private static void crearPartidos(Grupo grupo) {
    ArrayList<Equipo> equipos = grupo.getEquiposAgrupados();

    for (int i = 0; i < equipos.size(); i++) {
        for (int j = i + 1; j < equipos.size(); j++) {
            Equipo equipoLocal = equipos.get(i);
            Equipo equipoVisitante = equipos.get(j);

            Partido partido = new Partido(new Date(), equipoLocal, equipoVisitante, null);
            grupo.getPartidos().add(partido);
        }
    }
}

private static void imprimirPartidos(Grupo grupo) {
    System.out.println("Partidos de " + grupo.getDescripcionEtapa() + ":");
    for (Partido partido : grupo.getPartidos()) {
        System.out.println(partido.getEquipoLocal().getName() + " vs " + partido.getEquipoVisitante().getName());
    }
    System.out.println();
}

}
