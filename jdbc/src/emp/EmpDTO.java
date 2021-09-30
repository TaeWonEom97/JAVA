package emp;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor


public class EmpDTO {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;
//	public EmpDTO() {
//		super();
//		this.empno = empno;
//		this.ename = ename;
//		this.job = job;
//		this.mgr = mgr;
//		this.hiredate = hiredate;
//		this.sal = sal;
//		this.comm = comm;
//		this.deptno = deptno;
//	}
//	public int getEmpno() {
//		return empno;
//	}
//	public String getEname() {
//		return ename;
//	}
//	public String getJob() {
//		return job;
//	}
//	public int getMgr() {
//		return mgr;
//	}
//	public Date getHiredate() {
//		return hiredate;
//	}
//	public int getSal() {
//		return sal;
//	}
//	public int getComm() {
//		return comm;
//	}
//	public int getDeptno() {
//		return deptno;
//	}
//	public void setEmpno(int empno) {
//		this.empno = empno;
//	}
//	public void setEname(String ename) {
//		this.ename = ename;
//	}
//	public void setJob(String job) {
//		this.job = job;
//	}
//	public void setMgr(int mgr) {
//		this.mgr = mgr;
//	}
//	public void setHiredate(Date hiredate) {
//		this.hiredate = hiredate;
//	}
//	public void setSal(int sal) {
//		this.sal = sal;
//	}
//	public void setComm(int comm) {
//		this.comm = comm;
//	}
//	public void setDeptno(int deptno) {
//		this.deptno = deptno;
//	}

	
	
}
