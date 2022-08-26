AccountNotFoundException.java

package com.exception;

public class AccountNotFoundException extends Exception{
public String toString() {
return "Account is not found";
}
}




MobileNumberException.java

package com.exception;

public class MobileNumberException extends Exception{
public String toString() {
return "mobile number should be in digits and should not be lessthan 10 digits";
}
}




PasswordMismatchException.java

package com.exception;

public class PasswordMismatchException extends Exception{
public String toString() {
return "password and confirm password must be same";
}
}