package ar.edu.unlam.pb2clubNoHomeros;

import java.util.ArrayList;
import java.util.Iterator;

import junit.framework.Assert;

import org.junit.Test;

public class ClubTest {

	@Test
	public void queClubAdmitaClientes() {
		ClubDeLosNoHomeros miClub = new ClubDeLosNoHomeros();

		miClub.entranClientes(new Cliente("Zoilo", 16));
		miClub.entranClientes(new Cliente("Roberto", 23));
		miClub.entranClientes(new Cliente("Aldo", 35));

		Assert.assertTrue(miClub.getLosClientes().size() == 3);
		// Assert.assertEquals(3, miClub.getLosClientes().size());
	}

	@Test
	public void queNoAdmiteDuplicados() {
		ClubDeLosNoHomeros miClub = new ClubDeLosNoHomeros();

		miClub.entranClientes(new Cliente("Zoilo", 16));
		miClub.entranClientes(new Cliente("Aldo", 23));
		miClub.entranClientes(new Cliente("Aldo", 35));

		Assert.assertEquals(2, miClub.getLosClientes().size());

	}

	@Test
	public void queOrdenaPorNombre() {
		ClubDeLosNoHomeros miClub = new ClubDeLosNoHomeros();

		miClub.entranClientes(new Cliente("Zoilo", 16));
		miClub.entranClientes(new Cliente("Roberto", 23));
		miClub.entranClientes(new Cliente("Aldo", 35));

		Assert.assertTrue(miClub.getLosClientes().first().getNombre() == "Aldo");
	}

	@Test
	public void queOrdenaPorEdad() {
		ClubDeLosNoHomeros miClub = new ClubDeLosNoHomeros();

		miClub.entranClientes(new Cliente("Zoilo", 36));
		miClub.entranClientes(new Cliente("Roberto", 43));
		miClub.entranClientes(new Cliente("Aldo", 37));
		
		ArrayList<Cliente> a = miClub.mostrarClientesPorEdad();
		
		Iterator<Cliente> it = a.iterator();
		while (it.hasNext()){
			Cliente current = it.next();
			System.out.println("Cliente: " + current.getNombre() + " Edad: " + current.getEdad());;
	
		}

	}
}
