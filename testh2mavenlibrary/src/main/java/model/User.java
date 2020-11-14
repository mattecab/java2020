package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
@NamedQueries({
    @NamedQuery(name = "User.findByName",
            query = "SELECT b FROM User b WHERE b.name = :name"),
    @NamedQuery(name = "User.findAll",
            query = "SELECT b FROM User  b")})
//this is JPQL very similar to SQL
//it operates on entities, their fields, and their relationships
//NOT on database column names
//SELECT returnedEntity FROM entityName object WHERE whereClause
//FROM entityName object (object from class entityNAME)
//@namedQueries -> name + query

public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	
	public User() {}
	
        public User(String name) {
        this.name=name;	
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
