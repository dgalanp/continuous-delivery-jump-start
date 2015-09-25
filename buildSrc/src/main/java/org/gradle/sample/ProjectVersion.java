package org.gradle.sample;

public class ProjectVersion {
	final int major, minor, build;
	public ProjectVersion(int mayor, int minor, int build) {
		this.major=mayor;
		this.minor=minor;
		this.build=build;

	}
	
	public String toString() {
		String fullVersion="";
		fullVersion+=major;
		fullVersion+=("."+minor);
		fullVersion+=("."+build);
		return fullVersion;
	}
	
}