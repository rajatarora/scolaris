/*
 * Copyright 2016 Rajat Arora
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package co.rajat.scolaris.model.users;

import java.time.LocalDate;

import co.rajat.scolaris.model.academia.Section;

/**
 * Represents a particular Student of an Institution.
 * 
 * @author Rajat Arora
 * @version 1.0
 * @since 1.0
 */
public class Student extends Person {
	
	/** The admission number of the Student. */
	public String admissionNumber;
	
	/** The roll number of the Student. */
	public String rollNumber;
	
	/** The section the Student belongs to. */
	public Section section;
	
	/** The date of admission of the Student. */
	public LocalDate dateOfAdmission;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((admissionNumber == null) ? 0 : admissionNumber.hashCode());
		result = prime * result + ((dateOfAdmission == null) ? 0 : dateOfAdmission.hashCode());
		result = prime * result + ((rollNumber == null) ? 0 : rollNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!super.equals(obj)) return false;
		if (!(obj instanceof Student)) return false;
		Student other = (Student) obj;
		if (admissionNumber == null) {
			if (other.admissionNumber != null) return false;
		}
		else if (!admissionNumber.equals(other.admissionNumber)) return false;
		if (dateOfAdmission == null) {
			if (other.dateOfAdmission != null) return false;
		}
		else if (!dateOfAdmission.equals(other.dateOfAdmission)) return false;
		if (rollNumber == null) {
			if (other.rollNumber != null) return false;
		}
		else if (!rollNumber.equals(other.rollNumber)) return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [");
		if (admissionNumber != null) builder.append("admissionNumber=").append(admissionNumber).append(", ");
		if (rollNumber != null) builder.append("rollNumber=").append(rollNumber).append(", ");
		if (id != null) builder.append("id=").append(id).append(", ");
		if (username != null) builder.append("username=").append(username);
		builder.append("]");
		return builder.toString();
	}
	
	
}
