package br.edu.ifpb.es.daw;

import br.edu.ifpb.es.daw.dao.EmpregadoDAO;
import br.edu.ifpb.es.daw.dao.impl.EmpregadoDAOImpl;
import br.edu.ifpb.es.daw.model.Empregado;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class MainEmpregadoUpdate {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			EmpregadoDAO dao = new EmpregadoDAOImpl(emf);

			//save
			Empregado emp = new Empregado();

			emp.setCpf("157-883-766-04");
			emp.setNome("Pedro");
			emp.setSobreNome("Lucas");
			emp.setDataNascimento(LocalDate.of(2004,12,28));

			dao.save(emp);

			System.out.println(emp.toString());

			//update

			emp.setSobreNome("Melo");

			dao.update(emp);

			System.out.println(emp);

		}
	}

}
