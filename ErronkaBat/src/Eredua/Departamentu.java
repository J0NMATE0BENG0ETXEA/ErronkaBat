package Eredua;

public class Departamentu {
	private int KODEA;
	private String IZENA;
	private String KOKAPENA;
	private String DIZENA;
	
	public Departamentu() {
	}
	
	public Departamentu(int kODEA, String iZENA, String kOKAPENA, String dIZENA) {
		super();
		KODEA = kODEA;
		IZENA = iZENA;
		KOKAPENA = kOKAPENA;
		DIZENA = dIZENA;
	}

	public int getKODEA() {
		return KODEA;
	}

	public String getIZENA() {
		return IZENA;
	}

	public String getKOKAPENA() {
		return KOKAPENA;
	}

	public String getDIZENA() {
		return DIZENA;
	}

	public void setKODEA(int kODEA) {
		KODEA = kODEA;
	}

	public void setIZENA(String iZENA) {
		IZENA = iZENA;
	}

	public void setKOKAPENA(String kOKAPENA) {
		KOKAPENA = kOKAPENA;
	}

	public void setDIZENA(String dIZENA) {
		DIZENA = dIZENA;
	}

	public void sartuDatuak(String kODEA, String iZENA, String kOKAPENA, String dIZENA) {
		int i = Integer.parseInt(kODEA);
		KODEA = i;
		IZENA = iZENA;
		KOKAPENA = kOKAPENA;
		DIZENA = dIZENA;
	}
	
