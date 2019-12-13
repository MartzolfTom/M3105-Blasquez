package fr.unilim.iut.atm;



public class BankNotesBundle {

	BankNote bankNote;
	int numberOfNotes;

	public BankNotesBundle(BankNote bankNote, int numberOfNotes) {
		this.bankNote = bankNote;
		this.numberOfNotes = numberOfNotes;
	}

	@Override
	public String toString() {
		return ("" + this.numberOfNotes + " * " + this.bankNote.denomination());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bankNote == null) ? 0 : bankNote.hashCode());
		result = prime * result + numberOfNotes;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankNotesBundle other = (BankNotesBundle) obj;
		if (bankNote == null) {
			if (other.bankNote != null)
				return false; 
		} else if (!bankNote.equals(other.bankNote))
			return false;
		if (numberOfNotes != other.numberOfNotes)
			return false;
		return true;
	}

}
