package br.com.cassunde.project.validations;

import java.util.List;

import br.com.cassunde.project.entity.Member;
import br.com.cassunde.project.entity.Project;

public class ValidProjects {

		/**
		 * This method find members under the age of 14
		 * 
		 * @param Project to validate
		 * @return false when found member 
		 */
		public boolean membersValids(Project project ) {
		
				List<? extends Member> members = project.getMembers();
				
				if( members.size() == 0 ) {
						System.err.println("Project with empty members");
				}
				
				for( Member member : members ) {
					
						if( member.getAge() < 14 ) {
								System.err.println("Project with member under age of 14");								
								return false;
						}else {
								return true;
						}
				}
				
				return false;
		} 
}
