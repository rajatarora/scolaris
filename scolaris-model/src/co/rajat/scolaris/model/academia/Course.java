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

import javax.money.MonetaryAmount;

/**
 * The Course class describes an integrated course of academic studies. The course belongs to a particular Department of 
 * an Institution, contains a number of CourseTerms of a particular CourseDuration, and describes the fee and allowed
 * grace marks.
 * 
 * @see Institution
 * @see Department
 * @see CourseTerm
 * @see CourseDuration
 * 
 * @author Rajat Arora
 * @version 1.0
 * @since 1.0
 */
public class Course {

	/** The system generated unique ID of the course. */
	String id;
	
	/** The name of the Course. Unique within an institution. */
	String name;
	
	/** The Department this Course belongs to. */
	Department department;
	
	/** The maximum grace marks allowed per term of the Course. */
	int grace;
	
	/** The Course fee, per term. */
	MonetaryAmount feePerTerm;
	
	/** The list of all terms in the Course. */
	List<CourseTerm> courseTerms;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (!(obj instanceof Course)) return false;
		Course other = (Course) obj;
		if (id == null) {
			if (other.id != null) return false;
		}
		else if (!id.equals(other.id)) return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Course [");
		if (id != null) builder.append("id=").append(id).append(", ");
		if (name != null) builder.append("name=").append(name);
		builder.append("]");
		return builder.toString();
	}
	
}
