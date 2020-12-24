package comm;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;
import static javax.persistence.EnumType.STRING;


@Entity

public class Course implements Serializable {

	@Id
	private int id;	
	@Column(nullable = true, length = 50)
	private String coursename;
	private int price;
	@Enumerated(STRING)
	private Level level;
	private int duration;
	private LocalDate startdate;
	
	private static final long serialVersionUID = 1L;

	private enum Level{
		Basic,Intermediate,Advance
	}
	public Course() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
   
}
