package aiac.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import aiac.project.entities.Personne;

public interface IPersonne extends JpaRepository<Personne, Integer>{
	
	@Query("from personne p where p.bureau=:bureau")
	public Personne findByBureau(@Param("bureau")String bureau);
	
	@Query("select bureau from personne p where p.nom=:nom")
	public String findByNom(@Param("nom")String nom);
	
	@Transactional
	public void deleteByNom(@Param("nom")String nom);
	
}
