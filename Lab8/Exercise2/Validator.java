package Lab8.Exercise2;

import static java.lang.Character.*;

public class Validator {
    public static boolean isValidRegistrationNumber(String regNumber) {
        if (regNumber.length() >= 6 && regNumber.length() <= 12)
        {
            if (isDigit(regNumber.charAt(0)) && isDigit(regNumber.charAt(1)))
            {
                if (regNumber.charAt(2) == '-')
                {
                    if (isUpperCase(regNumber.charAt(3)) && (isUpperCase(regNumber.charAt(4)) && regNumber.charAt(5) == '-') ||
                            isUpperCase(regNumber.charAt(3)) && regNumber.charAt(4) == '-' && isDigit(regNumber.charAt(5)))
                    {
                        int j;

                        for (j = 6; j < regNumber.length(); j++)
                            if (!isDigit(regNumber.charAt(j)))
                                break;
                            if (j == regNumber.length())
                                return true;

                    }
                }
            }
        }
        return false;
    }
}












/*for(int i=0; i<regNumber.length(); i++)
        if(regNumber.charAt(0) &&)*/