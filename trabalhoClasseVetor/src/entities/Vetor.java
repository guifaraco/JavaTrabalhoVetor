package entities;

public class Vetor {
	private Integer tamanho;
	private Student[]vet;
	
	public Vetor(int tamanho) {
		this.tamanho = tamanho;
		this.vet = new Student [tamanho];
	}
	
	public Integer getTamanho() {
		return tamanho;
	}

	public void insert(Student student) {
		for(int i = 0; i < getTamanho(); i++) {
			if(vet[i] == null) {
				vet[i] = student;
				break;
			}
		}
	}
	
	public void remove(int position) {
		vet[position] = null;
		if(position != getTamanho() - 1) {
			if((vet[position + 1]) != null) {
				for(int i = (position + 1); i < getTamanho(); i++ ) {
					vet[i - 1] = vet[i];
					vet[i] = null;
				}
			}
		}
	}
	
	public Student findElement(int position) {
		return vet[position];
	}
	
	public void showArray() {
		for(Student students : vet) {
			if (students != null) {
				System.out.println(students);
			}
		}
	}
}
