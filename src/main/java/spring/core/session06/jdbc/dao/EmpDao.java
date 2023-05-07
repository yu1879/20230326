package spring.core.session06.jdbc.dao;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import spring.core.session06.jdbc.entity.Emp;

public interface EmpDao {
	List<Map<String, Object>> queryAll();

	List<Emp> queryEmps();

	Optional<Emp> getOne(Integer eid);

	Integer count();

	int create(String ename, Integer age);

	int[] batchCreate(List<Object[]> list);

	int update(Integer eid, String ename, Integer age);

	int delete(Integer eid);
}
