public class Stret {
	static void stret(Obor obor, Rytier rytier) {
		rytier.utok(obor);
	}

	public static void main(String[] args) {
		Rytier[] r = new Rytier[110];
		Obor[] o = new Obor[110];

		for (int i = 0; i < 10; i++) {
			r[i] = new Rytier();
			r[i].energia = 40;
			o[i] = new ZlyObor();
			o[i].energia = 50;
			o[i].hladny = true;
		}

		for (int i = 10; i < 30; i++) {
			r[i] = new Rytier();
			r[i].energia = 40;
			o[i] = new ZlyObor();
			o[i].energia = 50;
		}

		for	(int i = 30; i < 40; i++) {
			r[i] = new Rytier();
			r[i].energia = 40;
			o[i] = new DobryObor();
			o[i].energia = 50;
		}

		for (int i = 40; i < 100; i++) {
			r[i] = new Rytier();
			r[i].energia = 40;
			o[i] = new Obor();
			o[i].energia = 50;
		}

		for (int i = 100; i < 110; i++) {
			r[i] = new SilnyRytier();
			r[i].energia = 40;
			o[i] = new Obor();
			o[i].energia = 50;
		}

		// slucka stretu s vypisom

		System.out.println("RYTIER & hladny ZLY OBOR");
		for (int i = 0; i < 110; i++) {
			stret(o[i], r[i]);
			if (i == 10)
				System.out.println("RYTIER & ZLY OBOR");
			else if (i == 30)
				System.out.println("RYTIER & DOBRY OBOR");
			else if (i == 40)
				System.out.println("RYTIER & OBOR");
			else if (i == 100)
				System.out.println("SILNY RYTIER & OBOR");

			System.out.println(i + ":"
					+ "rytier " + r[i].energia + " / "
					+ "obor " + o[i].energia);
		}
	}
}
