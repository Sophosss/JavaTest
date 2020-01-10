package leetcode;

import java.util.*;

class Employee {
	// It's the unique id of each node;
	// unique id of this employee
	public int id;
	// the importance value of this employee
	public int importance;
	// the id of direct subordinates
	public List<Integer> subordinates;
}
public class EmployeeImportance {
	public int getImportance(List<Employee> employees, int id) {
		int res = 0;
		Map<Integer, Employee> map = new HashMap<>();
		for(Employee e : employees) map.put(e.id, e);
		LinkedList<Integer> queue = new LinkedList<>();
		queue.add(id);
		while (!queue.isEmpty()){
			int tmp = queue.poll();
			res += map.get(tmp).importance;
			queue.addAll(map.get(tmp).subordinates);
		}
		return res;
	}
}
