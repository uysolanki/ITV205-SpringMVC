package com.itv.model;

import java.util.Arrays;

public class Student {
		private int rno;
		private String sname;
		private String gender;
		private String[] skills;
		public Student() {}
		public Student(int rno, String sname, String gender, String[] skills) {
			this.rno = rno;
			this.sname = sname;
			this.gender = gender;
			this.skills = skills;
		}
		public int getRno() {
			return rno;
		}
		public void setRno(int rno) {
			this.rno = rno;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String[] getSkills() {
			return skills;
		}
		public void setSkills(String[] skills) {
			this.skills = skills;
		}
		@Override
		public String toString() {
			return "Student [rno=" + rno + ", sname=" + sname + ", gender=" + gender + ", skills="
					+ Arrays.toString(skills) + "]";
		}
		
		
		
}
