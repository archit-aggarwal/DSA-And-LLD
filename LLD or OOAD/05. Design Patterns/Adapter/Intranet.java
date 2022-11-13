package Adapter;

import java.util.List;

// Data consumer
public class Intranet {
	IPhoneList source;

	public Intranet(IPhoneList source) {
		this.source = source;
	}

	public void printPhoneNumbers() {
		List<String> phones = this.source.getPhoneList();
		System.out.println(phones);
	}
}

