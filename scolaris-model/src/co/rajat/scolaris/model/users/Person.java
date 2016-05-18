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

import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;

/**
 * Describes a single Person using Scolaris. Every Person is a User. The class holds the personal details of a Person 
 * associated with Scolaris.
 * 
 * @see User
 * 
 * @author Rajat Arora
 * @version 1.0
 * @since 1.0
 */
public class Person extends User {

	/** The first name. */
	String firstName;
	
	/** The last name. */
	String lastName;
	
	/** The photo path. */
	Path photoPath; 
	
	/** The address. */
	Address address; 
	
	/** The date of birth. */
	LocalDate dateOfBirth;
	
	/** The phone numbers. */
	List<String> phoneNumbers; //TODO: number tagging - home, mobile etc.

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!super.equals(obj)) return false;
		if (!(obj instanceof Person)) return false;
		Person other = (Person) obj;
		if (firstName == null) {
			if (other.firstName != null) return false;
		}
		else if (!firstName.equals(other.firstName)) return false;
		if (lastName == null) {
			if (other.lastName != null) return false;
		}
		else if (!id.equals(other.id)) return false;
		if (id == null) {
			if (other.id != null) return false;
		}
		else if (!id.equals(other.id)) return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [");
		if (firstName != null) builder.append("firstName=").append(firstName).append(", ");
		if (lastName != null) builder.append("lastName=").append(lastName).append(", ");
		if (id != null) builder.append("id=").append(id).append(", ");
		if (username != null) builder.append("username=").append(username);
		builder.append("]");
		return builder.toString();
	}
	
	
}
