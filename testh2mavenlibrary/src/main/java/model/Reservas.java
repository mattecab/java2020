package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
	@Table(name = "Reservas")
	@NamedQueries({
        @NamedQuery(name = "Reservas.findByName",
                query = "SELECT b FROM Reservas b WHERE b.name = :name"),
        @NamedQuery(name = "Reservas.findAll",
                query = "SELECT b FROM Reservas  b")
})
	//this is JPQL very similar to SQL
	//it operates on entities, their fields, and their relationships
	//NOT on database column names
	//SELECT returnedEntity FROM entityName object WHERE whereClause
	//FROM entityName object (object from class entityNAME)
	//@namedQueries -> name + query
	
	public class Reservas {

		

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer id;
		private String name;
		
		public Reservas() {}
		
	        public Reservas(String name) {
	        this.name=name;	
	        }
	        
	        public Reservas(String name, Integer id)
	        {
	        	this.name=name;
	        	this.id=id;
	        }
	        public Integer getId() {
				return id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}	        
}

