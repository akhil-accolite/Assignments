package hibernate.pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Table(name = "students")
@Entity
public class Student {
	
	@Id
	@Column(name = "id")
	int id;
	@Column(name = "name")
	String name;
	
	 @OneToMany(mappedBy="studentId", fetch=FetchType.EAGER) 
	  public List<Course> courses;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name "+getName()+" id "+getId();
	}

}
