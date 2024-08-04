package pooFinal;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JOptionPane;

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
		Equipo canada = new Equipo("Canadá", null);
		Equipo marruecos = new Equipo("Maruecos", null);
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
		
		ArrayList<LocalDate> fechas = new ArrayList<>();
        int dia=0;
        while (dia<24) {
			dia++;
			fechas.add(LocalDate.of(2024, 7, dia));
		}
        
		
		Grupo a = new Grupo("GRUPO A", null, null, "GRUPO A");
		Grupo b = new Grupo("GRUPO B", null, null, "GRUPO B");
		Grupo c = new Grupo("GRUPO C", null, null, "GRUPO C");
		Grupo d = new Grupo("GRUPO D", null, null, "GRUPO D");
		Grupo e = new Grupo("GRUPO E", null, null, "GRUPO E");
		Grupo f = new Grupo("GRUPO F", null, null, "GRUPO F");
		Grupo g = new Grupo("GRUPO G", null, null, "GRUPO G");
		Grupo h = new Grupo("GRUPO H", null, null, "GRUPO H");
		
		ArrayList<Grupo> grupos = new ArrayList<>();
		grupos.add(a);
	    grupos.add(b);
	    grupos.add(c);
	    grupos.add(d);
	    grupos.add(e);
	    grupos.add(f);
	    grupos.add(g);
	    grupos.add(h);

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
		
		int fechaIndex = 0;

	    a.generarPartidos(fechas, fechaIndex);
        fechaIndex += 6;

        b.generarPartidos(fechas, fechaIndex);
        fechaIndex += 6;

        c.generarPartidos(fechas, fechaIndex);
        fechaIndex += 6;

        d.generarPartidos(fechas, fechaIndex);
        fechaIndex = 0;

        e.generarPartidos(fechas, fechaIndex);
        fechaIndex += 6;

        f.generarPartidos(fechas, fechaIndex);
        fechaIndex += 6;

        g.generarPartidos(fechas, fechaIndex);
        fechaIndex += 6;

        h.generarPartidos(fechas, fechaIndex);
	    
        a.generarResultados();
        b.generarResultados();
        c.generarResultados();
        d.generarResultados();
        e.generarResultados();
        f.generarResultados();
        g.generarResultados();
        h.generarResultados();
        
        a.imprimirPartidos();
        b.imprimirPartidos();
        c.imprimirPartidos();
        d.imprimirPartidos();
        e.imprimirPartidos();
        f.imprimirPartidos();
        g.imprimirPartidos();
        h.imprimirPartidos();

        imprimirPuntos(grupos);
        
        System.out.println("Puntos finales:");
        System.out.println("Grupo A");
        
        for (Equipo equipo : a.getEquiposAgrupados()) {
            System.out.println(equipo.getName() + ": " + equipo.getPuntos() + " puntos");
        }
        System.out.println();
        System.out.println("Grupo B");
        for (Equipo equipo : b.getEquiposAgrupados()) {
        	
            System.out.println(equipo.getName() + ": " + equipo.getPuntos() + " puntos");
        }
        System.out.println();
        System.out.println("Grupo C");
        for (Equipo equipo : c.getEquiposAgrupados()) {
        	
            System.out.println(equipo.getName() + ": " + equipo.getPuntos() + " puntos");
        }
        System.out.println();
        System.out.println("Grupo D");
        for (Equipo equipo : d.getEquiposAgrupados()) {
        	
            System.out.println(equipo.getName() + ": " + equipo.getPuntos() + " puntos");
        }
        System.out.println();
        System.out.println("Grupo E");
        for (Equipo equipo : e.getEquiposAgrupados()) {
        	
            System.out.println(equipo.getName() + ": " + equipo.getPuntos() + " puntos");
        }
        System.out.println();
        System.out.println("Grupo F");
        for (Equipo equipo : f.getEquiposAgrupados()) {
        	
            System.out.println(equipo.getName() + ": " + equipo.getPuntos() + " puntos");
        }
        System.out.println();
        System.out.println("Grupo G");
        for (Equipo equipo : g.getEquiposAgrupados()) {
        	
            System.out.println(equipo.getName() + ": " + equipo.getPuntos() + " puntos");
        }
        System.out.println();
        System.out.println("Grupo H");
        for (Equipo equipo : h.getEquiposAgrupados()) {
        	
            System.out.println(equipo.getName() + ": " + equipo.getPuntos() + " puntos");
        }
        
        
        EtapaMundial faseGrupos = new EtapaMundial("Fase de Grupos", new ArrayList<>());
        ArrayList<Equipo> equiposQueAvanzan = faseGrupos.getEquiposQueAvanzanDeGrupos(grupos);

        ArrayList<LocalDate> fechasOctavos = new ArrayList<>();
        int diaOctavos = 1;
        while (diaOctavos <= 8) { 
            fechasOctavos.add(LocalDate.of(2024, 8, diaOctavos));
            diaOctavos++;
        }
        EtapaMundial octavosDeFinal = new EtapaMundial("Octavos de Final", new ArrayList<>());
        octavosDeFinal.generarPartidosOctavos(equiposQueAvanzan, fechasOctavos);
        octavosDeFinal.generarResultados();

        octavosDeFinal.imprimirPartidos();
        ArrayList<Equipo> equiposQueAvanzanCuartos = octavosDeFinal.getEquiposQueAvanzanDeCuartos();
        ArrayList<LocalDate> fechasCuartos = new ArrayList<>();
        int diaCuartos = 9;
        while (diaCuartos <= 12) { 
            fechasOctavos.add(LocalDate.of(2024, 8, diaCuartos));
            diaCuartos++;
        }
    
        EtapaMundial cuartosDeFinal = new EtapaMundial("Cuartos de Final", new ArrayList<>());
        cuartosDeFinal.generarPartidosCuartos(equiposQueAvanzanCuartos, fechasCuartos);
        cuartosDeFinal.generarResultados();
        cuartosDeFinal.imprimirPartidos();
	}

	public static void imprimirPuntos(ArrayList<Grupo> grupos) {
		String mensaje = "";
		
		for (Grupo grupo : grupos) {
	        mensaje += "-PUNTOS DEL " + grupo.getNombreGrupo() + "-\n";
	        for (Equipo equipo : grupo.getEquiposAgrupados()) {
	            mensaje += equipo.getName() + " - " + equipo.getPuntos() + " puntos\n";
	        }
	        mensaje += "---------------\n";
	    }
	
	 JOptionPane.showMessageDialog(null, mensaje, "Puntos de Equipos", JOptionPane.INFORMATION_MESSAGE);
    
	}

}
