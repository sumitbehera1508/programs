/* 9. Develop a class to perform the following tasks on a line of text 
        a. Count the number of words in the text 
        b. Searches a particular string in the text 
        c. Checks if the text is a palindrome 
*/
public class exp9 {
    public static void main(String[] args) {
        StringOperation s1 = new StringOperation("1234554321");
        System.out.println("length : "+s1.size());
        System.out.println(s1.isPalindrome());
        if(s1.cheak("23")){
            System.out.println("it is a subString");
        }
        else{
            System.out.println("it is not a subString");
        }
    }
}

class StringOperation{
    private String given ;

    StringOperation(String given){
        this.given=given;
    }
    StringOperation(){
        this("");
    }

    public int size(){
        return given.length();
    }

    public boolean cheak(String temp){
        if(temp.length()>given.length()) return false;
        int i=0,j=0,n=given.length(),m=temp.length();
        while(i<n && j<m){
            while(i<n && j<m && given.charAt(i)==temp.charAt(j)){
                i++;j++;
            }
            if(j==m) return true;
            else j=0;
        }
        return false;
    }

    public boolean isPalindrome(){
        int i=0,j=given.length();
        j--;
        while(i<j){
            if(given.charAt(i)!=given.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }
}