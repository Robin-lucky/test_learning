import java.util.Optional;

/**
 * @author Robin
 * @date 2023/5/27
 */
public class OptionalDemo {
    public static void main(String[] args) {
        Optional<Member> optional = getMemberByIdFromDB();
        optional.ifPresent(member -> {
            System.out.println("会员姓名是："+ member.getName());
        });
    }

    public static Optional<Member> getMemberByIdFromDB() {
        boolean hasName = true;
        if(hasName){
            return Optional.of(new Member());
        }
        return Optional.empty();
    }
}
class Member{
    private String name;
    public String getName(){
        return name;
    }
}
