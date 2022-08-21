/*Email Verification :
All Email addresses should include : x@y.com
-1 to 20 lowercase and or uppercase letters, numbers, _ and - (1)
-An @ symbol (2)
-2 to 20 lowercase and uppercase letters and numbers(3)
-An . character(4)
-2 to 3 lowercase and uppercase letters(5)

1. We use \w to validate the (1)
\w includes characters, numbers,and underscore.
We need to add - character to the pattern too.
So, the pattern for (1) should be [\w-]{1,20}

2. We add @ symbol into the pattern for (2)
3. We add \w{2,20} into the pattern for (3)
4. We add \. into the pattern for (4)
5. We add \w{2,3}$ into the pattern for(5)
   The $ says that after (5), there is no more character.

   --> The Pattern should be : [\w-]{1,20}@\w{2,20}\.\w{2,3}$
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailValidation {
    //To check whether entered email is valid or not
    public static boolean EmailIsValid(String temail) {
        String regex = "[\\w-]{1,20}@\\w{2,20}\\.\\w{2,3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher mathcer = pattern.matcher(temail);

        return mathcer.matches();
    }

}

