
public class Four {
    public static char genExp(String s){
		return s.charAt(0);
	}
	public static void handleExp(String s){
		try{
			char res = genExp(s);
			System.out.println(res);
		}catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
	}
    public static void main(String[] args) {
 
        String s = null;
		//Four.genExp(s);
        Four.handleExp(s);
      
    }
}
