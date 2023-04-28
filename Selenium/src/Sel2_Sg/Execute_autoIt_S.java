package Sel2_Sg;

public class Execute_autoIt_S {

	public static void main(String[] args) {
		exexuteScript();
	
	
	}
private static void exexuteScript() {
	try {
		Runtime runtime=Runtime.getRuntime();
		runtime.exec("E:\\AutoIT\\TestS1_autoit.exe");
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
		

