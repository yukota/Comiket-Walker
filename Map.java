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
	//map���:0�ʘH�A1�o�����A2�u�[�X�A3��
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
				/**�t�@�C�����**/
				StringTokenizer stkMapLine = new StringTokenizer(strMapLine,",");
				//�R�����g�s����
				String strDived = stkMapLine.nextToken();
				if(strDived != "#"){
					//y���W
					int iMapiny = Integer.parseInt(strDived);
					
					//x���W
					int iMapinx = Integer.parseInt(stkMapLine.nextToken());
					
					//�}�b�v���
					iMapState[iMapiny][iMapinx] = Integer.parseInt(stkMapLine.nextToken());
				}
				
			}
					
		} catch (Exception e) {
			System.out.println("File read failed.\n");
		}
		
		
		return 0;
	}
	
	/**x�����̒�����Ԃ� **/
	public int mapWidth(){
		return this.iMapWidth;
	}
	
	/**y�����̒�����Ԃ� **/
	public int mapHeight(){
		return this.iMapHeight;
	}
	
	/**�}�b�v��Ԃ�Ԃ�**/
	public int mapState(int iHeight,int iWidth){
		return this.iMapState[iHeight][iWidth];
	}
	
	/**�h�A�̈ʒu��Ԃ�**/
	public void mapDoorPoint(MapPoint mapDoor[]){
		//���Ƃō����āc�B
		mapDoor[0].x = 6;
		mapDoor[0].y = 12;
	}
	
	
	
}
