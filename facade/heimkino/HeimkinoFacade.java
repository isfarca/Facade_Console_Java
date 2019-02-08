package headfirst.facade.heimkino;

public class HeimkinoFacade {
	Verstaerker verst�rker;
	Tuner tuner;
	DvdSpieler dvd;
	CdSpieler cd;
	Beamer beamer;
	Beleuchtung beleuchtung;
	Leinwand leinwand;
	PopcornMaschine popcorn;
 
	public HeimkinoFacade(Verstaerker amp, 
				 Tuner tuner, 
				 DvdSpieler dvd, 
				 CdSpieler cd, 
				 Beamer beamer, 
				 Leinwand leinwand,
				 Beleuchtung beleuchtung,
				 PopcornMaschine popcorn) {
 
		this.verst�rker = amp;
		this.tuner = tuner;
		this.dvd = dvd;
		this.cd = cd;
		this.beamer = beamer;
		this.leinwand = leinwand;
		this.beleuchtung = beleuchtung;
		this.popcorn = popcorn;
	}
 
	public void filmSchauen(String film) {
		System.out.println("Machen Sie sich bereit, der Film f�ngt gleich an...");
		popcorn.ein();
		popcorn.starten();
		beleuchtung.dimmen(10);
		leinwand.runter();
		beamer.ein();
		beamer.breitwandModus();
		verst�rker.ein();
		verst�rker.setDvd(dvd);
		verst�rker.setSurroundSound();
		verst�rker.setLautst�rke(5);
		dvd.ein();
		dvd.spielen(film);
	}
 
 
	public void filmBeenden() {
		System.out.println("Fahre Heimkino herunter ...");
		popcorn.aus();
		beleuchtung.ein();
		leinwand.hoch();
		beamer.aus();
		verst�rker.aus();
		dvd.anhalten();
		dvd.auswerfen();
		dvd.aus();
	}

	public void listenToCd(String cdTitle) {
		System.out.println("Get ready for an audiopile experence...");
		beleuchtung.ein();
		verst�rker.ein();
		verst�rker.setLautst�rke(5);
		verst�rker.setCd(cd);
		verst�rker.setStereoSound();
		cd.ein();
		cd.spielen(cdTitle);
	}

	public void endCd() {
		System.out.println("Shutting down CD...");
		verst�rker.aus();
		verst�rker.setCd(cd);
		cd.auswerfen();
		cd.aus();
	}

	public void listenToRadio(double frequency) {
		System.out.println("Tuning in the airwaves...");
		tuner.ein();
		tuner.setFrequenz(frequency);
		verst�rker.ein();
		verst�rker.setLautst�rke(5);
		verst�rker.setTuner(tuner);
	}

	public void endRadio() {
		System.out.println("Shutting down the tuner...");
		tuner.aus();
		verst�rker.aus();
	}
}
