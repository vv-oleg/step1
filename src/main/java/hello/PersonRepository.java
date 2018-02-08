package hello;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "person", path = "person")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

	List<Person> findByLastName(@Param("name") String name);

	//List<Person> findByCity(@Param("city") String city);|

	// find person by City
/*	@Query("SELECT p FROM Person p WHERE " +
			"p.city_id = :city_id")

	public List<City> findByCity(@Param("City") String city);*/

}
