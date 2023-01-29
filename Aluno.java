package entities;

public class Aluno {

	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public double nFinal() {
		return n1 + n2 + n3;
	}
	
	public String result() {
		if(nFinal () > 60.0) {
			return "PASS";
		} else {
			return "FAILED";
		}
		}
	
	public double miss() {
			return 60.0 - nFinal();
	}
	
	public String toString() {
		if(nFinal() < 60.0) {
		return "FINAL GRADE = "
				+ String.format("%.2f", nFinal())
				+ String.format("%n")
				+ result()
				+ String.format("%n")
				+ "MISSING " 
				+ String.format("%.2f", miss())
				+ " POINTS";
						
		
		} else {
			return "FINAL GRADE = "
					+ String.format("%.2f", nFinal())
					+ String.format("%n")
					+ result();
		}
		}
	}

