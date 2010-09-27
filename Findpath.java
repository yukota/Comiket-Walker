
public class Findpath {
	//データ
	final int iGoalNum=3;
	final int iDoor = 1;
	public Findpath(Map mapData,MapPoint mpGoal[]){
		//ゴールポイントの検索
		

		//出入口の確認
		MapPoint [] mpDoor = new MapPoint[1];
		mapData.mapDoorPoint(mpDoor);
		
		//出入口から各ポイントへの距離
		for(int iLoopDoor = 0 ;iLoopDoor < iDoor;iLoopDoor++){
			for(int iLoopGoal = 0;iLoopGoal < iGoalNum;iLoopGoal++){
				//距離演算
				
				
			}
			
		}
		
		//各ポイントから各ポイントへの距離
		
	}
	
	
	private double dijkstra(MapPoint mpStart,MapPoint mpEnd){
	
		return 
	}

}
