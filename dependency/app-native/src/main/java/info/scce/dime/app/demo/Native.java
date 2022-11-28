package info.scce.dime.app.demo;

/**
 * Collection of static methods for native SIBs
 */
public class Native {
	
	public static void sayHello(String name) {
		System.out.println("---------------------");
		System.out.println("  Hello " + name + "!");
		System.out.println("---------------------");
	}
	public static void grid() {
		Long[] columns = new columns[7];
		Long[] rows = new rows[6];	
		for(int i = 0;i<7;i++) {
			for(int j = 0;j<;j++) {
				arr[i][j] = 0l;
			}
		}
	}
/*
	public static void insert(Board board, Long player, Long index){
		List<cell>cells = board.getcolumns_Column().get(index.intValue()).getCells_Cell();
		for(int i = cells.size()- 1;i>=0;i++) {
			Cell thisCell = cells.get(i);
			if(thisCell.getValue().equals(0l)) {
				thisCell.setvalue(player);
				break;
			}
		}
	}
*/
	public static void insert(Long row, Long column,Long[][] arr,boolean turn){
		Long s;
		if(turn) {
			s = 1l;
		}
		else {
			s = 2l;
		}
		arr[row.intValue()][column.intValue()] = s;
		turn = !turn;
	}
	public static boolean checkWin(boolean turn,Long[][] arr) {
		if((horizontalWin(turn,arr))||(verticalWin(turn,arr))||(positiveDiagonalWin(turn,arr))||(negativeDiagonalWin(turn,arr))){
			return true;
		}else {
			return false;
		}
	}
	public static boolean horizontalWin(boolean turn, Long[][]arr) {
		int s;
		if(turn) {
			s = 1;
		}
		else {
			s = 2;
		}
		for(int i = 0;i<4;i++) {
			for(int j = 0;j<6;j++) {
				if((arr[i][j] == s) && (arr[i+1][j] == s) && (arr[i+2][j] == s) && (arr[i+3][j] == s)) {
					return true;
				}
			}
		}return false;
		
	}
	public static boolean verticalWin(boolean turn, Long[][]arr) {
		int s;
		if(turn) {
			s = 1;
		}
		else {
			s = 2;
		}
		for(int i = 0;i<7;i++) {
			for(int j = 0;j<3;j++) {
				if((arr[i][j] == s) && (arr[i][j+1] == s) && (arr[i][j+2] == s) && (arr[i][j+3] == s)) {
					return true;
				}
			}
		}return false;
		
	}
	public static boolean positiveDiagonalWin(boolean turn, Long[][]arr) {
		int s;
		if(turn) {
			s = 1;
		}
		else {
			s = 2;
		}
		for(int i = 0;i<4;i++) {
			for(int j = 3;j<7;j++) {
				if((arr[i][j] == s) && (arr[i+1][j+1] == s) && (arr[i+2][j+2] == s) && (arr[i+3][j+3] == s)) {
					return true;
				}
			}
		}return false;
		
	}
	public static boolean negativeDiagonalWin(boolean turn, Long[][]arr) {
		int s;
		if(turn) {
			s = 1;
		}
		else {
			s = 2;
		}
		for(int i = 0;i<4;i++) {
			for(int j = 0;j<3;j++) {
				if((arr[i][j] == s) && (arr[i-1][j-1] == s) && (arr[i-2][j-2] == s) && (arr[i-3][j-3] == s)) {
					return true;
				}
			}
		}return false;
		
	}
}