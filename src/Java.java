import java.util.Scanner;

public class Java extends Tcg{


    public void setvalue(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter usergfg name");
        String name_user=sc.nextLine();

        System.out.println("Enter user code");
        String name_code=sc.nextLine();
        System.out.println("Enter user id");
        int name_id=sc.nextInt();
new Tcg(name_user,name_id,name_code).show_detail();
    }
}
