package SpringAssignment;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component("jdbcTemplateDao")
public class JDBCTemplateDao {
	public JDBCTemplateDao() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int saveStudent(Student student){
		String query = "insert into SprStudent values "
				+ "("+student.getStudentId()+",\""+student.getStudentName()+"\")";
		return jdbcTemplate.update(query);
	}

	////////////////////////////////////////// RESULTSET////////////////////////////////////////////////
	public List<Student> getAllStudents() {
		return jdbcTemplate.query("select * from SprStudent", new ResultSetExtractor<List<Student>>() {

			public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {

				List<Student> list = new ArrayList<Student>();
				while (rs.next()) {
					Student e = new Student();
					e.setStudentId(rs.getInt(1));
					e.setStudentName(rs.getString(2));
					list.add(e);
				}
				return list;
			}
		});
	}

//////////////////////////////////////////////ROWMAPPER////////////////////////////////////////////////
	public List<Student> getAllStudentsRowMapper() {
		return jdbcTemplate.query("select * from SprStudent LIMIT 0,5", new RowMapper<Student>() {

			public Student mapRow(ResultSet rs, int rownumber) throws SQLException {
				Student e = new Student();
				e.setStudentId(rs.getInt(1));
				e.setStudentName(rs.getString(2));
				return e;
			}
		});
	}


}