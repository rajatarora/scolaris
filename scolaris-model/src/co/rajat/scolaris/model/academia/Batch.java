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

import java.time.LocalDate;

/**
 * Describes a single Batch of a particular Course. E.g. MCA Batch of 2016.
 * 
 * @see Course
 * 
 * @author Rajat Arora
 * @version 1.0
 * @since 1.0
 */
public class Batch {

	/** The system generated unique ID of the Batch. */
	public String id;
	
	/** The unique name of the Batch. Template: "<Course> Batch of <YearOfEndDate>" */ //TODO: Do it in constructor
	public String name;
	
	/** The start date of the Batch. */
	public LocalDate startDate;
	
	/** The end date of the Batch. */ //TODO: Generate in constructor using CourseDuration
	public LocalDate endDate;
	
	/** The Course the Batch belongs to. */
	public Course course;
	
	/** The number of all students in a Batch. */
	public int strength;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (!(obj instanceof Batch)) return false;
		Batch other = (Batch) obj;
		if (course == null) {
			if (other.course != null) return false;
		}
		else if (!course.equals(other.course)) return false;
		if (id == null) {
			if (other.id != null) return false;
		}
		else if (!id.equals(other.id)) return false;
		if (startDate == null) {
			if (other.startDate != null) return false;
		}
		else if (!startDate.equals(other.startDate)) return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Batch [");
		if (id != null) builder.append("id=").append(id).append(", ");
		if (name != null) builder.append("name=").append(name);
		builder.append("]");
		return builder.toString();
	}
	
	
}
