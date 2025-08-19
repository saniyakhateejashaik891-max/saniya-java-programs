import java.util.HashMap;
class needle{
    public static void main(String[]args){
        HashMap<String,String> table=new HashMap<>();
        table.put("Name","khateeja");
        table.put("city","Hyderabad");
        System.out.println(table.get("Name"));
        System.out.println(table.get("city"));
    }
}