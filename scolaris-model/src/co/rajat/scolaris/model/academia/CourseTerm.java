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

import java.util.List;

/**
 * Describes the contents of one of the Academic Terms prescribed in a Course.
 * 
 * @see AcademicTerm
 * @see Course
 * 
 * @author Rajat Arora
 * @version 1.0
 * @since 1.0
 */
public class CourseTerm {

	/** The system generated unique ID of the CourseTerm. */
	String id;
	
	/** The unique name of the CourseTerm. */
	String name;
	
	/** The sequence number of the CourseTerm in a Course. */
	int termNumber;
	
	/** The list of Subjects prescribed in the Course Term. */
	List<Subject> subjects;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + termNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (!(obj instanceof CourseTerm)) return false;
		CourseTerm other = (CourseTerm) obj;
		if (id == null) {
			if (other.id != null) return false;
		}
		else if (!id.equals(other.id)) return false;
		if (name == null) {
			if (other.name != null) return false;
		}
		else if (!name.equals(other.name)) return false;
		if (termNumber != other.termNumber) return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CourseTerm [");
		if (id != null) builder.append("id=").append(id).append(", ");
		if (name != null) builder.append("name=").append(name).append(", ");
		builder.append("termNumber=").append(termNumber).append("]");
		return builder.toString();
	}
	
	
}
