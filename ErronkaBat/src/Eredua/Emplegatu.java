package Eredua;

public class Emplegatu {

	private int EKODEA;
	private int DKODEA;
	private String IZENA;
	private String ABIZENA;
	private String DATA;
	private String ORDUA;
	private String BETEBEHARRA;
	
	public Emplegatu() {
		
	}
	
	public Emplegatu(int eKODEA, int dKODEA, String iZENA, String aBIZENA, String dATA, String oRDUA,
			String bETEBEHARRA) {
		super();
		EKODEA = eKODEA;
		DKODEA = dKODEA;
		IZENA = iZENA;
		ABIZENA = aBIZENA;
		DATA = dATA;
		ORDUA = oRDUA;
		BETEBEHARRA = bETEBEHARRA;
	}

	public int getEKODEA() {
		return EKODEA;
	}

	public int getDKODEA() {
		return DKODEA;
	}

	public String getIZENA() {
		return IZENA;
	}

	public String getABIZENA() {
		return ABIZENA;
	}

	public String getDATA() {
		return DATA;
	}

	public String getORDUA() {
		return ORDUA;
	}

	public String getBETEBEHARRA() {
		return BETEBEHARRA;
	}

	public void setEKODEA(int eKODEA) {
		EKODEA = eKODEA;
	}

	public void setDKODEA(int dKODEA) {
		DKODEA = dKODEA;
	}

	public void setIZENA(String iZENA) {
		IZENA = iZENA;
	}

	public void setABIZENA(String aBIZENA) {
		ABIZENA = aBIZENA;
	}

	public void setDATA(String dATA) {
		DATA = dATA;
	}

	public void setORDUA(String oRDUA) {
		ORDUA = oRDUA;
	}

	public void setBETEBEHARRA(String bETEBEHARRA) {
		BETEBEHARRA = bETEBEHARRA;
	}
	
	public void sartuDatuak(int eKODEA, int dKODEA, String iZENA, String aBIZENA, String dATA, String oRDUA,
			String bETEBEHARRA) {
		EKODEA = eKODEA;
		DKODEA = dKODEA;
		IZENA = iZENA;
		ABIZENA = aBIZENA;
		DATA = dATA;
		ORDUA = oRDUA;
		BETEBEHARRA = bETEBEHARRA;
	}
	
	
}
