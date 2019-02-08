package headfirst.facade.heimkino;

public class HeimkinoTestlauf {
	public static void main(String[] args) {
		Verstaerker verst�rker = new Verstaerker("Super Verst�rker");
		Tuner tuner = new Tuner("Super AM/FM-Tuner", verst�rker);
		DvdSpieler dvd = new DvdSpieler("Super DVD-Spieler", verst�rker);
		CdSpieler cd = new CdSpieler("Super CD-Spieler", verst�rker);
		Beamer beamer = new Beamer("Super Beamer", dvd);
		Beleuchtung beleuchtung = new Beleuchtung("Kino-Beleuchtung");
		Leinwand leinwand = new Leinwand("Kino-Leinwand");
		PopcornMaschine popcorn = new PopcornMaschine("Poppi");
 
		HeimkinoFacade homeTheater = 
				new HeimkinoFacade(verst�rker, tuner, dvd, cd, 
						beamer, leinwand, beleuchtung, popcorn);
 
		homeTheater.filmSchauen("Million Dollar Baby");
		homeTheater.filmBeenden();
	}
}
