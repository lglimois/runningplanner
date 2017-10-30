package fr.sh.runningplanner.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.sh.runningplanner.model.RunTemplate;

public interface RunTemplateRepository extends CrudRepository<RunTemplate, Long>{
	List<RunTemplate> findById(int id);
}
 