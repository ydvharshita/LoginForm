package DAO;

public class Customer 
{
		public int userid;
		public String pwd;
		public String str_fname;
		public String str_lname;
		public int cntry;
		public String gender;
		public String edu;
		
		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		public String getStr_fname() {
			return str_fname;
		}
		public void setStr_fname(String str_fname) {
			this.str_fname = str_fname;
		}
		public String getStr_lname() {
			return str_lname;
		}
		public void setStr_lname(String str_lname) {
			this.str_lname = str_lname;
		}
		public int getCntry() {
			return cntry;
		}
		public void setCntry(int cntry) {
			this.cntry = cntry;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getEdu() {
			return edu;
		}
		public void setEdu(String edu) {
			this.edu = edu;
		}
		
		
}
