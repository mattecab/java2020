package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK")
@NamedQueries({
    @NamedQuery(name = "Book.findByName",
            query = "SELECT b FROM Book b WHERE b.name = :name"),
    @NamedQuery(name = "Book.findAll",
            query = "SELECT b FROM Book b")
})
//this is JPQL very similar to SQL
//it operates on entities, their fields, and their relationships
//NOT on database column names
//SELECT returnedEntity FROM entityName object WHERE whereClause
//FROM entityName object (object from class entityNAME)
//@namedQueries -> name + query

public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	
	public Book() {}
	
        public Book(String name,Integer id) {
        this.name=name;
        this.id=id;
        }
        public Book(String name) {
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
		}}
