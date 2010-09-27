/*Comic MarketMap	*/
import java.io.*;
import java.util.*;


public class Map {
	/*configure*/
	//map size
	final int iMapWidth = 20;
	final int iMapHeight = 20;
	//map filename
	final String strFileName ="mapfile.csv";
	
	
	/*instance*/
	//map状態:0通路、1出入口、2ブース、3壁
	private int iMapState[][] = new int[iMapHeight][iMapWidth];
	
	/***method***/
	/*Load Map pattern*/
	public int loadMap(){
		/*fileOpen*/
		try {
			FileReader frMapfile = new FileReader(strFileName);
			BufferedReader brMapfile = new BufferedReader(frMapfile);
			String strMapLine;
			while ((strMapLine = brMapfile.readLine()) != null){
				/**ファイル解析**/
				StringTokenizer stkMapLine = new StringTokenizer(strMapLine,",");
				//コメント行識別
				String strDived = stkMapLine.nextToken();
				if(strDived != "#"){
					//y座標
					int iMapiny = Integer.parseInt(strDived);
					
					//x座標
					int iMapinx = Integer.parseInt(stkMapLine.nextToken());
					
					//マップ状態
					iMapState[iMapiny][iMapinx] = Integer.parseInt(stkMapLine.nextToken());
				}
				
			}
					
		} catch (Exception e) {
			System.out.println("File read failed.\n");
		}
		
		
		return 0;
	}
	
	/**x方向の長さを返す **/
	public int mapWidth(){
		return this.iMapWidth;
	}
	
	/**y方向の長さを返す **/
	public int mapHeight(){
		return this.iMapHeight;
	}
	
	/**マップ状態を返す**/
	public int mapState(int iHeight,int iWidth){
		return this.iMapState[iHeight][iWidth];
	}
	
	/**ドアの位置を返す**/
	public void mapDoorPoint(MapPoint mapDoor[]){
		//あとで作るって…。
		mapDoor[0].x = 6;
		mapDoor[0].y = 12;
	}
	
	
	
}
