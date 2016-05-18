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
 * Describes one of the various Academic Terms supported by the system.
 */
public class AcademicTerm {

	/** The system generated unique ID of the AcademicTerm. */
	String id;
	
	/** The unique name of the AcademicTerm. */
	String name;
	
	/** The duration in days of the AcademicTerm. */
	int durationInDays;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + durationInDays;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (!(obj instanceof AcademicTerm)) return false;
		AcademicTerm other = (AcademicTerm) obj;
		if (durationInDays != other.durationInDays) return false;
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
		builder.append("AcademicTerm [");
		if (id != null) builder.append("id=").append(id).append(", ");
		if (name != null) builder.append("name=").append(name).append(", ");
		builder.append("durationInDays=").append(durationInDays).append("]");
		return builder.toString();
	}
	
	
}
