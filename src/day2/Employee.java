package day2;

public class Employee {
	//Data members 
       int eid;
       String ename;
       String city;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	} 
	@Override
	public String toString() {
		return "Employee [Id=" + eid + ", ename=" + ename + ", city=" + city + "]";
	}
      
}
