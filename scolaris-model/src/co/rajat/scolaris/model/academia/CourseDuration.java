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

/**
 * The Class CourseDuration describes the number of AcademicTerms a particular Course contains.
 * 
 * @see AcademicTerm
 * @see Course
 * 
 * @author Rajat Arora
 * @version 1.0
 * @since 1.0
 */
public class CourseDuration {

	/** The system generated unique ID of the CourseDuration. */
	String id;
	
	/** The AcademicTerm the Course is divided into. */
	AcademicTerm term;
	
	/** The number of AcademicTerms the Course contains. */
	int numberOfTerms;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + numberOfTerms;
		result = prime * result + ((term == null) ? 0 : term.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (!(obj instanceof CourseDuration)) return false;
		CourseDuration other = (CourseDuration) obj;
		if (id == null) {
			if (other.id != null) return false;
		}
		else if (!id.equals(other.id)) return false;
		if (numberOfTerms != other.numberOfTerms) return false;
		if (term == null) {
			if (other.term != null) return false;
		}
		else if (!term.equals(other.term)) return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CourseDuration [");
		if (id != null) builder.append("id=").append(id).append(", ");
		if (term != null) builder.append("term=").append(term).append(", ");
		builder.append("numberOfTerms=").append(numberOfTerms).append("]");
		return builder.toString();
	}
	
	
}
