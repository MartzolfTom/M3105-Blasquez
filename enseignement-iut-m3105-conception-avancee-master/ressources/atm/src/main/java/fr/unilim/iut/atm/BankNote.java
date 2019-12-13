package fr.unilim.iut.atm;


 class BankNote {

	int value;
	String currency;

	public BankNote(int value, String currency) {
		this.value = value;
		this.currency = currency;
	}

	public String denomination() {
		return ("" + this.value + " " + this.currency);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + value;
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
		BankNote other = (BankNote) obj;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (value != other.value)
			return false;
		return true;
	}

}
