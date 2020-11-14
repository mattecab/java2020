package model;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@Entity
@Table (name="book")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
    private String name;
        
        public Book(Integer id, String name) {
        	this.id=id;
        	this.name=name;
        	
        }
        public Book(String name) {
        this.name=name;	
        }
        

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
}
