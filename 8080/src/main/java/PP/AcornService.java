package PP;

import java.util.ArrayList;

public class AcornService {
	AcornDAO dao = new AcornDAO();
	
	public ArrayList<Acorn> getMemberReal(){
		
		ArrayList<Acorn> list = dao.selectAll();
		
		return list;
		
	}
	
	
	
	
	
}
