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

import javax.money.MonetaryAmount;

/**
 * Represents a particular Employee of an Institution.
 * 
 * @author Rajat Arora
 * @version 1.0
 * @since 1.0
 */
public class Employee extends Person {

	/** The date at which the Employee joined. */
	public LocalDate dateOfJoining;
	
	/** The salary of the Employee. */
	public MonetaryAmount salary;
	
	/** The designation of the Employee. */
	public Designation designation;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!super.equals(obj)) return false;
		if (!(obj instanceof Employee)) return false;
		Employee other = (Employee) obj;
		if (designation == null) {
			if (other.designation != null) return false;
		}
		else if (!designation.equals(other.designation)) return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [");
		if (designation != null) builder.append("designation=").append(designation).append(", ");
		if (id != null) builder.append("id=").append(id).append(", ");
		if (username != null) builder.append("username=").append(username);
		builder.append("]");
		return builder.toString();
	}
	
	
}
