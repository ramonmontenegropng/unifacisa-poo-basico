package desafioExtra02;

public class Tarefa {
	public String tarefa;
	
	public Tarefa (String tarefa) {
		this.tarefa = tarefa;
	}

	public String getTarefa() {
		return tarefa;
	}

	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}

	@Override
	public String toString() {
		return "Tarefa [tarefa=" + tarefa + "]";
	}
	
}
