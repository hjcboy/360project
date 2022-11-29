import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class UserProfile implements Serializable {

    private String tagName;

    private String email;

    public UserProfile(String tagName, String email){
        this.tagName = tagName;
        this.email = email;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  tagName + " " + email;
    }

    public void Export(){
        ObjectOutputStream oos = null;
        FileOutputStream fout = null;
        try{
            fout = new FileOutputStream("C:\\Users\\masga\\Downloads\\FirstSpring\\Iteration\\src\\profile.txt");
            oos = new ObjectOutputStream(fout);
        }catch (Exception e){

        }
        finally {
            if(oos !=null){
                try {
                    oos.close();
                }catch(Exception e){

                }
            }
        }
    }
    public static void main(String [] args){
        UserProfile user = new UserProfile("Author", "Author@gmail.com");
        user.Export();
    }
}
