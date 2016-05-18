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
package co.rajat.scolaris.model.academia;

import co.rajat.scolaris.model.users.Teacher;

/**
 * Describes a particular Class of a particular Subject of a particular Batch. E.g. Java Class for MCA Batch of 2016
 * 
 * @see Batch
 * @see Subject
 * @see Teacher
 * @see Section
 * 
 * @author Rajat Arora
 * @version 1.0
 * @since 1.0
 */
public class Class {

	/** The system generated unique ID of the Class. */
	public String id;
	
	/** The unique name of the Class. Template: "<Subject> Class for <Batch>" */ //TODO: Do it in constructor.
	public String name;
	
	/** The Section to which the Class belongs to. */
	public Section section;
	
	/** The Subject taught in the Class. */
	public Subject subject;
	
	/** The Teacher assigned to the Class. */
	public Teacher teacher;
	
	/** The Duration of this Class. */
	public ClassDuration classDuration;
	
	/** The Room in which the Class takes place. */
	public Room room;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (!(obj instanceof Class)) return false;
		Class other = (Class) obj;
		if (id == null) {
			if (other.id != null) return false;
		}
		else if (!id.equals(other.id)) return false;
		if (name == null) {
			if (other.name != null) return false;
		}
		else if (!name.equals(other.name)) return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Class [");
		if (id != null) builder.append("id=").append(id).append(", ");
		if (name != null) builder.append("name=").append(name);
		builder.append("]");
		return builder.toString();
	}
	
	
}
