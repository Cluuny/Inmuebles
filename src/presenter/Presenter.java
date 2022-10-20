package presenter;

import view.View;
//import model.Model;
import model.*;

import java.util.ArrayList;
import java.util.Collections;

public class Presenter {
		private View view;

		public Presenter(View view) {
				this.view = view;
		}

		public void start() {
				Casa casa = new Casa(1, 100, "Calle 1", 2500000, 3, 2);
				ApartamentoFamiliar apartamentoFamiliar = new ApartamentoFamiliar(2, 50, "Calle 2", 2000000, 2, 1, 50000);
				ApartamentoEstudio apartamentoEstudio = new ApartamentoEstudio(3, 30, "Calle 3", 1500000, 1);
				InmuebleComercial inmuebleComercial = new InmuebleComercial(4, 200, "Calle 4", 1000000, true, "Viva");
				InmuebleOficina oficina = new InmuebleOficina(5, 100, "Calle 5", 3000000, true, true);

				ArrayList<Inmueble> inmuebles = new ArrayList<Inmueble>();
				inmuebles.add(casa);
				inmuebles.add(apartamentoFamiliar);
				inmuebles.add(oficina);
				inmuebles.add(inmuebleComercial);
				inmuebles.add(apartamentoEstudio);

				Collections.sort(inmuebles);

				for(Inmueble inmueble : inmuebles) {
						view.print(inmueble.toString());
				}

		}

		public static void main(String[] args) {
			Presenter presenter = new Presenter(new View());
			presenter.start();
		}
}
