public class Tcg {
    private String code;
    private int id;
    private String name;

    public Tcg(String name, int id, String code) {
        this.code = code;
        this.id = id;
        this.name = name;
    }
Tcg(){

}
    void show_detail(){
        System.out.println("Candi nam : "+name);
        System.out.println("Candidate id :"+id);
        System.out.println("Condidate code :"+code);
    }

}
