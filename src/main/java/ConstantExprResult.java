public class ConstantExprResult {

    boolean BadFlags(int flags ) {
        // 
		int someBits = 0;
		int FLAG = 1;
		boolean rc = true;
		
		if ((flags | FLAG) != 0) // Defect: always true
			rc = true;
		if ((someBits & 0x10) == 1) // Defect: always false
			rc = false;
		return rc;
    }
}
