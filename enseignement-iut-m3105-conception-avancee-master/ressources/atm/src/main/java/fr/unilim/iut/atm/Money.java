package fr.unilim.iut.atm;


import java.util.Collections;

import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.joining;

public class Money {
	public static final Money NO = new Money(Collections.emptyList());

	private final List<BankNotesBundle> notes;

	public Money add(BankNotesBundle newNotes) {

		List<BankNotesBundle> updatedNotes = this.notes.stream().collect(Collectors.toList());

		updatedNotes.add(newNotes);
		return new Money(updatedNotes);
	}

	private Money(List<BankNotesBundle> notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return notes.stream()
				.map(BankNotesBundle::toString)
				.collect(joining());
	}

	public List<BankNotesBundle> getNotes() {
		return this.notes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
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
		Money other = (Money) obj;
		if (notes == null) {
			if (other.notes != null)
				return false;
		} else if (!notes.equals(other.notes))
			return false;
		return true;
	}

}
