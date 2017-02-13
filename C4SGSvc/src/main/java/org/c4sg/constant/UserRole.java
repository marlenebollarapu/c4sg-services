package org.c4sg.constant;

import java.util.Optional;

public enum UserRole {

    VOLUNTEER("V"), ORGANIZATION("O"), C4SG_ADMIN("C"), C4SG_DEVELOPER("D");

    private String value;

    UserRole(String value) {
        this.value = value;
    }
    
	public String getValue(){
		return value;
	}

    public static String getUserRole(String role) {
        if(!Optional.ofNullable(role).isPresent()) 
        {
            return VOLUNTEER.name();
        }
        else
        {
    		for (UserRole e : UserRole.values()) {
    			if (e.getValue() == role)
    			{
    				return e.name();
    			}	
    		}
    		return VOLUNTEER.name();
        }
     }

    @Override
    public String toString() {
        return value;
    }
}
