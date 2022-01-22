
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String,String> nameMap = new HashMap<>();
        nameMap.put("matthew","matt");
        nameMap.put("michael", "mix");
        nameMap.put("arthur", "artie");
        System.out.println(nameMap.get("matthew"));
    }

}
